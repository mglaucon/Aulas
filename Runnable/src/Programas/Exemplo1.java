package Programas;

public class Exemplo1 implements Runnable{
	private String nome;
	private int prioridade;
	
	Exemplo1(String nome, int prioridade){
		this.nome = nome;
		this.prioridade = prioridade;
	}
	public void run(){
		Thread.currentThread().setPriority(prioridade);
		Thread.currentThread().setName(nome);
		
		for(int i=0;i<20;i++){
			System.out.println(i+" -> "+ Thread.currentThread().getName());
			
			try{
				Thread.sleep((long) (Math.random() * 500));
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Fim do processamento -> "+ Thread.currentThread().getName());
	}
	public static void main(String[] args){
		Exemplo1 p1 = new Exemplo1("Processo A", 7);
		Exemplo1 p2 = new Exemplo1("Processo B", 3);
		
		new Thread(p1).start();
		new Thread(p2).start();
	}
}
