package Programas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastrarDisciplinaExer4 extends JFrame{
	public CadastrarDisciplinaExer4(){
		super("Cadastrar Disciplina");
		setSize(600,450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JLabel lblCodigo,lblNome;
	private JTextField txtCodigo,txtNome;
	private JButton jbGravar,jbSair;
	
	public void montaTela(){
		Container con = getContentPane();
		setLayout(null);
		
		lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(80,50,80,30);
		con.add(lblCodigo);
		txtCodigo = new JTextField();
		txtCodigo.setBounds(160,50,120,30);
		con.add(txtCodigo);
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(80,90,80,30);
		con.add(lblNome);
		txtNome = new JTextField();
		txtNome.setBounds(160,90,350,30);
		con.add(txtNome);
		
		jbGravar = new JButton("Gravar");
		jbGravar.setBounds(120,300,120,30);
		con.add(jbGravar);
		jbSair = new JButton("Sair");
		jbSair.setBounds(360,300,120,30);
		con.add(jbSair);
		
		jbSair.addActionListener(new Sair());
	}
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			setVisible(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
}
