package Programas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
//import javax.swing.JMenuItem;

public class Exemplo2 extends JFrame{
	private JMenuBar menuBar;
	private JMenu mArquivo;
	private JMenu mCliente;
	private JMenu mFornecedor;
	private JMenu mVendedor;
	//private JMenu mSair;
	//private JMenuItem jmiSair;
	private JButton jbBotao1, jbBotao2, jbBotao3, jbSair;
	
	public Exemplo2(){
		super("Exemplo Menu");
		setVisible(true);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void montaMenu(){
		Container con = getContentPane();
		setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mArquivo = new JMenu("Arquivo");
		mCliente = new JMenu("Cliente");
		mFornecedor = new JMenu("Fornecedor");
		mVendedor = new JMenu("Vendedor");
		
		jbBotao1 = new JButton("Botao1");
		jbBotao1.setBounds(400, 860, 150, 25);
		jbBotao2 = new JButton("Botao2");
		jbBotao2.setBounds(600, 860, 150, 25);
		jbBotao3 = new JButton("Botao3");
		jbBotao3.setBounds(800, 860, 150, 25);
		jbSair = new JButton("Sair");
		jbSair.setBounds(1000, 860, 150, 25);
		
		con.add(jbBotao1);
		con.add(jbBotao2);
		con.add(jbBotao3);
		con.add(jbSair);
		
		menuBar.add(mArquivo);
		menuBar.add(mCliente);
		menuBar.add(mFornecedor);
		menuBar.add(mVendedor);
		
		jbSair.addActionListener(new Sair());
	}
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	
	public static void main(String[] args){
		Exemplo2 exe = new Exemplo2();
		
		exe.montaMenu();
	}
}
