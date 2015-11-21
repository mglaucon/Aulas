package Modelo;


public class MTransfItau {
	private int agencia,conta,senha=2211;
	private double valor;
	
	public void setAgencia(int agencia){
		this.agencia = agencia;
	}
	
	public int getAgencia(){
		return this.agencia;
	}
	
	public void setConta(int conta){
		this.conta = conta;
	}
	
	public int getConta(){
		return this.conta;
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public int getSenha(){
		return this.senha;
	}
	
	public void setValor(double valor){
		this.valor = valor;
	}
	
	public double getValor(){
		return this.valor;
	}
}
