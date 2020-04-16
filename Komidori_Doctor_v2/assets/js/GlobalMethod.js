//判断用户是否已经登陆
function returnSignin(){
    $.ajax({
        url: "http://" + host + "/index/checkUser",
        method: "get",
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            console.log(result)
            if(result.status != "200"){
                window.location.href = '/Komidori_Doctor_v2/Maternal_Port/signin.html'
            }
        }
    });
}

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
//Admin退出登陆
function logout(){
    	
    	$.ajax({
            url: "http://" + host + "/Admin/Loginout",
            method: "get",
            xhrFields: {
                withCredentials: true  //带上cookie信息，解决sessionid不一致
            },
            success: function (result) {
            	 if(result.status != "200"){
            	 	alert("消除session失败，请重新退出系统");
            	 	return;
            	 }
               	window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html'
               	
            }
        });
}

function getAdminMsg(app) {
        
        $.ajax({
            url: "http://" + host + "/Admin/getMyMsg",
            method: "get",
            xhrFields: {
                withCredentials: true  //带上cookie信息，解决sessionid不一致
            },
            success: function (result) {
            	 if(result.status != "200"){
            	 	alert("admin信息获取失败");
            	 	window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html';
            	 	return;
            	 }
                console.log(result)
                app.admin = result.data;
            }
        });
    }

function getNoteMsg(app){

    	$.ajax({
            url: "http://" + host + "/Admin/getNote",
            method: "get",
            xhrFields: {
                withCredentials: true  //带上cookie信息，解决sessionid不一致
            },
            success: function (result) {
            	 if(result.status == "401"){
            	 		alert("session过期，请重新登录");
            	 		window.location.href = '/Komidori_Doctor_v2/Admin_Port/ad_signin.html'
            	 		return ;
            	 }
            	 else if(result.status == "400"){
            	 		alert("未读消息获取失败。");
            	 		return ;
            	 }
            	 else{//200
            	 	 	console.log(result)
              		app.noteList = result.data;
              		app.noteSize = app.noteList.length;
            	 }
               
            }
        });
    }