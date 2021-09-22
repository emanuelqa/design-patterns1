import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	protected double valor;
	private final List<Item> itens;
	
	protected EstadoDeUmOrcamento estadoAtual;

	public Orcamento(double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Item>();
		estadoAtual = new EmAprovacao();
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void adicionaItem(Item item) {
		itens.add(item);
	}
	public List<Item> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void aplicarDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprovado() {
		estadoAtual.aprovado(this);
	}
	
	public void reprovado() {
		estadoAtual.reprovado(this);
	}
	
	public void finalizado() {
		estadoAtual.finalizado(this);
	}
	
}
