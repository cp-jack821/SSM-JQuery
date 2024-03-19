
$(function(){
    $("#button1").click(function (){
        //获取用户名
        let username = $("input[name='name']").val();
        let password = $("input[name='pwd']").val();
        $.ajax({
            url:"/tc/gn",
            data:{"username":username,"password":password},
            type:"get",
            // dataType:"json",
            success:function(resData){
                if (resData.id != null){
                    location.href="emplist.html";
                }else{
                    $("#p1").css("color","red");
                    $("#p1").text("输入错误，请重新输入");
                }
            }
        });
    });
});

$(function(){
    $("#button2").click(function (){
        location.href="regist.html";
    });
});