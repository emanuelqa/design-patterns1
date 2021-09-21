
public class CalculadoraDeImposto {
	
	public void realizaCalculo(Orcamento orcamento, Imposto imposto) {
		double calculo = imposto.calculaImposto(orcamento.getValor());
		System.out.println(calculo);
	}

}
