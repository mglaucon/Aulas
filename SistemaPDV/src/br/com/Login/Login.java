package br.com.Login;

import java.awt.Container;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import br.com.Principal.Pdv;

public class Login extends JFrame{
	public Login(){
		super("Login");
		setSize(400,300);
		setVisible(true);
		setLocationRelativeTo(null);
		//setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JLabel lblUser,lblPassword;
	private JTextField txtUser;
	private JPasswordField pswPassword;
	private JButton jbAcessar,jbCanc;
	private String usuario = null;
	private String senha = null;
	protected static int log = 0, msg = 0;
	
	
	public void TelaAcesso(){
		Container con = getContentPane();
		setLayout(null);
		
		lblUser = new JLabel("Usuário:");
		lblPassword = new JLabel("Senha:");
		txtUser = new JTextField();
		pswPassword = new JPasswordField();
		jbAcessar = new JButton("Acessar");
		jbCanc = new JButton("Cancelar");
		
		lblUser.setBounds(80,60,80,25);
		txtUser.setBounds(150,60,150,25);
		lblPassword.setBounds(80,110,80,25);
		pswPassword.setBounds(150,110,150,25);
		jbAcessar.setBounds(80,170,100,25);
		jbCanc.setBounds(200,170,100,25);
		
		jbAcessar.addActionListener(new Acessar());
		jbCanc.addActionListener(new Sair());
		
		con.add(lblUser);
		con.add(txtUser);
		con.add(lblPassword);
		con.add(pswPassword);
		con.add(jbAcessar);
		con.add(jbCanc);
	}
	public class Acessar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			usuario = txtUser.getText();
			senha = pswPassword.getText();
			
			Entrada ent = new Entrada();
			ent.setUsuario(usuario);
			ent.setSenha(senha);
			Banco banco = new Banco();
			banco.Conectar();
			banco.Login(usuario,senha);
			if(log == 1)	dispose();
			//if(msg == 1)	JOptionPane.showMessageDialog(null, "Usuario ou Senha incorreta!!");
		}
	}
	
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args){
		Login log = new Login();
		log.TelaAcesso();
	}
}
