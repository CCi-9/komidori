
function getUnReadNote(){
    	$.ajax({
            url: "http://" + host + "/Admin/getNote",
            method: "get",
            xhrFields: {
                withCredentials: true  //带上cookie信息，解决sessionid不一致
            },
            success: function (result) {
            	 if(result.status == "401"){
            	 		alert("session过期，请重新登录");
            	 		window.location.href = 'ad_signin.html'
            	 		return;
            	 }
            	 else if(result.status == "400"){
            	 		console.log("未读消息获取失败。");
            	 		return;
            	 }
            	 else{//200
            	 	 	console.log(result)
                	return result.data;
            	 }
               
            }
        });
    }