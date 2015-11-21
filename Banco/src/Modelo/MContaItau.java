package Modelo;

public class MContaItau {
	private double saldo = 2000,lis = 1000,total=0,saldoAnt=0,transf=0,saldoDia=0;
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		this.saldo = this.saldo - this.transf;
		return this.saldo;
	}
	
	public void setLis(double lis){
		this.lis = lis;
	}
	
	public double getLis(){
		return this.lis;
	}
	
	public void setTotal(double total){
		this.total = total;
	}
	
	public double getTotal(){
		this.total = this.saldo + this.lis;
		return this.total;
	}
	
	public void setSaldoAnt(double saldoAnt){
		this.saldoAnt = saldoAnt;
	}
	
	public double getSaldoAnt(){
		this.saldoAnt = this.saldo+this.transf;
		return this.saldoAnt;
	}
	
	public void setTransf(double transf){
		this.transf = transf;
	}
	
	public double getTransf(){
		return this.transf;
	}
	
	public void setSaldoDia(double saldoDia){
		this.saldoDia = saldoDia;
	}
	
	public double getSaldoDia(){
		this.saldoDia = this.saldoAnt-this.transf;
		return this.saldoDia;
	}
	
}
