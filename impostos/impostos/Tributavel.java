package trabalho03.impostos;

public abstract class Tributavel {
	
	//Classe abstrata com variavel protected e metodo Tributavel que retorna o valor.
	
	protected double valor;

	public Tributavel(double valor) {
		this.valor = valor;
	}

	public double valor() {
		return valor;
	}

}