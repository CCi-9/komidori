var phoneReg = /(^1[3|4|5|7|8]\d{9}$)|(^09\d{8}$)/;//手机号正则
var count = 60; //间隔函数，1秒执行
var InterValObj1; //timer变量，控制时间
var curCount1;//当前剩余秒数

/*第一*/
function sendMessage1(phoneId,btnId) {
    var phoneid = phoneId;
    var btnid = btnId;

    curCount1 = count;
    var phone = $.trim($(phoneid).val());//获取手机号码的值
    if (!phoneReg.test(phone)) {
        alert(" 请输入有效的手机号码");
        return false;
    }
    //设置button效果，开始计时
    $(btnid).attr("disabled", "true");
    $(btnid).text( + curCount1 + "秒再获取");
    InterValObj1 = window.setInterval(function(){
        SetRemainTime1(btnId)
    }, 1000); //启动计时器，1秒执行一次
    //向后台发送处理数据------------------
    $.ajax({
        url: "http://" + host + "/maternal/getYZM",
        method: "post",
        data: {
            phone: phone
        },
        crossDomain: true,
        xhrFields: {
            withCredentials: true
        },
        success: function (result) {
            console.log(result)
            if (result.message == "验证码获取失败") {
                alert("验证码获取失败")
            }
        }
    });
    //end--------------------------------
}


/*

function sendMessage1(phoneId, btnId) {
    var phoneid = phoneId;
    var btnid = btnId;
    curCount1 = count;
    var phone = $.trim($(phoneid).val());//获取手机号码的值
    if (!phoneReg.test(phone)) {
        alert(" 请输入有效的手机号码");
        return false;
    }
    //设置button效果，开始计时
    $(btnid).attr("disabled", "true");
    $(btnid).text(+curCount1 + "秒再获取");
    InterValObj1 = window.setInterval(SetRemainTime1(btnid), 1000); //启动计时器，1秒执行一次
    //向后台发送处理数据------------------
    $.ajax({
        url: "http://" + host + "/maternal/getYZM",
        method: "post",
        data: {
            phone: phone
        },
		crossDomain: true,
		xhrFields: {
            withCredentials: true
        },
        success: function (result) {
            console.log(result)
            if (result.message == "验证码获取失败") {
                alert("验证码获取失败")
            }
        }
    });

    //end--------------------------------
}*/

function SetRemainTime1(btnId) {
    var btnid = btnId;
    if (curCount1 == 0) {
        window.clearInterval(InterValObj1);//停止计时器
        $(btnid).removeAttr("disabled");//启用按钮
        $(btnid).text("重新发送");
    }
    else {
        curCount1--;
        $(btnid).text( + curCount1 + "秒再获取");
    }
}
	

