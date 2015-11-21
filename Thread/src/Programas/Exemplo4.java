package Programas;

public class Exemplo4 extends Thread{
	public Exemplo4(String nome){
		super(nome);
	}
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println(i+" -> "+super.getName());
			try{
				super.sleep((long) (Math.random() * 500));
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Processo Finalizado!!");
	}
	public static void main(String[] args){
		Exemplo4 p1 = new Exemplo4("Processo 1");
		Exemplo4 p2 = new Exemplo4("Processo 2");
		p1.setPriority(5);
		p2.setPriority(7);
		p1.start();
		p2.start();
	}
}
