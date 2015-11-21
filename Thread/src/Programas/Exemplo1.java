package Programas;

public class Exemplo1 extends Thread{
	public Exemplo1(String nome){
		super(nome);
	}
	public void run(){
		for(int i =0;i<10;i++){
			System.out.println(i+" -> "+ super.getName());
		}
	}
	public static void main(String[] args){
		Exemplo1 thread_1 = new Exemplo1("Executando Thread-1");
		Exemplo1 thread_2 = new Exemplo1("Executando Thread-2");
		thread_1.start();
		thread_2.start();
	}
}
