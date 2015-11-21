package Programas;

public class Exemplo3 extends Thread{
	Exemplo3(String nome){
		super(nome);
	}
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" -> "+super.getName());
		}
		System.out.println("Thread Finalizado!!");
	}
	public static void main(String[] args){
		Exemplo3 thread_1 = new Exemplo3("Executando Thread-1");
		Exemplo3 thread_2 = new Exemplo3("Executando Thread-2");
		thread_1.setPriority(5);
		thread_2.setPriority(7);
		thread_1.start();
		thread_2.start();
	}
}
