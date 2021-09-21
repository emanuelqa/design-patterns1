
public class ICMS implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		double desconto = valor * 0.1;
		return desconto;
	}

}
