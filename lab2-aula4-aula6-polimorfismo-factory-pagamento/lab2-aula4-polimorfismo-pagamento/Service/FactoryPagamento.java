package Service;
import Model.Pagamento.*;

public class FactoryPagamento {



	public Pagamento obterFormaPagamento(int tipo, double valorPago) {
		if (tipo < 1 || tipo > 4){
			System.out.println("Tipo invalido. Informe um valor entre 1 e 4");
			return null;
		}
		Pagamento retorno = null;
		switch (tipo) {
			case 1:
				retorno = new PagamentoVista(valorPago);
			case 2:
				retorno = new PagamentoCredito(valorPago);
			case 3:
				retorno = new PagamentoDebito(valorPago);
			case 4:
				retorno = new PagamentoPIX(valorPago);


		}  return retorno;
	}






}
