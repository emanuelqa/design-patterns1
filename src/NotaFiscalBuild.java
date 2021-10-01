import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuild {
	
	private String razaoSocial;
	private String cnpj;
	private Calendar dataEmissao;
	private double valorBruto;
	private double impostos;
	private List<ItemDaNota> todosIntens = new ArrayList<ItemDaNota>();
	private String observacoes;
	private List<AcaoAposGerarNota> acoes = new ArrayList<AcaoAposGerarNota>();
	
	public void addAcao(AcaoAposGerarNota acao) {
		acoes.add(acao);
	}
	
	
	public NotaFiscalBuild paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}
	public NotaFiscalBuild comCnpj	(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}
	public NotaFiscalBuild naDataAtual() {
		this.dataEmissao = Calendar.getInstance();
		return this;
	}
	public NotaFiscalBuild comValorBruto(double valorBruto) {
		this.valorBruto = valorBruto;
		return this;
	}
	public NotaFiscalBuild comItem(ItemDaNota item) {
		this.todosIntens.add(item);
		this.valorBruto += item.getValor();
		this.impostos += item.getValor() * 0.05;
		return this;
	}
	public NotaFiscalBuild comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}
	public NotaFiscal builder() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, dataEmissao, valorBruto, impostos, todosIntens, observacoes);
		
		for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executar(nf);
		}
		return nf;
	}

}
