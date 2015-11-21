package Exemplo1;

public interface FolhaPagamento {
	final float PECINSS = 8.5f;
	final float PECIRRF = 3.5F;
	
	public void calculaInss();
	public void calculairrf();
	public void calculaSalarioLiquido();
}
