
public class TesteDesconto {

	public static void main(String[] args) {
		CalculadorDeDesconto calculadora = new CalculadorDeDesconto();
		Orcamento orcamento = new Orcamento(600);
		
		orcamento.adicionaItem(new Item("Fone", 250));
		orcamento.adicionaItem(new Item("Mouse", 250));
		
		System.out.println(calculadora.calcula(orcamento));
	}
}
