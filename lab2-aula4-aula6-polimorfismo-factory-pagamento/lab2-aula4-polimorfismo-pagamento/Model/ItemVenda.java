package Model;

public class ItemVenda {
	private int quantidade;
	private Produto produto;
	private double subtotal; 
	
	public ItemVenda(int quantidade, Produto produto){
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	
	public int getQuantidade() {
		return quantidade;
	}

	
	public Produto getProduto() {
		return produto;
	}
	
	public double calcularSubTotal(){
		subtotal = 0;
		subtotal = quantidade * produto.getPreco();
		return subtotal;
	}
	
}
