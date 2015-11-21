package Programas;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;

public class Exemplo3 extends JFrame{
	private JMenuBar menuBar;
	private JMenu mCliente;
	private JMenuItem jmiIncluir,jmiAlterar,jmiConsultar,jmiExcluir,jmiRelatorio,jmiSair;
	private JSeparator separador;
	
	public Exemplo3(){
		super("MenuItem Exemplo");
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void montaMenu(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		//separador = new JSeparator();
		
		mCliente = new JMenu("Cliente");
		jmiIncluir = new JMenuItem("Incluir");
		jmiAlterar = new JMenuItem("Alterar");
		jmiConsultar = new JMenuItem("Consultar");
		jmiExcluir = new JMenuItem("Excluir");
		jmiRelatorio = new JMenuItem("Relatorio");
		jmiSair = new JMenuItem("Sair");
		
		menuBar.add(mCliente);
		mCliente.add(jmiIncluir);
		mCliente.add(jmiAlterar);
		mCliente.add(jmiConsultar);
		mCliente.add(jmiExcluir);
		mCliente.add(jmiRelatorio);
		//mCliente.add(separador);
		mCliente.addSeparator();
		mCliente.add(jmiSair);
	}
	
	public static void main(String[] args){
		Exemplo3 exe = new Exemplo3();
		
		exe.montaMenu();
	}
}
