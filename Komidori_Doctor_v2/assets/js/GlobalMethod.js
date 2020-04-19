//时间转换格式
function formatDate(thistime, fmt) {
    let $this = new Date(thistime)
    let o = {
        'M+': $this.getMonth() + 1,
        'd+': $this.getDate(),
        'h+': $this.getHours(),
        'm+': $this.getMinutes(),
        's+': $this.getSeconds(),
        'q+': Math.floor(($this.getMonth() + 3) / 3),
        'S': $this.getMilliseconds()
    }
    if (/(y+)/.test(fmt)) {
        fmt = fmt.replace(RegExp.$1, ($this.getFullYear() + '').substr(4 - RegExp.$1.length))
    }
    for (var k in o) {
        if (new RegExp('(' + k + ')').test(fmt)) {
            fmt = fmt.replace(RegExp.$1, (RegExp.$1.length === 1) ? (o[k]) : (('00' + o[k]).substr(('' + o[k]).length)))
        }
    }
    return fmt
}

//孕产妇**************************************************************
//判断(孕产妇)用户是否已经登陆
function returnSignin() {
    $.ajax({
        url: "http://" + host + "/index/checkUser",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            console.log(result)
            if (result.status != "200") {
                window.location.href = '/Komidori_Doctor_v2/Maternal_Port/signin.html'
            }
        }
    });
}

//管理员端**************************************************************

//判断Admin管理员是否已经登陆
function checkAdmin() {
    $.ajax({
        url: "http://" + host + "/index/CheckAdmin",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            console.log(result)
            if (result.status != "200") {
                alert("session已过期，请重新登陆【checkAdmin】");
                window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html'
                return;
            }
        }
    });
}


//Admin退出登陆
function logout() {

    $.ajax({
        url: "http://" + host + "/Admin/Loginout",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            if (result.status != "200") {
                alert("消除session失败，请重新退出系统");
                return;
            }
            window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html'

        }
    });
}

//获取管理员信息
function getAdminMsg(app) {

    $.ajax({
        url: "http://" + host + "/Admin/getMyMsg",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            if (result.status != "200") {
                //alert("admin信息获取失败");
                //window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html';
                return;
            }
            console.log(result)
            app.admin = result.data;
        }
    });
}

//获取未读短信信息
function getNoteMsg(app) {

    $.ajax({
        url: "http://" + host + "/Admin/getNote",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            if (result.status == "401") {
                //alert("session过期，请重新登说录【getNoteMsg】");
                //window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html'
                return;
            } else if (result.status == "400") {
                alert("未读消息获取失败。");
                return;
            } else {//200
                console.log(result)
                app.noteList = result.data;
                app.noteSize = app.noteList.length;
            }

        }
    });
}

//**************************************************************
//Doctor退出登陆
function logout() {

    $.ajax({
        url: "http://" + host + "/DocPort/Logout",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            if (result.status != "200") {
                alert("消除session失败，请重新退出系统");
                return;
            }
            window.location.href = '/Komidori_Doctor_v2/Doctor_Port/doc_signin.html'

        }
    });
}

//检查医生是否登录
function checkDoctor() {
    $.ajax({
        url: "http://" + host + "/index/CheckDoctor",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            console.log(result)
            if (result.status != "200") {
                alert("session已过期，请重新登陆【CheckDoctor】");
                window.location.href = '/Komidori_Doctor_v2/Doctor_Port/doc_signin.html'
                return;
            }
        }
    });
}

function getDoctorMsg(app) {

    $.ajax({
        url: "http://" + host + "/DocPort/getMyMsg",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            if (result.status != "200") {
                //alert("admin信息获取失败");
                //window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html';
                return;
            }
            console.log(result)
            app.doctor = result.data;
            app.doctorId = result.data.doctorId;

        }
    });
}

function getDoctorMsg2(app, verify) {

    $.ajax({
        url: "http://" + host + "/DocPort/getMyMsg",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            if (result.status != "200") {
                //alert("admin信息获取失败");
                //window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html';
                return;
            }
            console.log(result)
            app.doctor = result.data;
            modal.doctorId =  result.data.doctorId
            if (app.doctor.doctorVerify == 1) {
                $(verify).text("1");
            }
            init();
            doctorGetMsg(app.doctor.doctorId)

        }
    });
}

function init() {
    var status = $("#verify").text();
    //alert(status);
    if (status == 0) {
        $("#online").hide();
        $("#offline").hide();
        $("#course").hide();
    }
}

function getDocNoteMsg(app) {

    $.ajax({
        url: "http://" + host + "/DocPort/email/getNote",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            if (result.status == "401") {
                //alert("session过期，请重新登说录【getNoteMsg】");
                //window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html'
                return;
            } else if (result.status == "400") {
                alert("未读消息获取失败。");
                return;
            } else {//200
                console.log(result)
                app.noteList = result.data;
                app.noteSize = app.noteList.length;
            }

        }
    });
}


function doctorGetMsg(id) {
    let fromId = id;
    let websocket;


    let url = "ws://" + host + "/webSocket/" + fromId + "/" + "otherPage"
    websocket = new WebSocket(url);

    websocket.onopen = function () {
        console.log("医生主界面WebSocket连接成功");
    }


    websocket.onmessage = function (event) {
        console.log("医生主界面", event.data)

        let matID = event.data.split(':')[0];
        $.ajax({
            url: "http://" + host + "/maternal/getMaternalById",
            method: "get",
            data: {
                matID: matID
            },
            xhrFields: {
                withCredentials: true  //带上cookie信息，解决sessionid不一致
            },
            success: function (result) {
                console.log(result)
                let modal1 = $('#call');
                let name = result.data.maternal_nickname;
                modal.maternalId = result.data.maternal_id;
                app.maternalId = result.data.maternal_id;
                //设置模态框中请求咨询的用户名字
                modal1.find("#mat_name").text(name);
                $('#call').modal('show');
                app.messageCount += 1
            }
        });


    }

    function closeWebSocket() {
        websocket.close();
    }


}

function jumpToConsult() {
    app.messageCount = 0
}
