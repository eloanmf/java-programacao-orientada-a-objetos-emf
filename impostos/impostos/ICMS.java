package trabalho03.impostos;

public class ICMS extends ImpostoEstadual {
	// Metodo para calcular e retornar o metodo da classe abstrata tributo
	// e multiplicar pela taxa de ICMS
	
	public double calcular(Tributavel tributavel) {
		return tributavel.valor() * 0.27;
	}
}
