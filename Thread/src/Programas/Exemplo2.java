package Programas;

public class Exemplo2 extends Thread {
	public void run(){
		System.err.println("Esta Thread será executada!!");
	}
	
	public static void main(String[] args){
		Exemplo2 thread = new Exemplo2();
		Thread trd = new Thread(thread);
		trd.start();
	}
}
