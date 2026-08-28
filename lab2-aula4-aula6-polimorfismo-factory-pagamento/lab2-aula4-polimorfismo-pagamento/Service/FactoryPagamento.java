package Service;
import Model.Pagamento.Pagamento;
import Model.Pagamento.PagamentoCredito;
import Model.Pagamento.PagamentoVista;

public class FactoryPagamento {



	public Pagamento obterFormaPagamento(int tipo, double valorPago){
		Pagamento retorno = null;
		if (tipo == 1){
			retorno = new PagamentoVista(valorPago);
		}else{
			retorno = new PagamentoCredito(valorPago);
		}
		return retorno;
	}






}
