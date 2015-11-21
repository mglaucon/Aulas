package Programa;

public interface FolhaPagamento {
	
	final float PercInss = 8.5f;
	final float percIrrf = 3.5f;
	public void CalculaInss();
	public void CalculaIrrf();
	public void CalculaSalarioLiquido();

}
