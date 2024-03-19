$(function(){
    $("#button1").click(function(){
        var member = new Object();
        member.name = $("input[name='name']").val();
        member.salary = $("input[name='salary']").val();
        member.job = $("input[name='job']").val();
        let work = $("input[name='work']").val();

        var date = new Date(work);
        member.work = date;

        $.ajax({
                url:"/mc/im",
                data:member,
                type:"post",
                success:function(resData){
                    if (resData == 1){
                        console.log("添加成功！");
                        location.href="emplist.html";
                    }else{
                        $("#p1").css("color","red");
                        $("#p1").text("添加失败！");
                    }
                }
            }
        )

    });
});