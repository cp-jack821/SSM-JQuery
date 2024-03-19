$(function (){

    var search = window.location.search;

    var str = search.substr(4);

    $.ajax({
        url:"/mc/mb",
        data:{"id":str},
        type:"post",
        success:function(resData){
            $("#id").text(str);
            $("input[name='name']").val(resData.name);
            $("input[name='salary']").val(resData.salary);
            $("input[name='job']").val(resData.job);
        }
    })

    $("#confirm").click(function(){
        // alert(1);
        var member = new Object();
        member.id = str;
        member.name = $("input[name='name']").val();
        member.salary = $("input[name='salary']").val();
        member.job = $("input[name='job']").val();

        $.ajax({
            url:"/mc/um",
            data:member,
            type:"post",
            success:function(resData){
                if (resData > 0){
                    location.href="emplist.html";
                }
            }
        })
    });

});