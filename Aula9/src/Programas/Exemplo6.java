package Programas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exemplo6 extends JFrame{
	private JMenuBar menuBar;
	private JMenu mCliente;
	private JMenuItem jmiIncluir,jmiAlterar,jmiConsultar,jmiExcluir,jmiRelatorio,jmiSair,
						jmiRrel1,jmiRrel2,jmiRrel3,jmiRrel4,jmiRrel5,jmiRrel6;
	private JButton jbBotao1, jbBotao2, jbBotao3, jbSair;
	
	public Exemplo6(){
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
		
		mCliente = new JMenu("Cliente");;
		
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
		jmiRrel6 = new JMenuItem("Cadastro de Clientes");
		
		jbBotao1 = new JButton("Botao1");
		jbBotao1.setBounds(300, 560, 150, 25);
		jbBotao2 = new JButton("Botao2");
		jbBotao2.setBounds(500, 560, 150, 25);
		jbBotao3 = new JButton("Botao3");
		jbBotao3.setBounds(700, 560, 150, 25);
		jbSair = new JButton("Sair");
		jbSair.setBounds(900, 560, 150, 25);
		
		con.add(jbBotao1);
		con.add(jbBotao2);
		con.add(jbBotao3);
		con.add(jbSair);
		
		menuBar.add(mCliente);
		
		mCliente.add(jmiIncluir);
		mCliente.add(jmiAlterar);
		mCliente.add(jmiConsultar);
		mCliente.add(jmiExcluir);
		mCliente.add(jmiRelatorio);
		mCliente.add(jmiSair);
		
		jmiRelatorio.add(jmiRrel1);
		jmiRelatorio.add(jmiRrel2);
		jmiRelatorio.add(jmiRrel3);
		jmiRelatorio.add(jmiRrel4);
		jmiRelatorio.add(jmiRrel5);
		jmiRelatorio.add(jmiRrel6);
		
		jmiIncluir.addActionListener(new CadastroCliente());
		
		jmiSair.addActionListener(new Sair());
		jbSair.addActionListener(new Sair());
	}
	public class CadastroCliente implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CadastrarClienteEx6 cad = new CadastrarClienteEx6();
			cad.inserirDados();
		}
	}
	
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	
	public static void main(String[] args){
		Exemplo6 exe = new Exemplo6();
		
		exe.montaMenu();
	}
}
