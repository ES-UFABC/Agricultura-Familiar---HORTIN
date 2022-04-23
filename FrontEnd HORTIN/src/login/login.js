
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

function novoUsuario(){
    var data = new FormData($("#cadastroUsuario").get(0));
    var value = JSON.stringify(Object.fromEntries(data.entries()));
    var url= 'http://localhost:8080/usuario';
    console.log(value)
    $.ajax({
        method: "POST",
        crossDomain: true,
        url : url,
        dataType : "json",
        contentType: "application/json; charset=utf-8",
        processData : false,
        data  :  value,
        success : function (res){
            $("#modalNovoProduto").modal('hide')
            flash('Ação executada com sucesso 😀', 'success');
        },
        error : function(res){
            console.log(res);
            flash('Algo de errado aconteceu 😥', 'error');
        }
    })
}