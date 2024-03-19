$(function(){

    //获取uri，？和？后面的东西
    var r = window.location.search;

    var str = r.substr(6);

    $("#msg").text("[" + str + "]" + "已经删除");


    $("#returnUpView").click(function(){

        location.href = "emplist.html";
    })

    $("#login").click(function(){

        location.href = "login.html";
    })
});