function addComment(matid,essayid){

    if(matid==null){
        alert("登录后再评论");
        return;
    }

    let content = $("#commentContents").val();
//  	let uid = 10001001;
//  	let eid = 369851002;
    let uid = matid;
    let eid = essayid;
    $.ajax({
        url: "http://" + host + "/comment/addComment",
        method: "post",
        data: {
            uid: uid,
            eid:eid,
            content:content
        },
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            console.log(result)
            if (result.status != "200") {
                alert(result.message)
            } else {
                alert("评论成功");
                var id = result.data.commentId;
                var content = result.data.commentContent;
                var author =  result.data.commentUserName
                var time = result.data.commentDate;
                var img = result.data.commentUserImg;
                $("#commentContent").val("");

                var lengths = $('.comments').children(".comment").length;
//                  alert(lengths)
                if(lengths>0){
                    $('.comments .comment:first-child').before(`<li class="comment">
                    		<div>
                    		<div class="comment-theme">
                    			<div class="comment-image">
                    				<img src="`+img+`" alt>
                    			</div>
                    		</div>
                    		<div class="comment-main-area">
                    		  <div class="comment-wrapper">
                    		   	<div class="comments-meta">
                    		    	<h4>` + author + ` <span class="comments-date">` + time + `</span></h4>
                    		   	</div>
                    		    <div class="comment-area">
                    		      <p>` + content + ` </p>
                    		      
                    		    </div>
                    		    </div>
                    		</div>
                    		
                    		</div>
                    	</li>`);
                }
                else{
                    $('.comments').append(`<li class="comment">
                    		<div>
                    		<div class="comment-theme">
                    			<div class="comment-image">
                    				<img src="`+img+`" alt>
                    			</div>
                    		</div>
                    		<div class="comment-main-area">
                    		  <div class="comment-wrapper">
                    		   	<div class="comments-meta">
                    		    	<h4>` + author + ` <span class="comments-date">` + time + `</span></h4>
                    		   	</div>
                    		    <div class="comment-area">
                    		      <p>` + content + ` </p>
                    		      
                    		    </div>
                    		    </div>
                    		</div>
                    		
                    		</div>
                    	</li>`);
                }


            }
        }
    });


}
function deleteComment(id){
    $.ajax({
        url: "http://" + host + "/comment/deleteCommentById",
        method: "delete",
        data: {
            id: id,
        },
        xhrFields: {
            withCredentials: true  //带上cookie信息，解决sessionid不一致
        },
        success: function (result) {
            console.log(result)
            if (result.status != "200") {
                alert(result.message)
            } else {
                alert("删除成功");
                window.location.reload();

            }
        }
    });
}