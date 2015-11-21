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

public class Exemplo7 extends JFrame{
	private JMenuBar menuBar;
	private JMenu mFpag,mCargo,mCentroCusto;
	private JMenuItem jmiCalcCC,jmiIncluirCC,jmiSair;
	private JButton jbBotao1, jbBotao2, jbBotao3, jbSair;
	
	public Exemplo7(){
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
		
		mFpag = new JMenu("Folha de Pagamento");
		mCargo = new JMenu("Cargo");
		mCentroCusto = new JMenu("Centro de Custo");
		
		jmiCalcCC = new JMenuItem("Calcular CC");
		jmiIncluirCC = new JMenuItem("Imprimir CC");
		jmiSair = new JMenuItem("Sair");
		
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
		
		menuBar.add(mFpag);
		menuBar.add(mCargo);
		menuBar.add(mCentroCusto);
		
		mFpag.add(jmiCalcCC);
		mFpag.add(jmiIncluirCC);
		mFpag.add(jmiSair);
		
		jmiCalcCC.addActionListener(new ContraCheque());
		jmiSair.addActionListener(new Sair());
		jbSair.addActionListener(new Sair());
	}
	public class ContraCheque implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ContraChequeEx7 cc = new ContraChequeEx7();
			cc.defineFrame();
			cc.montaTela();
		}
	}
	
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	
	public static void main(String[] args){
		Exemplo7 exe = new Exemplo7();
		exe.montaMenu();
	}
}
