
function login(){
    var data = new FormData($("#login").get(0));
    var value = JSON.stringify(Object.fromEntries(data.entries()));
    var url= 'http://localhost:8080/usuario/login?' + ($('#login')).serialize();
    console.log(url)
    $.ajax({
        method: "GET",
        url : url,
        success : function (){
            alert('Ação executada com sucesso 😀');
        },
        error : function(){
            alert('Algo de errado aconteceu 😥');
        }
    }
    )
}