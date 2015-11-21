package Programas;

import java.awt.MenuBar;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

public class Exemplo1 extends JFrame{
	JMenuBar menuBar;
	JMenu mArquivo;
	JMenu mCliente;
	JMenu mFornecedor;
	JMenu mVendedor;
	
	public Exemplo1(){
		super("Exemplo Menu");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void montaMenu(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mArquivo = new JMenu("Arquivo");
		mCliente = new JMenu("Cliente");
		mFornecedor = new JMenu("Fornecedor");
		mVendedor = new JMenu("Vendedor");
		
		menuBar.add(mArquivo);
		menuBar.add(mCliente);
		menuBar.add(mFornecedor);
		menuBar.add(mVendedor);
		
	}
	
	public static void main(String[] args){
		Exemplo1 exe = new Exemplo1();
		
		exe.montaMenu();
	}
}
