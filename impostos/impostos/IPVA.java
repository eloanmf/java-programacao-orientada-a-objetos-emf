package trabalho03.impostos;

public class IPVA extends ImpostoEstadual {
	// Metodo para calcular e retornar o metodo da classe abstrata tributo
	// e multiplicar pela taxa do IPVA
	
	public double calcular(Tributavel tributavel) {
		return tributavel.valor() * 0.025;
	}
}
