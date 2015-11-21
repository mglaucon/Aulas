package Programas;

import javax.swing.JOptionPane;

public class Exemplo3 {
	public Exemplo3(){
	}
	
	private float saque;
	
	public void puxaDados(){
		saque = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite o valor do Saque:"));
		ValidaSenhaEx3 vs = new ValidaSenhaEx3();
		vs.Validador();
		JOptionPane.showMessageDialog(null, "Saque efetuado!\n"+"Valor: "+saque);
	}
	
	public static void main(String[] args){
		Exemplo3 ex = new Exemplo3();
		ex.puxaDados();
	}
}
