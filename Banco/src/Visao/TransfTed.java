package Visao;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class TransfTed extends JFrame{

	public TransfTed() {
		super("Transferencia Ted");
		setSize(600,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	private JLabel lblAgencia,lblConta,lblValor,lblSenha,lblNome,lblCpf;
	private JTextField txtAgencia,txtConta,txtValor,txtSenha,txtDig,txtNome,txtCpf;
	private JButton jbContinuar;
	
	public void montaTela(){
		Container con = getContentPane();
		setLayout(null);
		
		lblNome = new JLabel("Nome");
		txtNome = new JTextField();
		lblCpf = new JLabel("CPF");
		txtCpf = new JTextField();
		lblAgencia = new JLabel("Agencia");
		txtAgencia = new JTextField();
		lblConta = new JLabel("Conta");
		txtConta = new JTextField();
		txtDig = new JTextField();
		lblValor = new JLabel("Valor");
		txtValor = new JTextField();
		lblSenha = new JLabel("Senha do Cartão");
		txtSenha = new JTextField();
		jbContinuar = new JButton("Transferir");
		
		txtNome.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtAgencia.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtConta.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtDig.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtCpf.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtValor.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtSenha.setBorder(new LineBorder(new Color(0,0,0),0,true));
		
		
		lblNome.setBounds(132,50,50,25);
		lblAgencia.setBounds(120,80,50,25);
		lblConta.setBounds(295,80,50,25);
		lblCpf.setBounds(140,110,50,25);
		lblValor.setBounds(298,110,50,25);
		lblSenha.setBounds(190,160,100,25);
		txtNome.setBounds(190,50,250,25);
		txtAgencia.setBounds(190,80,85,25);
		txtConta.setBounds(355,80,50,25);
		txtDig.setBounds(415,80,25,25);
		txtCpf.setBounds(190,110,85,25);
		txtValor.setBounds(355,110,85,25);
		txtSenha.setBounds(295,160,85,25);
		jbContinuar.setBounds(250,205,100,30);
		
		
		con.add(lblNome);
		con.add(txtNome);
		con.add(lblCpf);
		con.add(txtCpf);
		con.add(lblAgencia);
		con.add(lblConta);
		con.add(lblValor);
		con.add(lblSenha);
		con.add(txtAgencia);
		con.add(txtConta);
		con.add(txtDig);
		con.add(txtValor);
		con.add(txtSenha);
		
		con.add(jbContinuar);
	}

}
