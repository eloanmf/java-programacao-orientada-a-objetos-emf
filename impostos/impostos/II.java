package trabalho03.impostos;

public class II extends ImpostoFederal {
	// Metodo para calcular e retornar o metodo da classe abstrata tributo
	// e multiplicar pela taxa de II
	
	public double calcular(Tributavel tributavel) {
		return tributavel.valor() * 0.1;
	}
}
