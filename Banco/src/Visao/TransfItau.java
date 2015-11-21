package Visao;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Controle.PlainDocumentos;
import Modelo.MContaItau;
import Modelo.MTransfItau;

public class TransfItau extends JFrame{

	public TransfItau() {
		super("Transferencia Itaú");
		setSize(400,300);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	private JLabel lblAgencia,lblConta,lblValor,lblSenha;
	private JTextField txtAgencia,txtConta,txtValor,txtDig;
	private JButton jbContinuar;
	private JPasswordField pswSenha;
	
	public void montaTela(){
		Container con = getContentPane();
		setLayout(null);
		
		lblAgencia = new JLabel("Agencia");
		txtAgencia = new JTextField();
		lblConta = new JLabel("Conta");
		txtConta = new JTextField();
		txtDig = new JTextField();
		lblValor = new JLabel("Valor");
		txtValor = new JTextField();
		lblSenha = new JLabel("Senha do Cartão");
		pswSenha = new JPasswordField();
		jbContinuar = new JButton("Transferir");
		
		
		txtAgencia.setDocument(new PlainDocumentos(4));
		txtConta.setDocument(new PlainDocumentos(5));
		txtDig.setDocument(new PlainDocumentos(1));
		txtValor.setDocument(new PlainDocumentos(6));
		
		txtAgencia.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtConta.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtDig.setBorder(new LineBorder(new Color(0,0,0),0,true));
		txtValor.setBorder(new LineBorder(new Color(0,0,0),0,true));
		pswSenha.setBorder(new LineBorder(new Color(0,0,0),0,true));
		
		lblAgencia.setBounds(130,60,50,25);
		lblConta.setBounds(142,90,50,25);
		lblValor.setBounds(143,120,50,25);
		lblSenha.setBounds(80,150,100,25);
		txtAgencia.setBounds(200,60,85,25);
		txtConta.setBounds(200,90,50,25);
		txtDig.setBounds(260,90,25,25);
		txtValor.setBounds(200,120,85,25);
		pswSenha.setBounds(200,150,85,25);
		jbContinuar.setBounds(140,210,100,30);
		
		jbContinuar.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				MTransfItau mti = new MTransfItau();
				MContaItau mci = new MContaItau();
				
				mti.setAgencia(Integer.parseInt(txtAgencia.getText()));
				mti.setConta(Integer.parseInt(txtConta.getText()));
				mti.setValor(Integer.parseInt(txtValor.getText()));
				
				ContaCorrente cc;
				
				if(!txtValor.getText().isEmpty()){
					cc = new ContaCorrente(mci,mti);
					cc.montaMenu();
					cc.montaTela();
					dispose();
					
					
					
				}
				
			}
		});
		
		con.add(lblAgencia);
		con.add(lblConta);
		con.add(lblValor);
		con.add(lblSenha);
		con.add(txtAgencia);
		con.add(txtConta);
		con.add(txtDig);
		con.add(txtValor);
		con.add(pswSenha);
		
		con.add(jbContinuar);
		
	}

}
