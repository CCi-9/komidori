//判断用户是否已经登陆
function returnSignin(){
    $.ajax({
        url: "http://" + host + "/maternal/checkUser",
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