package com.doctor.komidori_doctor.utils;

import org.springframework.web.socket.BinaryMessage;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.*;
import java.nio.ByteBuffer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Test {
    public final static List<WebSocketSession> sessionList = Collections.synchronizedList(new ArrayList<WebSocketSession>());
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    FileOutputStream output;
    public static void main(String[] args) {
        System.out.println(LocalDateTime.now());
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
    }


    public void handleTextMessage(WebSocketSession websocketsession, TextMessage message)
    {
        String payload=message.getPayload();
        String textString;
        try {
            if(payload.endsWith(":fileStart")){
                output=new FileOutputStream(new File("D:\\images\\"+payload.split(":")[0]));
            }else if(payload.endsWith(":fileFinishSingle")){
                output.close();
                String fileName=payload.split(":")[0];
                for(WebSocketSession session:sessionList){
                    if(session.getId().equals(websocketsession.getId())){
                        textString=" I ("+format.format(new Date())+")<br>";
                    }else{
                        textString=websocketsession.getAttributes().get("user")+" ("+format.format(new Date())+")<br>";
                    }
                    TextMessage textMessage = new TextMessage(textString);
                    session.sendMessage(textMessage);
                    sendPicture(session,fileName);
                }
            }else if(payload.endsWith(":fileFinishWithText")){
                output.close();
                String fileName=payload.split(":")[0];
                for(WebSocketSession session:sessionList){
                    sendPicture(session,fileName);
                }
            }else{
                for(WebSocketSession session: sessionList){
                    if(session.getId().equals(websocketsession.getId())){
                        textString=" I ("+format.format(new Date())+")<br>"+payload;
                    }else{
                        textString=websocketsession.getAttributes().get("user")+" ("+format.format(new Date())+")<br>"+payload;
                    }
                    TextMessage textMessage = new TextMessage(textString);
                    session.sendMessage(textMessage);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleBinaryMessage(WebSocketSession session, BinaryMessage message)
    {
        ByteBuffer buffer= message.getPayload();
        try {
            output.write(buffer.array());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void handleTransportError(WebSocketSession webSocketSession, Throwable throwable) throws Exception {
        if(webSocketSession.isOpen()){
            webSocketSession.close();
        }
        System.out.println(throwable.toString());
        System.out.println("WS connection error,close..."+webSocketSession.getRemoteAddress());
    }

    public boolean supportsPartialMessages() {
        return true;
    }

    public void sendPicture(WebSocketSession session,String fileName){
        FileInputStream input;
        try {
            File file=new File("D:\\images\\"+fileName);
            input = new FileInputStream(file);
            byte bytes[] = new byte[(int) file.length()];
            input.read(bytes);
            BinaryMessage byteMessage=new BinaryMessage(bytes);
            session.sendMessage(byteMessage);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
