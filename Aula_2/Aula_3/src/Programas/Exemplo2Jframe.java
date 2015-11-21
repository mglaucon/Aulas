package Programas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.FlowLayout;
import java.awt.GridLayout;

public class Exemplo2Jframe extends JFrame{
	
	private JPanel painel;
	private JLabel lblMatricula;
	private JTextField txtNome;
	private JButton botao;
	private JButton botao2;
	private FlowLayout layout;
	private GridLayout gride;
	
	public Exemplo2Jframe(){}
	
	public void inicializaFrame(){
		setSize(300, 160); //largura e altura
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void montaTela(){
		layout = new FlowLayout(); //cria o objeto FlowLayout
		
		layout.setAlignment(FlowLayout.LEFT);
		setLayout(layout); //define o layout do container
		
		gride = new GridLayout(2, 2, 1, 1); //linhas, colunas, espaçamento, vert horiz
		
		painel = new JPanel();
		painel.setLayout(gride);
		
		lblMatricula = new JLabel("Matricula: ");
		
		txtNome = new JTextField(10);
		
		botao = new JButton("Click");
		botao2 = new JButton("Click2");
		
		painel.add(lblMatricula);
		painel.add(txtNome);
		painel.add(botao);
		painel.add(botao2);
		super.add(painel);
	}
}
