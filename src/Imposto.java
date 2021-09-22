
public abstract class Imposto {
	
	protected Imposto outroImposto;
	
	public Imposto(Imposto imposto) {
		this.outroImposto = imposto;
	}
	public Imposto() {}

	abstract double calcula(Orcamento orcamento);
	 
	protected double calculoDoOutroImposto(Orcamento orcamento) {
		if(outroImposto == null) return 0;
		return outroImposto.calcula(orcamento);
	}
	
}
