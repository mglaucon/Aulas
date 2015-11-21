package Exemplo2;

public interface FolhaPagamento {
	final float DESCPADRAOIRRF =10f;
	final float PERCIRRF = 3.5f;
	
	public void calculaSalario();
	public void calculaInss();
	public void calculaIrrf();
	public void calculaSalarioLiquido();
}
