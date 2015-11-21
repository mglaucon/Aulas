package Programas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class Exercicio2 extends JFrame{
	public Exercicio2(){
		super("Exercicio 2");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JMenuBar menuBar;
	private JMenu mArquivo;
	private JMenuItem jmiAbrir,jmiEditar,jmiImprimir,jmiSair;
	
	public void montaMenu(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mArquivo = new JMenu("Arquivo");
		jmiAbrir = new JMenuItem("Abrir");
		jmiEditar = new JMenuItem("Editar");
		jmiImprimir = new JMenuItem("Imprimir");
		jmiSair = new JMenuItem("Sair");
		
		menuBar.add(mArquivo);
		mArquivo.add(jmiAbrir);
		mArquivo.add(jmiEditar);
		mArquivo.add(jmiImprimir);
		mArquivo.addSeparator();
		mArquivo.add(jmiSair);
		
		jmiSair.addActionListener(new Sair());
	}
	
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args){
		Exercicio2 exe = new Exercicio2();
		exe.montaMenu();
	}
}
