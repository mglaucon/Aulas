package Entity;

public class Pessoa {
	private String nome;
	private int idade;
	private double peso;
	
	//public Pessoa(){}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	
	public String getNome(){
		return nome;
	}
	public int getIdade(){
		return idade;
	}
	public double getPeso(){
		return peso;
	}
	
}
