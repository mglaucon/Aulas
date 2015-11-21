package Exemplo2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculoContraCheque extends JFrame{

	private JLabel lblSalario;
	private JLabel lblVendas;
	private JLabel lblQtdeHoras;
	private JLabel lblTipoFolha;
	private JTextField txtSalario;
	private JTextField txtVendas;
	private JTextField txtQtdeHoras;
	private JTextField txtTipoFolha;
	private JButton btnCalcula;
	public float vlrSalario;
	public float vlrVendas;
	public float vlrIrrf;
	int qtdeHoras;
	int tipoFolha;
	
	public CalculoContraCheque() {
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void montaTela() {
		Container painel = getContentPane();
		painel.setLayout(null);
		
		lblSalario = new JLabel("Salario:");
		txtSalario = new JTextField(20);
		lblSalario.setBounds(50, 40, 100, 20);//coluna, linha, largura, altura
		txtSalario.setBounds(150, 40, 200, 25);//coluna, linha, largura, altura
		
		lblVendas = new JLabel("Vendas:");
		txtVendas = new JTextField(5);
		lblVendas.setBounds(50, 70, 100, 20);//coluna, linha, largura, altura
		txtVendas.setBounds(150, 70, 200, 25);//coluna, linha, largura, altura
		
		lblQtdeHoras = new JLabel("Qtde Horas:");
		txtQtdeHoras = new JTextField(5);
		lblQtdeHoras.setBounds(50, 100, 100, 20);//coluna, linha, largura, altura
		txtQtdeHoras.setBounds(150, 100, 200, 25);//coluna, linha, largura, altura
		
		lblTipoFolha = new JLabel("Tipo Folha:");
		txtTipoFolha = new JTextField(5);
		lblTipoFolha.setBounds(50, 130, 100, 20);//coluna, linha, largura, altura
		txtTipoFolha.setBounds(150, 130, 200, 25);//coluna, linha, largura, altura
		
		btnCalcula = new JButton("Calcular");
		btnCalcula.setBounds(190, 200, 100, 20);//coluna, linha, largura, altura
		
		painel.add(lblSalario);
		painel.add(txtSalario);
		painel.add(lblVendas);
		painel.add(txtVendas);
		painel.add(lblQtdeHoras);
		painel.add(txtQtdeHoras);
		painel.add(lblTipoFolha);
		painel.add(txtTipoFolha);
		painel.add(btnCalcula);
		
		btnCalcula.addActionListener(new SelecionaCalculo());
	}
	public class SelecionaCalculo implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tipoFolha = Integer.parseInt(txtTipoFolha.getText());
			vlrSalario = Float.parseFloat(txtSalario.getText());
			vlrVendas = Float.parseFloat(txtVendas.getText());
			qtdeHoras = Integer.parseInt(txtQtdeHoras.getText());
			
			if(tipoFolha == 1){
				CalculoProfessor prof = new CalculoProfessor(25.55f, qtdeHoras);
				prof.calculaSalario();
			}else if(tipoFolha == 2){
				CalculoVendedor vend = new CalculoVendedor(vlrSalario, vlrVendas);
				vend.calculaSalario();
			}
		}
	}
	
	public static void main(String[] args){
		CalculoContraCheque calculo = new CalculoContraCheque();
		calculo.montaTela();
	}
}












