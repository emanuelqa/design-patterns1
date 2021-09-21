
public class TesteDeImposto {
	
	public static void main(String[] args) {
		
		Imposto ISS = new ISS();
		Imposto ICMS = new ICMS();
		
		Orcamento orcamento = new Orcamento(100);
		
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		calculadora.realizaCalculo(orcamento, ISS);
		calculadora.realizaCalculo(orcamento, ICMS);
		
	}
	
}
