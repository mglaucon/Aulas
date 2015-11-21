package Programas;

public class exer1 implements Runnable{
	
	public void run(){
		System.out.println("Executando Thread");
	}
	
	public static void main(String[] args){
		exer1 x1 = new exer1();
		Thread td = new Thread(x1);
		td.start();
	}
}
