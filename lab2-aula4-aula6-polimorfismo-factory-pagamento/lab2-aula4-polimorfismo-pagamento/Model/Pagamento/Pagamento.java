package Model.Pagamento;

public abstract class Pagamento {
	double valorPago;
	
	public Pagamento(double valorPago){
		this.valorPago = valorPago;
	}

	public double getValorPago() {
		return valorPago;
	}
	
	public abstract void autorizar();
	
}
