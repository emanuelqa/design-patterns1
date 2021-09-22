
public class ISS extends Imposto{
	
	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public ISS() {}

	@Override
	public double calcula(Orcamento orcamento) {
		double desconto = orcamento.getValor() * 0.05 + calculoDoOutroImposto(orcamento);
		return desconto;
	}
}
