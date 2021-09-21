
public class CalculadorDeDesconto {
	
	public double calcula(Orcamento orcamento) {
	
		Desconto cincoItens = new DescontoMaisDeCincoItens();
		Desconto quinhentosReais = new DescontoMaiorDeQuinhentosReais();
		Desconto semDesconto = new SemDesconto();
		
		cincoItens.setProximo(quinhentosReais);
		quinhentosReais.setProximo(semDesconto);
		
		return cincoItens.desconta(orcamento);
	}
}
