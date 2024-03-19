$(function(){
    apTr="";
    $.ajax({
        url:"/mc/sm",
        data:{},
        type:"post",
        success:function (resData){
            for(var index in resData){
                apTr +="<tr>"
                var item = resData[index];
                for(var attr in item){
                    apTr +="<td>"+item[attr]+"</td>"
                }
                apTr += "<td><button class='delete'>delete</button><button class='update'>update</button></td>"
                apTr += "</tr>"
            }
            $(".table").append(apTr);
        }
    })

    $(".table").on("click",".delete",function (){
        let id = $(this).parent().parent().children().eq(0).text();
        let name = $(this).parent().parent().children().eq(1).text();
        $.ajax({
            url:"/mc/rm",
            data:{"id":id},
            type:"get",
            success:function(resData){
                if (resData > 0)
                    location.href = "deleteEmp.html?name=" + name;
            }
        });
    });

    $(".table").on("click",".update",function (){
        let id = $(this).parent().parent().children().eq(0).text();
        location.href="updateEmp.html?id=" + id;


    })
});