
public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado não recebe descontos extras");
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado não pode ser aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento finalizado não pode ser reprovado");
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Orçamento já finalizado");
	}

}
