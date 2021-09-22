
public class TesteDescontoExtra {

	public static void main(String[] args) {
		Orcamento reforma = new Orcamento(500);
		
		reforma.aplicarDescontoExtra();
		System.out.println(reforma.getValor());
		
		reforma.aprovado();
		reforma.aplicarDescontoExtra();
		System.out.println(reforma.getValor());
	}
}
