package trabalho03.impostos;

public class AppMain {

	public static void main(String[] args) {
		
		Imposto ipi = new IPI();
		Imposto ipva = new IPVA();
		
		ImpostoFederal ii = new II();
		ImpostoFederal iof = new IOF();
		
		ImpostoEstadual icms = new ICMS();
		
		
		Veiculo corolla = new Veiculo(100000);
		System.out.println("Veiculo Corola");
		ServicoFiscal.imprimirTributo(ipi, corolla);
		ServicoFiscal.imprimirTributo(ipva, corolla);
		ServicoFiscal.imprimirTributo(ii, corolla);
		ServicoFiscal.imprimirTributo(iof, corolla);
		ServicoFiscal.imprimirTributo(icms, corolla);
		
		System.out.println();
		
		Pao paofrances = new Pao(10);
		System.out.println("Pao Carioquinha");
		ServicoFiscal.imprimirTributo(ipi, paofrances);
		ServicoFiscal.imprimirTributo(ipva, paofrances);
		ServicoFiscal.imprimirTributo(ii, paofrances);
		ServicoFiscal.imprimirTributo(iof, paofrances);
		ServicoFiscal.imprimirTributo(icms, paofrances);
		
		System.out.println();
		
		Bebida vodka = new Bebida(200);
		System.out.println("Bebida Vodka");
		ServicoFiscal.imprimirTributo(ipi, vodka);
		ServicoFiscal.imprimirTributo(ipva, vodka);
		ServicoFiscal.imprimirTributo(ii, vodka);
		ServicoFiscal.imprimirTributo(iof, vodka);
		ServicoFiscal.imprimirTributo(icms, vodka);
		
		
		

	}

}
