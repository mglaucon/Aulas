package Programas;

public class exe1T extends Thread{
	public void run(){
		System.out.println("Executando Thread");
	}
	public static void main(String[] args){
		exe1T x = new exe1T();
		Thread td = new Thread(x);
		td.start();
	}
}
