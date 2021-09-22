
public class ICMS implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		double desconto = orcamento.getValor() * 0.1;
		return desconto;
	}

}
