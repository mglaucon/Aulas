package Programas;

public class exe4T extends Thread{
	public exe4T(String nome){
		super(nome);
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" -> "+super.getName());
			try{
				super.sleep((long) (Math.random()*500));
			}catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
		}
		System.out.println("Processo Finalizado!!");
	}
	
	public static void main(String[] args){
		exe4T x1 = new exe4T("Processo 1");
		exe4T x2 = new exe4T("Processo 2");
		x1.setPriority(5);
		x2.setPriority(7);
		x1.start();
		x2.start();
	}
}
