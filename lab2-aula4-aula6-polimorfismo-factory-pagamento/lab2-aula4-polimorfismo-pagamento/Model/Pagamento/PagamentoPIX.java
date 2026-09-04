package Model.Pagamento;

public class PagamentoPIX extends Pagamento {


    public PagamentoPIX(double valorPago) {
        super(valorPago);
    }


    @Override
    public void autorizar() {
        System.out.println("Pagamento PIX autorizado");

    }
}
