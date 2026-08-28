package Model;

import Model.Pagamento.Pagamento;
import Service.FactoryPagamento;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;


public class Venda {
	private Collection<ItemVenda> itemsVenda;
	private double total;
	private String dataVenda;
	private Pagamento pagamento;
		
	public Venda(String dataVenda){
		itemsVenda = new ArrayList<ItemVenda>();
		this.dataVenda = dataVenda;
	}
	public double getTotal(){
		total = 0;
		Iterator<ItemVenda> iteratorItemsVenda = this.itemsVenda.iterator();
		while  (iteratorItemsVenda.hasNext()){
			ItemVenda itemVenda = iteratorItemsVenda.next();
			total = total + itemVenda.calcularSubTotal();
		}
		return total;
	}
	public Collection<ItemVenda> getItemsVenda() {
		return itemsVenda;
	}
	public String getDataVenda() {
		return dataVenda;
	}
	public double getTroco(){
		return pagamento.getValorPago() - getTotal();
	}

	public void criarItemVenda(int quantidade, Produto produto){
		ItemVenda itemVenda = new ItemVenda(quantidade, produto);
		this.itemsVenda.add(itemVenda);
	}
	

	public void efetuarPagamento(double valorRecebido, int tipoPagamento){
		//pagamento = new Model.Pagamento.Pagamento(valorRecebido);

		FactoryPagamento fabrica = new FactoryPagamento();
		pagamento = fabrica.obterFormaPagamento(tipoPagamento, valorRecebido);
		pagamento.autorizar();

	}
}
