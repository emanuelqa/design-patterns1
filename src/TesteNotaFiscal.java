
public class TesteNotaFiscal {
	public static void main(String[] args) {
		NotaFiscalBuild build = new NotaFiscalBuild();
		NotaFiscal notaFiscal = build.paraEmpresa("Alguma coisa LTDA")
		.comCnpj("55555555555")
		.comItem(new ItemDaNota("item1", 100))
		.comItem(new ItemDaNota("item2", 200))
		.comObservacoes("teste observa��o")
		.naDataAtual()
		.builder();
		
		System.out.println("Raz�o social: " + notaFiscal.getRazaoSocial() );
		System.out.println("CNPJ: " + notaFiscal.getCnpj());
		System.out.println("OBS: " + notaFiscal.getObservacoes());
		System.out.println("Valor: " + notaFiscal.getValorBruto() );
		System.out.println("Imposto: " + notaFiscal.getImpostos() );
		
	}

}
