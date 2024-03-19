
$(function(){
    $("#button1").click(function(){
        var user = new Object();
        user.username = $("input[name='username']").val();
        user.name = $("input[name='name']").val();
        user.password = $("input[name='pwd']").val();
        user.sex = $("input[name='sex']").val();
        let password1 = $("input[name='pwd1']").val();
        // console.log(user);
        $.ajax({
            url:"/tc/fn",
            data:{"username":user.username},
            type:"post",
            // dataType:"json",
            success:function (resData){
                // console.log(resData);
                if (resData.username != null){
                    $("#text1").css("color","red");
                    $("#text1").text("用户名已存在，请重新输入");
                }else{
                    $.ajax({
                        url:"/tc/ns",
                        data:{"username":user.username,"password":user.password,"name":user.name,"sex":user.sex},
                        type:"post",
                        success:function(resData){
                            if(resData > 0) {
                                alert("注册成功");
                                //跳转到登录页面
                                location.href = "login.html";
                            }else{
                                $("#text1").css("color","purple");
                                $("#text1").text("添加失败");
                            }
                        }
                    });
                }

            }
        });

    });

});