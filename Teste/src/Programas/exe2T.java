package Programas;

public class exe2T extends Thread{
	public exe2T(String nome){
		super(nome);
	}
	
	public void run(){
		for(int i=0;i<10;i++){
			System.out.println(i+" -> "+ super.getName());
		}
	}
	
	public static void main(String[] args) {
		exe2T x1 = new exe2T("Processo 1");
		exe2T x2 = new exe2T("Processo 2");
		x1.start();
		x2.start();
	}

}
