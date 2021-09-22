
public abstract class TempleiteDeImpostoCondicional extends Imposto{

	@Override
	public double calcula(Orcamento orcamento) {
		if(deveUsarTaxacaoMaxima(orcamento)) return maximaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
		else return minimaTaxacao(orcamento) + calculoDoOutroImposto(orcamento);
	}

	public abstract boolean deveUsarTaxacaoMaxima(Orcamento orcamento);

	public abstract double maximaTaxacao(Orcamento orcamento);

	public abstract double minimaTaxacao(Orcamento orcamento);

}
