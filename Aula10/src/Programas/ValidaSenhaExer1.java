package Programas;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

public class ValidaSenhaExer1 {
	public ValidaSenhaExer1(){
	}
	
	private JPanel painel;
	private JLabel lblSenha;
	private JPasswordField pswSenha;
	static String senha = "123";
	private String senhaDig = null;
	
	public void Validador(){
		painel = new JPanel();
		
		lblSenha = new JLabel("Digite a senha:");
		pswSenha = new JPasswordField(10);
		pswSenha.setEchoChar('#');
		
		painel.add(lblSenha);
		painel.add(pswSenha);
		
		JOptionPane.showMessageDialog(null, painel, "Valida Senha",JOptionPane.PLAIN_MESSAGE);
		senhaDig = pswSenha.getText();
		
		int ctrlSenha = 0;
		while(ctrlSenha == 0){
			if(senhaDig.equals(senha)){
				ctrlSenha = 1;
			}else{
				JOptionPane.showMessageDialog(null, "Senha Incorreta!!");
				pswSenha.setText("");
				JOptionPane.showMessageDialog(null, painel, "Valida Senha",JOptionPane.PLAIN_MESSAGE);
				senhaDig = pswSenha.getText();
			}
		}
	}
	
}
