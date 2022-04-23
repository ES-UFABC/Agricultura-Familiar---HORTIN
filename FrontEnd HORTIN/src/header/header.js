$(document).ready(function() {

    // $('#tabelaVendedor tfoot th').each( function () {
    //     var title = $(this).text();
    //     $(this).html( '<input type="text" size="10" placeholder="'+title+'" /input>' );
    // } );
    var vendedor = localStorage.getItem("id_usuario");
    window.table = $("#tabelaVendedor").DataTable({
        paging: true,
        pagingType : "full",
        dom: 'Bfrtip',
        colReorder: true,
        searching : true,
        "processing" : true,
        "ajax" : {
            "url" : "http://localhost:8080/produto/vendedor/"+ vendedor.toString(),
            "type" : "GET"
        },
            buttons: [
                {
                    extend: 'colvis',
                    text: 'Colunas Visíveis'
                },
                'copy', 'excel', 'print',
                {
                    text: 'Atualiza',
                    action: function () {
                         window.location.reload();
                    }
                }
                ],
        order: [[0, "asc"]],
        stateSave: false,
        responsive: false,
        scrollY: "400px",
        scrollX: "0px",
        scrollCollapse: true,
        
    });
    sessionStorage.setItem('id_usuario', '1')
    sessionStorage.setItem('tipo_usuario', '1')
    // Apply the search
    table.columns().every( function () {
        var that = this;
    
        $( 'input', this.footer() ).on( 'keyup change clear', function () {
            if ( that.search() !== this.value ) {
                that
                    .search( this.value )
                    .draw();
            }
        } );
    } );
});

function novoProduto(){
    var vendedor = localStorage.getItem("id_usuario")
    sessionStorage.setItem('id_usuario', '1')
    sessionStorage.setItem('tipo_usuario', '1')
    var data = new FormData($("#cadastroProduto").get(0));
    var value = JSON.stringify(Object.fromEntries(data.entries()));
    var url= 'http://localhost:8080/produto/vendedor/' + vendedor.toString()
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