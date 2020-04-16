function doctorGetMsg() {
    let fromId = 20201000;
    let websocket;
    let to = $.query.get("id")
    $(function () {


        let url = "ws://" + host + "/webSocket/" + fromId + "/" + "otherPage"
        websocket = new WebSocket(url);

        websocket.onopen = function () {
            console.log("医生主界面WebSocket连接成功");
        }


        websocket.onmessage = function (event) {
            console.log("医生主界面", event.data)

        }

        function closeWebSocket() {
            websocket.close();
        }


    })
}
