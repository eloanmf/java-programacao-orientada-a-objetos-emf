package trabalho03.impostos;

public abstract class ImpostoEstadual extends Imposto {
	//A classe impostoEstadual é estendida por 2 classes IPVA e ICMS
	//como impostoFederal ela tambem é uma classe abstrata.
	//tem a String privada com metodo para retorna-la.
	
	private String uf;
	
	public String uf() {
		return uf;
	}
}
