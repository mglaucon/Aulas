package Programas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;

public class CadastrarAlunoExer4 extends JFrame{
	public CadastrarAlunoExer4(){
		super("Cadastrar Aluno");
		setSize(800,550);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JLabel lblNome,lblEnd,lblNatural,lblTel,lblCpf,lblRg,lblMensal,lblBolsa,lblPercBolsa,lblVbolsa,lblVlrPagar;
	private JTextField txtNome,txtEnd,txtTel,txtCpf,txtRg,txtMensal,txtPercBolsa,txtVbolsa,txtVlrPagar;
	private JComboBox cbxNatural;
	private ButtonGroup bgBolsa;
	private JRadioButton rbtParcial,rbtIntegral;
	private JButton jbGravar,jbSair;
	
	public void montaTela(){
		Container con = getContentPane();
		setLayout(null);
		
		lblNome = new JLabel("Nome:");
		lblNome.setBounds(80,50,80,25);
		con.add(lblNome);
		txtNome = new JTextField();
		txtNome.setBounds(180,50,400,25);
		con.add(txtNome);
		lblEnd = new JLabel("Endereço:");
		lblEnd.setBounds(80,80,80,25);
		con.add(lblEnd);
		txtEnd = new JTextField();
		txtEnd.setBounds(180,80,400,25);
		con.add(txtEnd);
		lblNatural = new JLabel("Naturalidade:");
		lblNatural.setBounds(80,110,80,25);
		con.add(lblNatural);
		
		String[] Naturalidade = new String[]{
			"RJ","SP","RS","MG","AL","AM"
		};
		cbxNatural = new JComboBox(Naturalidade);
		cbxNatural.setBounds(180,110,80,25);
		con.add(cbxNatural);
		lblTel = new JLabel("Telefone:");
		lblTel.setBounds(80,140,80,25);
		con.add(lblTel);
		txtTel = new JTextField();
		txtTel.setBounds(180,140,180,25);
		con.add(txtTel);
		lblCpf = new JLabel("Cpf:");
		lblCpf.setBounds(80,170,80,25);
		con.add(lblCpf);
		txtCpf = new JTextField();
		txtCpf.setBounds(180,170,220,25);
		con.add(txtCpf);
		lblRg = new JLabel("Identidade:");
		lblRg.setBounds(80,200,80,25);
		con.add(lblRg);
		txtRg = new JTextField();
		txtRg.setBounds(180,200,220,25);
		con.add(txtRg);
		lblMensal = new JLabel("Mensalidade:");
		lblMensal.setBounds(80,230,80,25);
		con.add(lblMensal);
		txtMensal = new JTextField();
		txtMensal.setBounds(180,230,140,25);
		con.add(txtMensal);
		lblBolsa = new JLabel("Bolsa:");
		lblBolsa.setBounds(80,260,80,25);
		con.add(lblBolsa);
		rbtParcial = new JRadioButton("Parcial");
		rbtIntegral = new JRadioButton("Integral");
		bgBolsa = new ButtonGroup();
		bgBolsa.add(rbtParcial);
		bgBolsa.add(rbtIntegral);
		rbtParcial.setBounds(180,260,80,25);
		rbtIntegral.setBounds(280,260,80,25);
		con.add(rbtParcial);
		con.add(rbtIntegral);
		lblPercBolsa = new JLabel("Perc Bolsa:");
		lblPercBolsa.setBounds(80,290,80,25);
		con.add(lblPercBolsa);
		txtPercBolsa = new JTextField();
		txtPercBolsa.setBounds(180,290,70,25);
		con.add(txtPercBolsa);
		lblVbolsa = new JLabel("Bolsa:");
		lblVbolsa.setBounds(80,320,80,25);
		con.add(lblVbolsa);
		txtVbolsa = new JTextField();
		txtVbolsa.setBounds(180,320,140,25);
		con.add(txtVbolsa);
		lblVlrPagar = new JLabel("Vlr a Pagar:");
		lblVlrPagar.setBounds(80,350,80,25);
		con.add(lblVlrPagar);
		txtVlrPagar = new JTextField();
		txtVlrPagar.setBounds(180,350,140,25);
		con.add(txtVlrPagar);
		
		jbGravar = new JButton("Gravar");
		jbGravar.setBounds(140,390,120,25);
		con.add(jbGravar);
		jbSair = new JButton("Sair");
		jbSair.setBounds(380,390,120,25);
		con.add(jbSair);
		
		jbSair.addActionListener(new Sair());
	}
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			setVisible(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
}



















