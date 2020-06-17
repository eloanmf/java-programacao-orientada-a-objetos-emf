package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import faminto.Bebida;
import faminto.Cheque;
import faminto.Cliente;
import faminto.Entregador;
import faminto.Lanche;
import faminto.Pedido;
import faminto.Refeicao;
import faminto.Sobremesa;

public class AppMain {
	
	public static void main(String[] args){
	
	/*
	 * Carregamento de dados;
	 * Informações básicas para execução dos procedimentos do sistema.
	 */
	Relatorio R = new Relatorio();
	Date data = new Date();
	Cliente cl_1 = new Cliente("C1", 11111111, "Rua AA, 111", "Brazuca");
	Cliente cl_2 = new Cliente("C2", 22222222, "Rua A, 100", "");
	Cliente cl_3 = new Cliente("C3", 33333333, "Rua B, 200", "");
	Cliente cl_4 = new Cliente("C4", 44444444, "Rua C, 300", "");
	Cliente cl_5 = new Cliente("C5", 55555555, "Rua D, 400", "");
	Cliente cl_6 = new Cliente("C6", 66666666, "Rua E, 500", "");
	Cliente cl_7 = new Cliente("C7", 77777777, "Rua F, 600", "");
	Cliente cl_8 = new Cliente("C8", 88888888, "Rua G, 700", "");
	Cliente cl_9 = new Cliente("C9", 99999999, "Rua H, 800", "");
	Cliente cl_10 = new Cliente("C10", 10101010, "Rua I, 900", "");
	
	List<Entregador> entregadores = new ArrayList<Entregador>();
	
	Entregador etrg_1 = new Entregador("A", "OPK1111");
	Entregador etrg_2 = new Entregador("B", "OPK2222");
	Entregador etrg_3 = new Entregador("C", "OPK1234");
	Entregador etrg_4 = new Entregador("D", "OPK3333");
	Entregador etrg_5 = new Entregador("E", "OPK6060");
	entregadores.add(etrg_1);
	entregadores.add(etrg_2);
	entregadores.add(etrg_3);
	entregadores.add(etrg_4);
	entregadores.add(etrg_5);
	
	Lanche lan_1 = new Lanche("Hamburger", 20d);
	Lanche lan_2 = new Lanche("Batatinha", 5d);
	Lanche lan_3 = new Lanche("Esfirra", 5d);
	Lanche lan_4 = new Lanche("Tapioca", 10d);
	
	Refeicao Ref_1 = new Refeicao("Espaguete", 20d);
	Refeicao Ref_2 = new Refeicao("Lasanha", 30d);
	Refeicao Ref_3 = new Refeicao("Carne de Sol", 40d);
	Refeicao Ref_4 = new Refeicao("Picanha", 60d);
	
	Bebida beb_1 = new Bebida("Coca", 5d, 100);
	Bebida beb_2 = new Bebida("Fanta Uva", 3d, 50);
	Bebida beb_3 = new Bebida("Fanta Guarana", 4d, 100);
	Bebida beb_4 = new Bebida("Sukita", 2d, 50);
	
	Sobremesa sbr_1 = new Sobremesa("Sorvete", 10d);
	Sobremesa sbr_2 = new Sobremesa("Chocolate", 5d);
	Sobremesa sbr_3 = new Sobremesa("Cocada", 7d);
	Sobremesa sbr_4 = new Sobremesa("Docinho", 4d);
	
	Cheque Chq_1 = new Cheque(0001, 1234, 11111, "Banco Inter");
	
	/*
	 * Atendimento de Pedidos
	 * Lançamento das informações nos pedidos 
	 */
	
		
	Pedido p1 = new Pedido(cl_1);
	Pedido p2 = new Pedido(cl_1);

	
	p1.addItem(3, beb_1);
	p1.addItem(53, beb_1);
	p1.addItem(3, beb_3);

	
	etrg_1.entregar(p1);
	etrg_1.entregar(p2);
	//p.concluido();
	p1.devolvido();
	p1.devolvido();
	p2.devolvido();
	
	//BancoDeDados.salvar(p);
	//R.imprimirPedidos();
	//System.out.println(p);
	
	//Pedido p3 = new Pedido(cl_1);
	
	
	
	R.PedidoDoDia(entregadores, data);
	R.Entregadores(entregadores);
	R.ItensVendidos(entregadores);
	/*
	 * Impressão de informações
	 * 
	 */

	

	}
}