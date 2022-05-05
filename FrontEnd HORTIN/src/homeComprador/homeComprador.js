$(document).ready(function() {

    buildTableComprador();
    $('#tabelaComprador').on( 'click', 'tr', function () {
        if ( $(this).hasClass('selected') ) {
            $(this).removeClass('selected');
        }
        else {
            tableComprador.$('tr.selected').removeClass('selected');
            $(this).addClass('selected');
        }
    } );
 
    $('#button').click( function () {
        tableComprador.row('.selected').remove().draw( false );
    } );

   
});

function buildTableComprador(){

    window.tableComprador = $("#tabelaComprador").DataTable({
        paging: true,
        pagingType : "full",
        colReorder: true,
        searching : true,
        "processing" : true,
        "ajax" : {
            "url" : "http://localhost:8080/produto/",
            "type" : "GET",
            dataSrc: ''
        },
        "columns": [

            {"data": "nomeProduto", "className" : ''},
            {"data": "descricaoProduto", "className" : ''},
            {"data": "valorProduto", "className" : ''},
            {"data": "quantidadeProduto", "className" : ''},
            {"data": "vendedor.nome", "className" : ''},
            {"data": "id_produto", "className" : ''}
        ],
        "columnDefs": [
            
            {
                "targets" : '_all',
                searchPanes:{show: true}
            }
        ],
        'select' : {"style" : "single"},
        "language": {
            "zeroRecords" : "Nenhum dado encontrado",
            "infoEmpty" : "Nenhum dado encontrado",
            "infoFiltered" : "(filtrado de um total de _MAX_ dados)",
            "lengthMenu" : "Mostrar _MENU_ dados por página",
            "search":         "Pesquisar:",
            "info":           "Exibindo _START_ a _END_ de _TOTAL_ produtos",
            "paginate": {
                "first":      "Primeiro",
                "last":       "Último",
                "next":       "Próximo",
                "previous":   "Anterior"
            },
            searchPanes : {
                clearMessage : 'Remover Filtros'
            }
        },
        stateSave : true,
        dom: 'Bftrip'
    });
    var dt = $('#tabelaComprador').DataTable();
//hide the 5th column
dt.column(5).visible(false);

}

function adicionaNoCarrinho(){
    const carrinho = JSON.parse(localStorage.getItem('carrinho'))  || []
    var selectedRow = tableComprador.row('.selected').data();

    if (carrinho.filter(e => e.id === selectedRow.id_produto).length > 0) {
        console.log("sim")
    }
    else{
        const novoProduto = {
            "id": selectedRow.id_produto
        }

        const tarefasAtualizadas = [...carrinho, novoProduto]
        
        console.log(tarefasAtualizadas)
        localStorage.setItem('carrinho', JSON.stringify(tarefasAtualizadas))
    }

}
