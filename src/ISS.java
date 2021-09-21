
public class ISS implements Imposto{

	@Override
	public double calculaImposto(double valor) {
		double desconto = valor * 0.05;
		return desconto;
	}

}
