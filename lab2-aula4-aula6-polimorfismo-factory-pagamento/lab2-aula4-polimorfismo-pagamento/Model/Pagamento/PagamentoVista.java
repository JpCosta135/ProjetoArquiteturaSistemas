package Model.Pagamento;

public class PagamentoVista extends Pagamento {
	public PagamentoVista(double valorPago){
		super(valorPago);
	}
	
	public void autorizar(){
		System.out.println("autorizar pagamento a vista");
	}
}
