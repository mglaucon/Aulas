package Entity;


public class FolhaPagamento extends Pessoa {
	private double sBruto, salario, grati, impoRenda, inss;
	private int faltas;
	
	public void setSbruto(double sBruto){
		this.sBruto = sBruto;
	}
	public double getSbruto(){
		return sBruto;
	}
	public void setSalario(double salario){
		this.salario = salario;
	}
	public double getSalario(){
		return salario;
	}
	public void setGrati(double grati){
		this.grati = grati;
	}
	public double getGrati(){
		return grati;
	}
	public void setImpoRenda(double impoRenda){
		this.impoRenda = impoRenda;
	}
	public double getImpoRenda(){
		return impoRenda;
	}
	public void setInss(double inss){
		this.inss = inss;
	}
	public double getInss(){
		return inss;
	}
	public void setFaltas(int faltas){
		this.faltas = faltas;
	}
	public int getFaltas(){
		return faltas;
	}
}
