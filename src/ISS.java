
public class ISS implements Imposto{

	@Override
	public double calculaImposto(Orcamento orcamento) {
		double desconto = orcamento.getValor() * 0.05;
		return desconto;
	}

}
