
function login(){
    var data = new FormData($("#login").get(0));
    var value = JSON.stringify(Object.fromEntries(data.entries()));
    var url= 'http://localhost:8080/usuario/login?' + ($('#login')).serialize();
    console.log(url)
    $.ajax({
        method: "GET",
        url : url,
        success : function (data, textStatus, jqXHR){
            sessionStorage.setItem('id_usuario', jqXHR.responseJSON.id)
            sessionStorage.setItem('tipo_usuario', jqXHR.responseJSON.tipoAcesso)
            if(jqXHR.responseJSON.tipoAcesso == 2){
                window.location.replace("../homeComprador/homeComprador.html");
            }else {
                window.location.replace("../header/header.html");
            }
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
            alert('Cadastrado com sucesso\r\n Bem vindo ao HORTIN 😊');
        },
        error : function(res){
            alert('Usuario já cadastrado 😥');
        }
    })
}