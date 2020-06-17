package trabalho03.impostos;

public class IOF extends ImpostoFederal {
	// Metodo para calcular e retornar o metodo da classe abstrata tributo
	// e multiplicar pela taxa de IOF

	public double calcular(Tributavel tributavel) {
		return tributavel.valor() * 0.02;
	}
}