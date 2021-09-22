
public class IKVC extends TempleiteDeImpostoCondicional{

	@Override
	public boolean deveUsarTaxacaoMaxima(Orcamento orcamento) {
		return temItemMaiorDe100(orcamento) && orcamento.getValor() > 500;
	}

	@Override
	public double maximaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

	@Override
	public double minimaTaxacao(Orcamento orcamento) {
		return orcamento.getValor() * 0.06;
	}
	
	private boolean temItemMaiorDe100(Orcamento orcamento) {
		for (Item item : orcamento.getItens()) {
			if(item.getValor() > 100) return true;
		}
		return false;
	}

}
