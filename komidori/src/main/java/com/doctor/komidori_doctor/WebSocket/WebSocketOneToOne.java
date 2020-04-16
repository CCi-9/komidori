package com.doctor.komidori_doctor.WebSocket;

import net.sf.json.JSONObject;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

@RestController
@ServerEndpoint(value = "/webSocket/{myId}/{status}")
public class WebSocketOneToOne {
    //实现服务端与单一客户端通信的话，可以使用Map来存放，其中Key为用户标识
    private static Map<Integer, WebSocketOneToOne> connections = new ConcurrentHashMap<>();
    private static Map<Integer, WebSocketOneToOne> doctorSpare = new ConcurrentHashMap<>();
    // 与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;
    private Integer fromID;  //发起人的id

    // 判断状态，若是用户则为maternal
    // 医生则有doctor表示在聊天，和otherPage表示登陆但未退出聊天
    private String status;


  /*  private String role;
    private String socketId;
*/

    /**
     * 连接建立成功调用的方法
     *
     * @param session 可选的参数。session为与某个客户端的连接会话，需要通过它来给客户端发送数据
     */
    @OnOpen
    public void onOpen(@PathParam("myId") String myId, @PathParam("status") String status, Session session) {
        this.session = session;
        this.fromID = Integer.valueOf(myId);
        this.status = status;
        System.out.println(fromID);
        System.out.println(this.status);
        if (connections.get(fromID) != null && connections.get(fromID).status.equals("otherPage")) {

            doctorSpare.put(fromID, connections.get(fromID));
            System.out.println("保存旧的医生session");
        }
        connections.put(fromID, this);     //添加到map中

    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {

        if (status.equals("doctor")) {
            status = "otherPage";
            connections.put(fromID, doctorSpare.get(fromID));
            doctorSpare.remove(fromID);
            System.out.println(fromID + "医生已经退出聊天，进入其他界面");
        } else {
            connections.remove(fromID);
            System.out.println(fromID + "用户已经退出");
        }


    }

    /**
     * 收到客户端消息后调用的方法
     *
     * @param message 客户端发送过来的消息
     * @param session 可选的参数
     */
    @OnMessage
    public void onMessage(String message, Session session) throws IOException {
        System.out.println("来自客户端的消息:" + message);
        JSONObject json = JSONObject.fromObject(message);

        String content = null;  //需要发送的信息
        String type = null;  //需要发送的信息
        Integer to = null;      //发送对象的id


       if (json.has("message")) {
            content = (String) json.get("message");
        }
        if (json.has("to")) {
            to = (Integer) json.get("to");  // 要发送的对象id，
        }
        if (json.has("type")) {
            type = (String) json.get("type");  // 发送的类型
        }

        send(content, type, to);
        System.out.println("内容:" + content);
        System.out.println("接收人:" + to);

    //    send(content,to);

/*

        if (type.equals("text")) {
            send(content, to);
        } else {

        }

*/

    }



    /**
     * 发生错误时调用
     *
     * @param session
     * @param error
     */
    @OnError
    public void onError(Session session, Throwable error) {
        System.out.println("发生错误");
        error.printStackTrace();
    }


    //发送给指定角色
    public void send(String content,  String type, Integer to) {
        try {
            //to指定用户
            WebSocketOneToOne con = connections.get(to);
            if (con != null) {
                con.session.getBasicRemote().sendText(fromID + ":" + type + ":" + content);
                System.out.println("消息已发送");
            } else {
                this.session.getBasicRemote().sendText("系统消息：对方暂时不在，请稍后");
            }
            /*
            //from具体用户
            WebSocketOneToOne confrom = connections.get(from);
            if(confrom!=null){
                if(socketId==confrom.socketId||confrom.socketId.equals(socketId)){
                    confrom.session.getBasicRemote().sendText(from+"说："+msg);
                }

            }*/
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


}
