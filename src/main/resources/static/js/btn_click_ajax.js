$(document).ready(function(){
    let btn_changeName = document.getElementById('btn_changeName');

    const source = $('#aca_info').html();
    const sourceSch = $('#sch_info').html();

    const template = Handlebars.compile(source);
    const templateSch = Handlebars.compile(sourceSch);
    // 컴파일은 한번만.. 클릭할 때마다 컴파일 되서 오류가 났었다.

    btn_changeName.addEventListener('click',function(){
        $.ajax({
                url: "/personApi/addEduInfo",
                type: "GET"
            }).done(function(result) {
                const html = template(result);
                const htmlSch = templateSch(result);

                $('#aca_tbody').html(html);
                $('#sch_tbody').html(htmlSch);

            })
            .fail(function(xhr, status, errorThrown) {
                console.log(xhr);
            });
    });

    // 로또 번호
    let btn_lottoNumGenerate = document.getElementById("btn_lottoNumGenerate");

    btn_lottoNumGenerate.addEventListener('click',function(){
        $.ajax({
            url : "/personApi/lottoNumGenerate",
            type : "GET"
        }).done(function(result){
            $('#replace').html(result);
        }).fail(function(xhr,status,errorThrown){
            console.log(xhr);
        });
    });

    // 운세
    let btn_todayLuck = document.getElementById("btn_todayLuck");

    btn_todayLuck.addEventListener('click',function(){
        $.ajax({
            url : "/personApi/todayLuck",
            type : "GET"
        }).done(function(result){
            $('#replace').html(result);
        }).fail(function(xhr,status,errorThrown){
            console.log(xhr);
        });
    });

    // 이름 찾기
    let btn_myName = document.getElementById("btn_myName");

    btn_myName.addEventListener('click',function(){
        $.ajax({
            url : "/personApi/myName",
            type : "GET"
        }).done(function(result){
            $('#replace').html(result);
        }).fail(function(xhr,status,errorThrown){
            console.log(xhr);
        });
    });

    let btn_exportExcel = document.getElementById("btn_exportExcel");

    btn_exportExcel.addEventListener('click',function(){
        $.ajax({
            url : "/personApi/exportExcel",
            type : "GET"
        }).done(function(result){
            $('#replace').html("바탕화면을 확인");
        }).fail(function(xhr,status,errorThrown){
            $('#replace').html("에러 발생");
            console.log(xhr);
        });
    });



});
