package trabalho03.impostos;

public class ServicoFiscal {
	//classe que com métodos  com modificador static que nao precisao de uma instacia da classe para poder acessar um metodo
	//ou poder acessar uma variavel.
	
	public static void imprimirTributo(Imposto imposto, Tributavel tributavel) {
		System.out.println("Calcular imposto: " + imposto.calcular(tributavel));
	}
	
	public static void imprimirTributo(ImpostoEstadual imposto, Tributavel tributavel) {
		System.out.println("Calcular imposto Estadual: " + imposto.calcular(tributavel));
	}
	
	public static void imprimirTributo(ImpostoFederal imposto, Tributavel tributavel) {
		System.out.println("Calcular imposto Federal: " + imposto.calcular(tributavel));
	}
	
	
}
