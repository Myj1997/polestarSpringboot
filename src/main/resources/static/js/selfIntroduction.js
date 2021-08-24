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