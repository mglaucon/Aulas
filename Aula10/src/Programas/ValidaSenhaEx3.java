package Programas;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class ValidaSenhaEx3{
	public ValidaSenhaEx3(){
	}
	
	private JPanel painel;
	private JLabel lblDig;
	private JPasswordField pswDig;
	private String senha = "123";
	private String senhaDig = null;
	
	public void Validador(){
		painel = new JPanel();
		
		lblDig = new JLabel("Digite a Senha:");
		pswDig = new JPasswordField(10);
		pswDig.setEchoChar('#');
		
		painel.add(lblDig);
		painel.add(pswDig);
		
		JOptionPane.showMessageDialog(null, painel, "Valida Senha:",JOptionPane.PLAIN_MESSAGE);
		
		senhaDig = pswDig.getText();
		int ctrlSenha = 0;
		while(ctrlSenha == 0){
			if(senhaDig.equals(senha)){
				ctrlSenha = 1;
			}else{
				JOptionPane.showMessageDialog(null, "Senha Incorreta!!");
				pswDig.setText("");
				JOptionPane.showMessageDialog(null, painel,"Valida Senha:",JOptionPane.PLAIN_MESSAGE);
				senhaDig = pswDig.getText();
			}
		}
	}
}
