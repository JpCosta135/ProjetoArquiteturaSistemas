package Model;

public class Produto {
	private String descricao;
	private double preco;
	private String codigo_barra;
	
	public Produto(String descricao, double preco, String codigo_barra){
		this.descricao = descricao;
		this.preco = preco;
		this.codigo_barra = codigo_barra;
	}
	
	public String getDescricao() {
		return descricao;
	}

	public double getPreco() {
		return preco;
	}

	public String getCodigo_barra() {
		return codigo_barra;
	}
	
}
