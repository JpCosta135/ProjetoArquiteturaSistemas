package View;
import Controller.ControladorRealizarVenda;
import Model.Venda;
import Repository.CatalogoProdutos;

import java.time.LocalDateTime;

public class GUIVenda {
	
	public static void main(String[] args){

		String hoje = LocalDateTime.now().toString();
		Venda venda = new Venda(hoje);
		CatalogoProdutos catalogo = new CatalogoProdutos();
		ControladorRealizarVenda controladorVenda = new ControladorRealizarVenda(venda, catalogo);

		controladorVenda.entrarItem("001", 3);
		controladorVenda.entrarItem("002", 1);
		controladorVenda.entrarItem("003", 2);

		controladorVenda.registrarPagamento(500, 2);
		
		System.out.println("Total = " + venda.getTotal());
		System.out.println("Troco = " + venda.getTroco());
		
	}
	

}
