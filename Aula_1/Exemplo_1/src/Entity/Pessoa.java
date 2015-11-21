package Entity;

public class Pessoa {
	public String nome;
	public int idade;
	public double peso;
	
	public Pessoa(String nome, int idade, double peso){
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
	}
	public void Imprime(){
		System.out.println(nome + " " + idade + " " + peso);
	}
}
