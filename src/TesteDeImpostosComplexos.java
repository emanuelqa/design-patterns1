
public class TesteDeImpostosComplexos {
	public static void main(String[] args) {
		Imposto iss = new ISS(new ICMS());
		
		Orcamento orcamento = new Orcamento(500);
		System.out.println(iss.calcula(orcamento));
	}

}
