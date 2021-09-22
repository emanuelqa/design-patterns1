
public class Reprovado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovado n�o recebe descontos extras");
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento reprovado n�o pode ser aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� esta reprovado");
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
