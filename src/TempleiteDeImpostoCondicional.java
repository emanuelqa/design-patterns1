
public abstract class TempleiteDeImpostoCondicional implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		if(deveUsarTaxacaoMaxima(orcamento)) return maximaTaxacao(orcamento);
		else return minimaTaxacao(orcamento);
	}

	public abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
