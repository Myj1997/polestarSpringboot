function btnClick(){
   // alert("hi");
    //var inputHiddenVal =  document.getElementById("inputHidden").value

    if(document.getElementById("inputHidden").value == 0){

        document.getElementById("body1").style.backgroundColor = "gray";
        document.getElementById("inputHidden").value = 1;
    }else{
        document.getElementById("body1").style.backgroundColor = "lightgray";
        document.getElementById("inputHidden").value = 0;
    }



    var btn1 = document.getElementById('btn1');
    btn1.innerText = "하이";
}


$(document).ready(function(){

    const source = $('#info').html();

    const template = Handlebars.compile(source);

    const data = {
        engName : "인적사항"
    }

    const html = template(data);

    $('#humanInfo').prepend(html);

    // 에이작스를 이벤트로 만들기
    // 버튼 하나를 만들어서 버튼 클릭 시 지금만든 에이작스가 호출 되면서 호출된 데이터가 원래 있던 데이터가 바뀌기
    // * 바꿀 데이터는  api 로 바뀌어주기 (result 값 이용)
    $.ajax({
            url: "/personApi/get",
            type: "GET"
        }).done(function(result) {
            console.dir(result);
        })
        .fail(function(xhr, status, errorThrown) {
            console.log(xhr);
        });
});
