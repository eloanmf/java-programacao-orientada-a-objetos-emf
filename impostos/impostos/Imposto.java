package trabalho03.impostos;

public abstract class Imposto {
	
	
	//Classe abstrata Imposto, com método abstrato calcular(); as classes impostoFederal e importoEstadual
	//estendendo Imposto e implementando o método calcular();

	public abstract double calcular(Tributavel tributavel);
	
}