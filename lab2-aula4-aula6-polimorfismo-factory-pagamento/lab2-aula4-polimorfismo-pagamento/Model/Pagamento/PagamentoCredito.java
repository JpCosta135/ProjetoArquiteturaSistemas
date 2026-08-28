package Model.Pagamento;

public class PagamentoCredito extends Pagamento {

	
	public PagamentoCredito(double valorPago){
		super(valorPago);
	}
	
	public void autorizar(){
		System.out.println("autorizar pagamento credito");
	}
}
