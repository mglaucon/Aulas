package Programas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Exercicio4 extends JFrame{
	public Exercicio4(){
		super("Exercicio 2");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JMenuBar menuBar;
	private JMenu mArquivo,mAluno,mDisciplina;
	private JMenuItem jmiIncluirA,jmiAlterarA,jmiConsultarA,jmiExcluirA,jmiSair,
							jmiIncluirD,jmiAlterarD,jmiConsultarD,jmiExcluirD;
	
	public void montaMenu(){
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mArquivo = new JMenu("Arquivo");
		mAluno = new JMenu("Aluno");
		mDisciplina = new JMenu("Disciplina");
		
		jmiIncluirA = new JMenuItem("Incluir");
		jmiAlterarA = new JMenuItem("Alterar");
		jmiConsultarA = new JMenuItem("Consultar");
		jmiExcluirA = new JMenuItem("Excluir");
		jmiSair = new JMenuItem("Sair");
		
		jmiIncluirD = new JMenuItem("Incluir");
		jmiAlterarD = new JMenuItem("Alterar");
		jmiConsultarD = new JMenuItem("Consultar");
		jmiExcluirD = new JMenuItem("Excluir");
		
		menuBar.add(mArquivo);
		menuBar.add(mAluno);
		menuBar.add(mDisciplina);
		
		mAluno.add(jmiIncluirA);
		mAluno.add(jmiAlterarA);
		mAluno.add(jmiExcluirA);
		mAluno.add(jmiConsultarA);
		mAluno.addSeparator();
		mAluno.add(jmiSair);
		
		mDisciplina.add(jmiIncluirD);
		mDisciplina.add(jmiAlterarD);
		mDisciplina.add(jmiExcluirD);
		mDisciplina.add(jmiConsultarD);
		
		jmiIncluirA.addActionListener(new CadastroAluno());
		jmiIncluirD.addActionListener(new CadastroDisciplina());
		jmiSair.addActionListener(new Sair());
	}
	public class CadastroAluno implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CadastrarAlunoExer4 cad = new CadastrarAlunoExer4();
			cad.montaTela();
		}
	}
	
	public class CadastroDisciplina implements ActionListener{
		public void actionPerformed(ActionEvent e){
			CadastrarDisciplinaExer4 cad = new CadastrarDisciplinaExer4();
			cad.montaTela();
		}
	}
	
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args){
		Exercicio4 exe = new Exercicio4();
		exe.montaMenu();
	}
}
