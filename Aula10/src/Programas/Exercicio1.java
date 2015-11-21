package Programas;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public Exercicio1(){
	}
	
	private float valor;
	
	public void ContaBancaria(){
		valor = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da transferencia:"));
		ValidaSenhaExer1 vs = new ValidaSenhaExer1();
		vs.Validador();
		JOptionPane.showMessageDialog(null, "Transferencia Efetuada!!\n"+"Valor: "+valor);
		JOptionPane.showConfirmDialog(null, "Deseja Imprimir o Contra Cheque?","Sim ou Não",JOptionPane.YES_NO_OPTION);
		
	}
	
	public static void main(String[] args){
		Exercicio1 ex = new Exercicio1();
		ex.ContaBancaria();
	}
}
