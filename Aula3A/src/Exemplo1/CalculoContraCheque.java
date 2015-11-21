package Exemplo1;

import Exemplo1.FolhaPagamento;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculoContraCheque extends JFrame implements FolhaPagamento {

	private JLabel lblSalario;
	private JLabel lblInss;
	private JLabel lblImpostoRenda;
	private JLabel lblSalarioLiquido;
	private JTextField txtSalario;
	private JTextField txtInss;
	private JTextField txtImpostoRenda;
	private JTextField txtSalarioLiquido;
	private JButton btnCalcula;
	public float vlrSalario;
	public float vlrInss;
	public float vlrIrrf;
	public float vlrSalarioLiquido;
	
	public CalculoContraCheque(){
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void montaTela(){
		Container painel = getContentPane();
		painel.setLayout(null);
		
		lblSalario = new JLabel("Salario:");
		txtSalario = new JTextField(20);
		lblSalario.setBounds(50, 40, 100, 20);//coluna, linha, largura, altura
		txtSalario.setBounds(150, 40, 200, 25);//coluna, linha, largura, altura
		
		lblInss = new JLabel("Inss:");
		txtInss = new JTextField(5);
		txtInss.setEditable(false);
		lblInss.setBounds(50, 70, 100, 20);//coluna, linha, largura, altura
		txtInss.setBounds(150, 70, 200, 25);//coluna, linha, largura, altura
		
		lblImpostoRenda = new JLabel("Imposto Renda:");
		txtImpostoRenda = new JTextField(5);
		txtImpostoRenda.setEditable(false);
		lblImpostoRenda.setBounds(50, 100, 100, 20);//coluna, linha, largura, altura
		txtImpostoRenda.setBounds(150, 100, 200, 25);//coluna, linha, largura, altura
		
		lblSalarioLiquido = new JLabel("Salário Líquido:");
		txtSalarioLiquido = new JTextField(5);
		txtSalarioLiquido.setEditable(false);
		lblSalarioLiquido.setBounds(50, 130, 100, 20);//coluna, linha, largura, altura
		txtSalarioLiquido.setBounds(150, 130, 200, 25);//coluna, linha, largura, altura
		
		btnCalcula = new JButton("Calcular");
		btnCalcula.setBounds(190, 200, 100, 20);//coluna, linha, largura, altura
		
		painel.add(lblSalario);
		painel.add(txtSalario);
		painel.add(lblInss);
		painel.add(txtInss);
		painel.add(lblImpostoRenda);
		painel.add(txtImpostoRenda);
		painel.add(lblSalarioLiquido);
		painel.add(txtSalarioLiquido);
		painel.add(btnCalcula);
		
		//btnCalcula.addActionListener(new CalculaContraCheque());
	}
	
	public static void main(String[] args){
		CalculoContraCheque calculo = new CalculoContraCheque();
		calculo.montaTela();
	}
}














