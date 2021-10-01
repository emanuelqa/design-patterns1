
public class TesteAcao {
	public static void main(String[] args) {
		NotaFiscalBuild build = new NotaFiscalBuild();
		
		build.addAcao(new EnviarEmail());
		build.addAcao(new EnviarSms());
		
		NotaFiscal notaFiscal = build.paraEmpresa("Alguma coisa LTDA")
		.comCnpj("55555555555")
		.comItem(new ItemDaNota("item1", 100))
		.comItem(new ItemDaNota("item2", 200))
		.comObservacoes("teste observação")
		.naDataAtual()
		.builder();
		
		System.out.println("Valor: " + notaFiscal.getValorBruto() );
		
	}

}
