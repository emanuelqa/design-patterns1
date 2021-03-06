
public class DescontoMaisDeCincoItens implements Desconto{
	
	private Desconto proximo;

	public double desconta(Orcamento orcamento) {
		if(orcamento.getItens().size() > 5) return orcamento.getValor() * 0.01;
		else return this.proximo.desconta(orcamento);
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
	}

}
