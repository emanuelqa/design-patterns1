
public class Aprovado implements EstadoDeUmOrcamento{

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		orcamento.valor -= orcamento.valor * 0.02;
	}

	@Override
	public void aprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento j� esta aprovado");
	}

	@Override
	public void reprovado(Orcamento orcamento) {
		throw new RuntimeException("Or�amento aprovado n�o pode ser reprovado");
	}

	@Override
	public void finalizado(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();
	}

}
