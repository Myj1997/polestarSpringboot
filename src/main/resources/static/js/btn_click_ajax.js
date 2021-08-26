$(document).ready(function(){
    var btn_changeName = document.getElementById('btn_changeName');

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
                console.log(result);
                console.log(result.schoolListList);

                const html = template(result.academy);
                const htmlSch = templateSch(result.schoolListList);

                $('#aca_tbody').html(html);
                $('#sch_tbody').html(htmlSch);
                // result 로 하면
                //{{#each result.schoolListList}}
                // 리스트는 key : value 형태가 아니기 때문에
            })
            .fail(function(xhr, status, errorThrown) {
                console.log(xhr);
            });

    });

});
