$(document).ready(function() {

    // $('#tabelaVendedor tfoot th').each( function () {
    //     var title = $(this).text();
    //     $(this).html( '<input type="text" size="10" placeholder="'+title+'" /input>' );
    // } );

    window.tableComprador = $("#tabelaComprador").DataTable({
        paging: true,
        dom: 'Bfrtip',
        colReorder: true,
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
    tableComprador.columns().every( function () {
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
function getProdutos(){
    var vendedor = 1;
    var url= 'http://localhost:8080/produto/vendedor/?' + vendedor.toString()
    $.ajax({
        method: "GET",
        crossDomain: true,
        url : url,
        dataType : "json",
        contentType: "application/json; charset=utf-8",
        processData : false,
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
