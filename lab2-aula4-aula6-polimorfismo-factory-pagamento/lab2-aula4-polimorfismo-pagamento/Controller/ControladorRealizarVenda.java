package Controller;

import Model.Produto;
import Model.Venda;
import Repository.CatalogoProdutos;

public class ControladorRealizarVenda {
	private Venda venda;
	private CatalogoProdutos catalogoProdutos;
	
	public ControladorRealizarVenda(Venda venda, CatalogoProdutos catalogo){
		this.venda = venda;
		this.catalogoProdutos = catalogo;
	}
	
	public void entrarItem(String cod_barra, int quantidade){
		Produto produto = catalogoProdutos.consultarProduto(cod_barra);
		if (produto != null){
			venda.criarItemVenda(quantidade, produto);
		}
	}
	
	public void registrarPagamento(double valorFornecido, int tipoPagamento){
		venda.efetuarPagamento(valorFornecido, tipoPagamento);
	}
	
}
