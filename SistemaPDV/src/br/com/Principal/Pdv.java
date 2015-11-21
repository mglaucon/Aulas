package br.com.Principal;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pdv extends JFrame{
	public Pdv(){
		super("Sistema Comercial de Venda");
		setSize(800,600);
		setVisible(true);
		setLocationRelativeTo(null);
		setExtendedState(MAXIMIZED_BOTH);
		//setResizable(false);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JMenuBar menuBar;
	private JMenu mCadastro,mEstoque,mFinanceiro,mFiscal,mConsulta,mRelatorio,mConfiguracao,mAtivaCaixa,mSair;
	private JMenuItem jmiGerarRelatorio,jmiCadCliente,jmiCadVendedor,jmiCadCaixa;
	
	public void SistemaVendaMenu(){
		setLayout(null);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mCadastro = new JMenu("Cadastro");
		mEstoque = new JMenu("Estoque");
		mFinanceiro = new JMenu("Financeiro");
		mFiscal = new JMenu("Fiscal");
		mConsulta = new JMenu("Consulta");
		mRelatorio = new JMenu("Relatório");
		mAtivaCaixa = new JMenu("Ativa/Troca Operador");
		mConfiguracao = new JMenu("Configuração");
		mSair = new JMenu("Sair");
		
		jmiCadCliente = new JMenuItem("Cadastrar cliente");
		jmiCadCaixa = new JMenuItem("Cadastrar caixa");
		jmiCadVendedor = new JMenuItem("Cadastrar vendedor");
		jmiGerarRelatorio = new JMenuItem("Gerar Relatório");
		
		menuBar.add(mCadastro);
		menuBar.add(mEstoque);
		menuBar.add(mFinanceiro);
		menuBar.add(mFiscal);
		menuBar.add(mConsulta);
		menuBar.add(mRelatorio);
		menuBar.add(mAtivaCaixa);
		menuBar.add(mConfiguracao);
		menuBar.add(mSair);
		
		mCadastro.add(jmiCadCliente);
		mCadastro.add(jmiCadCaixa);
		mCadastro.add(jmiCadVendedor);
		mRelatorio.add(jmiGerarRelatorio);
		
		mSair.addMenuListener(new MenuListener() {
			public void menuSelected(MenuEvent e) {
				System.exit(0);
			}
			public void menuDeselected(MenuEvent e) {}
			public void menuCanceled(MenuEvent e) {}
		});
	}
}
