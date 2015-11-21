package Visao;


import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import Controle.ActionDoc;
import Controle.ActionItau;
import Controle.ActionTed;
import Controle.ActionSair;
import Modelo.MContaItau;
import Modelo.MTransfItau;

public class ContaCorrente extends JFrame{
	private MTransfItau mti;
	private MContaItau mci;
	
	private void setMti(MTransfItau m) {
		this.mti = m;
	}
	private void setMci(MContaItau m){
		this.mci = m;
	}
	
	private MTransfItau getMti() {
		return this.mti;
	}
	
	private MContaItau getMci(){
		return this.mci;
	}

	public ContaCorrente() {
		super("Banco Itaú CC");
		setSize(600,400);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	public ContaCorrente(MContaItau mci, MTransfItau mti) {
		super("Banco Itaú CC");
		
		this.setMci(mci);
		this.setMti(mti);
		
		setSize(600,400);
		setVisible(true);
		setLocationRelativeTo(null);
	}
	
	
	private JMenuBar menuBar;
	private JMenu jTransacao,jmiTransf;
	private JMenuItem jmiItau,jmiDoc,jmiTed,jmiSair;
	
	public void montaMenu(){
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		jTransacao = new JMenu("Transação");
		jmiTransf = new JMenu("Transferencia");
		jmiItau = new JMenuItem("Transf. Itau");
		jmiDoc = new JMenuItem("Transf. Doc");
		jmiTed = new JMenuItem("Transf. Ted");
		jmiSair = new JMenuItem("Sair");
		
		
		jTransacao.add(jmiTransf);
		jTransacao.add(jmiSair);
		jmiTransf.add(jmiItau);
		jmiTransf.add(jmiDoc);
		jmiTransf.add(jmiTed);
		
		menuBar.add(jTransacao);
		
		jmiItau.addActionListener(new ActionItau());
		jmiItau.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				dispose();
			}
		});		
		jmiDoc.addActionListener(new ActionDoc());
		jmiDoc.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				dispose();
			}
		});
		jmiTed.addActionListener(new ActionTed());
		jmiTed.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				dispose();
			}
		});
		jmiSair.addActionListener(new ActionSair());
		jmiSair.addMouseListener(new MouseAdapter() {
			public void mouseReleased(MouseEvent e){
				dispose();
			}
		});
	}
	
	private JLabel lblExtrato,lblSaldo,vlrSaldo,lblLis,vlrLis,lblTotal,vlrTotal,lblLanc,lblSaldoAnt,vlrSaldoAnt,
	lblTransf,vlrTransf,lblSaldoDia,vlrSaldoDia;
	
	public void montaTela(){
		setLayout(null);
		Container con = getContentPane();
		
		MContaItau mci = new MContaItau();
		
		lblExtrato = new JLabel("Extrato da Conta Corrente");
		lblSaldo = new JLabel("Saldo disponivel");
		lblLis = new JLabel("Lis (Sujeito a encargos)");
		lblTotal = new JLabel("Total p/ Saque");
		lblLanc = new JLabel("Lancamentos");
		lblSaldoAnt = new JLabel("Saldo Anterior");
		lblTransf = new JLabel("Transferencia");
		lblSaldoDia = new JLabel("Saldo do Dia");
		
		vlrSaldo = new JLabel(String.valueOf(mci.getSaldo()));
		vlrLis = new JLabel(String.valueOf(mci.getLis()));
		vlrTotal = new JLabel(String.valueOf(mci.getTotal()));
		vlrSaldoAnt = new JLabel(String.valueOf(this.mci.getSaldoAnt()));
		vlrTransf = new JLabel(String.valueOf(this.mti.getValor()));
		vlrSaldoDia = new JLabel(String.valueOf(mci.getSaldoDia()));
		
		lblExtrato.setBounds(70,30,150,25);
		lblSaldo.setBounds(70,70,100,25);
		lblLis.setBounds(70,95,150,25);
		lblTotal.setBounds(70,120,100,25);
		lblLanc.setBounds(70,160,100,25);
		lblSaldoAnt.setBounds(70,200,100,25);
		lblTransf.setBounds(70,225,100,25);
		lblSaldoDia.setBounds(70,250,100,25);
		
		vlrSaldo.setBounds(450,70,50,25);
		vlrLis.setBounds(450,95,50,25);
		vlrTotal.setBounds(450,120,50,25);
		vlrSaldoAnt.setBounds(450,200,50,25);
		vlrTransf.setBounds(450,225,50,25);
		vlrSaldoDia.setBounds(450,250,50,25);
		
		con.add(lblExtrato);
		con.add(lblSaldo);
		con.add(vlrSaldo);
		con.add(lblLis);
		con.add(vlrLis);
		con.add(lblTotal);
		con.add(vlrTotal);
		con.add(lblLanc);
		con.add(lblSaldoAnt);
		con.add(vlrSaldoAnt);
		con.add(lblTransf);
		con.add(vlrTransf);
		con.add(lblSaldoDia);
		con.add(vlrSaldoDia);
	}
	
}














