package Programas;

public class exe1R implements Runnable{
	private String nome;
	private int priori;
	
	public exe1R(String nome, int priori){
		this.nome = nome;
		this.priori = priori;
	}
	
	public void run(){
		Thread.currentThread().setPriority(priori);
		Thread.currentThread().setName(nome);
		for(int i=0;i<10;i++){
			System.out.println(i+" -> "+Thread.currentThread().getName());
			try{
				Thread.sleep((long) (Math.random()*500));
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Processo Finalizado: "+ Thread.currentThread().getName());
	}
	
	public static void main(String[] args){
		exe1R x1 = new exe1R("Processo A", 7);
		exe1R x2 = new exe1R("Processo B", 3);
		new Thread(x1).start();
		new Thread(x2).start();
	}
}
