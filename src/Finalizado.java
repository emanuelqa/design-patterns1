
public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o recebe descontos extras");
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o pode ser aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento finalizado n�o pode ser reprovado");
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� finalizado");
	}

}
