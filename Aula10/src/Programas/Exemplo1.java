package Programas;

import javax.swing.JFrame;
import java.awt.Container;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Exemplo1 extends JFrame{
	public Exemplo1(){
		super("Testando Password");
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	private JLabel lblUsuario,lblSenha;
	private JTextField txtUsuario;
	private JPasswordField pswSenha;
	private JButton jbLogin;
	static String senha = "123";
	String senhaDig = null;
	
	public void montaTela(){
		Container con = getContentPane();
		setLayout(null);
		
		lblUsuario = new JLabel("Usuário:");
		lblUsuario.setBounds(50,50,80,25);
		con.add(lblUsuario);
		txtUsuario = new JTextField();
		txtUsuario.setBounds(120,50,80,25);
		con.add(txtUsuario);
		lblSenha = new JLabel("Senha:");
		lblSenha.setBounds(50,90,80,25);
		con.add(lblSenha);
		pswSenha = new JPasswordField();
		pswSenha.setEchoChar('*');
		pswSenha.setBounds(120,90,120,25);
		con.add(pswSenha);
		
		jbLogin = new JButton("Login");
		jbLogin.setBounds(140,150,80,25);
		con.add(jbLogin);
		
		jbLogin.addActionListener(new Login());
	}
	public class Login implements ActionListener{
		public void actionPerformed(ActionEvent e){
			senhaDig = new String(pswSenha.getPassword());
			if(senhaDig.equals(senha)){
				JOptionPane.showMessageDialog(null, "Senha Correta!!");
			}else{
				JOptionPane.showMessageDialog(null, "Senha Errada!!");
			}
		}
	}
	
	public static void main(String[] args){
		Exemplo1 ex = new Exemplo1();
		ex.montaTela();
	}
}
