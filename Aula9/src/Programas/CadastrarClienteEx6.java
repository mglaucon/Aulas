package Programas;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastrarClienteEx6 extends JFrame{
	private JLabel lblTituloTela,lblNome,lblEndereco,lblEstado;
	private JTextField txtNome,txtEndereco,txtEstado;
	private JButton jbGravar,jbSair,jbRetornar;
	
	public CadastrarClienteEx6() {
		super("Cadastramento de Cliente");
		setVisible(true);
		setSize(500, 300);
		setLocationRelativeTo(null);
	}
	
	public void inserirDados(){
		Container con = getContentPane();
		setLayout(null);
		
		lblTituloTela = new JLabel("Inclusão de Dados de Cliente");
		lblNome = new JLabel("Nome: ");
		lblEndereco = new JLabel("Endereço: ");
		lblEstado = new JLabel("Estado: ");
		txtNome = new JTextField();
		txtEndereco = new JTextField();
		txtEstado = new JTextField();
		jbRetornar = new JButton("Retornar");
		jbGravar = new JButton("Gravar");
		jbSair = new JButton("Sair");
		
		lblTituloTela.setBounds(200, 10, 200, 20);
		lblNome.setBounds(50, 40, 60, 20);
		lblEndereco.setBounds(50, 70, 60, 20);
		lblEstado.setBounds(50, 100, 60, 20);
		txtNome.setBounds(120, 40, 350, 25);
		txtEndereco.setBounds(120, 70, 350, 25);
		txtEstado.setBounds(120, 100, 200, 25); 
		jbRetornar.setBounds(80, 200, 100, 30);
		jbGravar.setBounds(200, 200, 100, 30); 
		jbSair.setBounds(320, 200, 100, 30);
		
		con.add(lblTituloTela);
		con.add(lblNome);
		con.add(lblEndereco);
		con.add(lblEstado);
		con.add(txtNome);
		con.add(txtEndereco);
		con.add(txtEstado);
		con.add(jbRetornar);
		con.add(jbGravar);
		con.add(jbSair);
		
		jbRetornar.addActionListener(new Retornar());
		jbGravar.addActionListener(new Gravar());
		jbSair.addActionListener(new Sair());
	}
	public class Retornar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			setVisible(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	public class Gravar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Dados Gravados\n"+"Nome: "+txtNome.getText()+"\nEndereço: "+
		txtEndereco.getText()+"\nEstado: "+txtEstado.getText());
		}
	}
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
		}
	}
}
