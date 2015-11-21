package Programas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exercicio3 extends JFrame{
	public Exercicio3(){
		super("Exercicio 2");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JMenuBar menuBar;
	private JMenu mFuncionario,mCargo,mCentroCusto,mProduto;
	private JMenuItem jmiIncluir,jmiAlterar,jmiExcluir,jmiConsultar,jmiSair;
	
	public void montaMenu(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mFuncionario = new JMenu("Funcionario");
		mCargo = new JMenu("Cargo");
		mCentroCusto = new JMenu("Centro de Custo");
		mProduto = new JMenu("Produto");
		jmiIncluir = new JMenuItem("Incluir");
		jmiAlterar = new JMenuItem("Alterar");
		jmiExcluir = new JMenuItem("Excluir");
		jmiConsultar = new JMenuItem("Consultar");
		jmiSair = new JMenuItem("Sair");
		
		menuBar.add(mFuncionario);
		menuBar.add(mCargo);
		menuBar.add(mCentroCusto);
		menuBar.add(mProduto);
		mFuncionario.add(jmiIncluir);
		mFuncionario.add(jmiAlterar);
		mFuncionario.add(jmiExcluir);
		mFuncionario.add(jmiConsultar);
		mFuncionario.addSeparator();
		mFuncionario.add(jmiSair);
		
		jmiIncluir.addActionListener(new Incluir());
		jmiAlterar.addActionListener(new Alterar());
		jmiExcluir.addActionListener(new Excluir());
		jmiConsultar.addActionListener(new Consultar());
		jmiSair.addActionListener(new Sair());
	}
	public class Incluir implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Opção escolhida: Inclusão de Funcionário");
		}
	}
	
	public class Alterar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Opção escolhida: Alteração de Funcionário");
		}
	}
	
	public class Excluir implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Opção escolhida: Exclusão de Funcionário");
		}
	}
	
	public class Consultar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			JOptionPane.showMessageDialog(null, "Opção escolhida: Consulta de Funcionário");
		}
	}
	
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args){
		Exercicio3 exe = new Exercicio3();
		exe.montaMenu();
	}
}
