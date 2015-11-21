package Programas;

public class exe3T extends Thread{
	public exe3T(String nome){
		super(nome);
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" -> "+super.getName());
		}
		System.out.println("Processo Finalizado!!");
	}
	
	public static void main(String[] args){
		exe3T x1 = new exe3T("Processo 1");
		exe3T x2 = new exe3T("Processo 2");
		//exe3T x3 = new exe3T("Processo 3");
		x1.setPriority(5);
		x2.setPriority(7);
		//x3.setPriority(7);
		x1.start();
		x2.start();
		//x3.start();
	}
}
