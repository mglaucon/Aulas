package Programas;

public class Exercicio1 implements Runnable{
	public void run(){
		System.out.println("Processo Runnable");
	}
	public static void main(String[] args){
		Exercicio1 td = new Exercicio1();
		Thread thr = new Thread(td);
		thr.start();
	}
}
