
public class DescontoMaiorDeQuinhentosReais implements Desconto{
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if(orcamento.getValor() > 500) return orcamento.getValor() * 0.07;
		else return this.proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
