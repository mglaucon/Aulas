package Programas;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JSeparator;

public class Exemplo5 extends JFrame{
	private JMenuBar menuBar;
	private JMenu mCliente;
	private JMenuItem jmiIncluir,jmiAlterar,jmiConsultar,jmiExcluir,jmiRelatorio,jmiSair,
						jmiRrel1,jmiRrel2,jmiRrel3,jmiRrel4,jmiRrel5,jmiRrel6,
						jmiPj,jmiPf;
	private JSeparator separador;
	
	public Exemplo5(){
		super("MenuItem");
		setSize(400,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void montaMenu(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		separador = new JSeparator();
		
		mCliente = new JMenu("Cliente");
		jmiIncluir = new JMenuItem("Incluir");
		jmiAlterar = new JMenuItem("Alterar");
		jmiConsultar = new JMenuItem("Consultar");
		jmiExcluir = new JMenuItem("Excluir");
		jmiRelatorio = new JMenu("Relatório");
		jmiSair = new JMenuItem("Sair");
		
		jmiRrel1 = new JMenuItem("Vendas do dia");
		jmiRrel2 = new JMenuItem("Vendas do mês");
		jmiRrel3 = new JMenuItem("Duplicatas em atraso(30 dias)");
		jmiRrel4 = new JMenuItem("Duplicatas em atraso(60 dias)");
		jmiRrel5 = new JMenuItem("Duplicatas em atraso(Mais de 60 dias");
		jmiRrel6 = new JMenu("Cadastro de Clientes");
		
		jmiPf = new JMenuItem("Pessoa Física");
		jmiPj = new JMenuItem("Pessoa Jurídica");
		
		jmiRelatorio.add(jmiRrel1);
		jmiRelatorio.add(jmiRrel2);
		jmiRelatorio.add(jmiRrel3);
		jmiRelatorio.add(jmiRrel4);
		jmiRelatorio.add(jmiRrel5);
		jmiRelatorio.add(jmiRrel6);
		
		menuBar.add(mCliente);
		mCliente.add(jmiIncluir);
		mCliente.add(jmiAlterar);
		mCliente.add(jmiConsultar);
		mCliente.add(jmiExcluir);
		mCliente.add(jmiRelatorio);
		mCliente.add(separador);
		mCliente.add(jmiSair);
		
		jmiRrel6.add(jmiPf);
		jmiRrel6.add(jmiPj);
	}
	
	public static void main(String[] args){
		Exemplo5 exe = new Exemplo5();
		
		exe.montaMenu();
	}
}
