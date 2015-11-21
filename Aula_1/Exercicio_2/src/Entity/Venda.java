package Entity;

public class Venda extends Pessoa{
	private int anoMesVenda;
	private double vlrVenda;
	private double comissao;
	
	public void setAnoMesVenda(int anoMesVenda){
		this.anoMesVenda = anoMesVenda;
	}
	public int getAnoMesVenda(){
		return anoMesVenda;
	}
	public void setVlrVenda(double vlrVenda){
		this.vlrVenda = vlrVenda;
	}
	public double getVlrVenda(){
		return vlrVenda;
	}
	public void setComissao(double comissao){
		this.comissao = comissao;
	}
	public double getComissao(){
		return (comissao * this.vlrVenda)/100;
	}
}
