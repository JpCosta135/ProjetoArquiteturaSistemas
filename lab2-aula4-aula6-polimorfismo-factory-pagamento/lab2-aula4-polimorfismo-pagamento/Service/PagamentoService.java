package Service;

import Model.ItemVenda;
import Model.Pagamento.Pagamento;
import Model.Produto;
import Model.Venda;

public class PagamentoService {





    public void efetuarPagamento(double valorRecebido, int tipoPagamento){

        FactoryPagamento fabrica = new FactoryPagamento();
        Pagamento p = fabrica.obterFormaPagamento(tipoPagamento, valorRecebido);
        p.autorizar();

    }









}
