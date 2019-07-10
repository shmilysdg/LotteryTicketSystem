var issue,ballColor,num;
$(document).ready(function() {
    color("blue","16","sixteen");
    $('.issue').change(function () {
        issue = $('.issue option:selected').val();
        ballColor = $('.color option:selected').val();
        if(ballColor == "blue"){
            num = 16;
        }else if(ballColor == "red") {
            num = 33;
        }
        color(ballColor,num,issue);
    });
    $('.color').change(function () {
        issue = $('.issue option:selected').val();
        ballColor = $('.color option:selected').val();
        if(ballColor == "blue"){
            num = 16;
        }else if(ballColor == "red") {
            num = 33;
            
        }
        color(ballColor,num,issue);
    });
});
function color(color,num,issue){
    var number = 0;
    var ballCount = 0;
    var value = "<tr><th>号码</th><th>次数</th></tr>";
    for(i=1;i<=num;i++){
        if(i<10){
            number = "0"+i;
            ballCount = count(color,number,issue);
            value +="<tr><td>"+number+"</td><td>"+ballCount+"</td></tr>";
        }else{
            ballCount = count(color,i,issue);
            value +="<tr><td>"+i+"</td><td>"+ballCount+"</td></tr>";
        }

    }
    $('.table').html(value);
}
function count(color,num,issue) {
    var ballCount = 0;
    $.ajax({
        url:"/ball/countNum",
        type:"GET",
        data:{"color":color,"num":num,"issue":issue},
        datatype:"json",
        async:false,
        success:function (result) {
            ballCount = result;
        }
    });
    return ballCount;
}