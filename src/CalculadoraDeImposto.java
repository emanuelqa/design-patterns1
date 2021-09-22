
public class CalculadoraDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double calculo = imposto.calcula(orcamento);
		System.out.println(calculo);
	}

}
