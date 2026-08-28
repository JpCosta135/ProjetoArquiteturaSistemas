package Repository;

import Model.Produto;

import java.util.Hashtable;


public class CatalogoProdutos {
	private Hashtable<String, Produto> produtos;
	
	public CatalogoProdutos(){
		produtos = new Hashtable<String, Produto>();
		
		Produto produto1 = new Produto("livro UML Fowler", 75.50, "001");
		produtos.put(produto1.getCodigo_barra(), produto1);
		Produto produto2 = new Produto("livro Redes", 80.00, "002");
		produtos.put(produto2.getCodigo_barra(), produto2);
		Produto produto3 = new Produto("livro SO", 70.00, "003");
		produtos.put(produto3.getCodigo_barra(), produto3);
	}
	
	public Produto consultarProduto(String codigoBarras){
		Produto produto = null;
		produto = produtos.get(codigoBarras);
		return produto;
	}
}
