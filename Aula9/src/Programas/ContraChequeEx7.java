package Programas;

import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;



import javax.swing.text.MaskFormatter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.text.ParseException;

public class ContraChequeEx7 extends JFrame{
	public ContraChequeEx7(){
		setTitle("ContraCheque");
	}
	
	private JLabel lblMatricula,lblCentroCusto,lblNomeFunc,lblDataAdm,lblSalario,lblGratificacao,lblComissao,
	lblHoraExtra,lblFalta,lblTipoFolha,lblProventos,lblPsalario,lblPgratificacao,lblPcomicao,lblPhoraExtra,
	lblPtotalProventos,lblDescontos,lblDfaltas,lblDinss,lblDimpRenda,lblDvalTransp,lblDtotalDescontos;
	private JTextField txtMatricula,txtNomeFunc,txtDataAdm,txtSalario,txtComissao,txtHoraExtra,
	txtFalta,txtPsalario,txtPgratificacao,txtPcomicao,txtPhoraExtra,txtPtotalProventos,txtDfaltas,txtDinss,
	txtDimpRenda,txtDvalTransp,txtDtotalDescontos;
	private JFormattedTextField txtGratificacao;
	private MaskFormatter mskGratificacao;
	private JComboBox cmbCentroCusto;
	private ButtonGroup btgTipoFolha;
	private JRadioButton rbtQuinzenal,rbtMensal;
	private JButton jbRetornar,jbLimpar,jbCalcular,jbSair;
	private JPanel bDadosFunc,bMovimentoFolha,borda1,borda2;
	
	public void defineFrame(){
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		//setResizable(false);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void montaTela(){
		setLayout(null);
		
		Container container = getContentPane();
		
		//Primeira parte do formulário!!
		lblMatricula = new JLabel("Matricula:");
		txtMatricula = new JTextField();
		lblCentroCusto = new JLabel("Centro Custo:");
		
		String[] CentroCusto = new String[]{
				"Selecione o Setor","Almoxarifado","Administração","Recursos Humanos",
				"Gerência", "Departamento Pessoal"
		};
		cmbCentroCusto = new JComboBox(CentroCusto);
		lblNomeFunc = new JLabel("Nome Funcionário:");
		txtNomeFunc = new JTextField();
		lblDataAdm = new JLabel("Data Admição:");
		txtDataAdm = new JTextField();
		bDadosFunc = new JPanel();
		bDadosFunc.setBorder(BorderFactory.createTitledBorder(null, "Dados do Funcionário"));
		
		lblMatricula.setBounds(250, 100, 80, 25);
		txtMatricula.setBounds(370, 100, 200, 25);
		lblCentroCusto.setBounds(250, 140, 100, 25);
		cmbCentroCusto.setBounds(370, 140, 200, 25);
		lblNomeFunc.setBounds(620, 100, 150, 25);
		txtNomeFunc.setBounds(770, 100, 310, 25);
		lblDataAdm.setBounds(620, 140, 130, 25);
		txtDataAdm.setBounds(770, 140, 150, 25);
		bDadosFunc.setBounds(220, 50, 900, 140);
		
		
		//Máscara de Gratificação!!
		try{
			mskGratificacao = new MaskFormatter("##%");
		}catch(ParseException e){}
		
		//Segunda parte do formulário!!
		lblSalario = new JLabel("Salário:");
		txtSalario = new JTextField();
		lblGratificacao = new JLabel("Gratificação:");
		txtGratificacao = new JFormattedTextField(mskGratificacao);
		lblComissao = new JLabel("Comissão:");
		txtComissao = new JTextField();
		lblHoraExtra = new JLabel("Hora Extra(Qtde):");
		txtHoraExtra = new JTextField();
		lblFalta = new JLabel("Falta(Qtde):");
		txtFalta = new JTextField();
		bMovimentoFolha = new JPanel();
		bMovimentoFolha.setBorder(BorderFactory.createTitledBorder(null, "Movimento de Folha"));
		
		lblSalario.setBounds(250, 235, 80, 25);
		txtSalario.setBounds(370, 235, 200, 25);
		lblGratificacao.setBounds(250, 265, 100, 25);
		txtGratificacao.setBounds(370, 265, 60, 25);
		lblComissao.setBounds(250, 295, 80, 25);
		txtComissao.setBounds(370, 295, 60, 25);
		lblHoraExtra.setBounds(620, 235, 130, 25);
		txtHoraExtra.setBounds(770, 235, 60, 25);
		lblFalta.setBounds(620, 265, 90, 25);
		txtFalta.setBounds(770, 265, 60, 25);
		bMovimentoFolha.setBounds(220, 205, 900, 130);
		
		//Terceira parte formulário!!
		lblTipoFolha = new JLabel("Tipo de Folha:");
		rbtQuinzenal = new JRadioButton("Quinzenal");
		rbtMensal = new JRadioButton("Mensal");
		btgTipoFolha = new ButtonGroup();
		btgTipoFolha.add(rbtQuinzenal);
		btgTipoFolha.add(rbtMensal);
		rbtMensal.setSelected(true);
		
		lblTipoFolha.setBounds(250, 340, 100, 25);
		rbtQuinzenal.setBounds(370, 340, 100, 25);
		rbtMensal.setBounds(540, 340, 100, 25);
		
		//Quarta parte do formulário!!
		lblProventos = new JLabel("Proventos");
		lblPsalario = new JLabel("Salário:");
		txtPsalario = new JTextField();
		txtPsalario.setEditable(false);
		lblPgratificacao = new JLabel("Gratificação:");
		txtPgratificacao = new JTextField();
		txtPgratificacao.setEditable(false);
		lblPcomicao = new JLabel("Comissão:");
		txtPcomicao = new JTextField();
		txtPcomicao.setEditable(false);
		lblPhoraExtra = new JLabel("Hora Extra:");
		txtPhoraExtra = new JTextField();
		txtPhoraExtra.setEditable(false);
		lblPtotalProventos = new JLabel("Total Proventos:");
		txtPtotalProventos = new JTextField();
		txtPtotalProventos.setEditable(false);
		borda1 = new JPanel();
		borda1.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, Color.gray));
		
		
		lblProventos.setBounds(420, 390, 80, 25);
		lblPsalario.setBounds(250, 430, 80, 25);
		txtPsalario.setBounds(370, 430, 200, 25);
		lblPgratificacao.setBounds(250, 460, 90, 25);
		txtPgratificacao.setBounds(370, 460, 200, 25);
		lblPcomicao.setBounds(250, 490, 80, 25);
		txtPcomicao.setBounds(370, 490, 200, 25);
		lblPhoraExtra.setBounds(250, 520, 80, 25);
		txtPhoraExtra.setBounds(370, 520, 200, 25);
		lblPtotalProventos.setBounds(250, 550, 120, 25);
		txtPtotalProventos.setBounds(370, 550, 200, 25);
		borda1.setBounds(220, 380, 450, 210);
		
		//Sexta parte do formulário!!
		lblDescontos = new JLabel("Descontos");
		lblDfaltas = new JLabel("Faltas:");
		txtDfaltas = new JTextField();
		txtDfaltas.setEditable(false);
		lblDinss = new JLabel("Inss:");
		txtDinss = new JTextField();
		txtDinss.setEditable(false);
		lblDimpRenda = new JLabel("Imp de Renda:");
		txtDimpRenda = new JTextField();
		txtDimpRenda.setEditable(false);
		lblDvalTransp = new JLabel("Val Transp:");
		txtDvalTransp = new JTextField();
		txtDvalTransp.setEditable(false);
		lblDtotalDescontos = new JLabel("Total Descontos:");
		txtDtotalDescontos = new JTextField();
		txtDtotalDescontos.setEditable(false);
		borda2 = new JPanel();
		borda2.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 0, Color.gray));
		
		
		lblDescontos.setBounds(880, 390, 80, 25);
		lblDfaltas.setBounds(700, 430, 80, 25);
		txtDfaltas.setBounds(820, 430, 200, 25);
		lblDinss.setBounds(700, 460, 80, 25);
		txtDinss.setBounds(820, 460, 200, 25);
		lblDimpRenda.setBounds(700, 490, 110, 25);
		txtDimpRenda.setBounds(820, 490, 200, 25);
		lblDvalTransp.setBounds(700, 520, 80, 25);
		txtDvalTransp.setBounds(820, 520, 200, 25);
		lblDtotalDescontos.setBounds(700, 550, 120, 25);
		txtDtotalDescontos.setBounds(820, 550, 200, 25);
		borda2.setBounds(670, 380, 450, 210);
		
		//Botões
		jbRetornar = new JButton("Retornar");
		jbLimpar = new JButton("Limpar");
		jbCalcular = new JButton("Calcular");
		jbSair = new JButton("Sair");
		
		jbRetornar.addActionListener(new Retornar());
		jbLimpar.addActionListener(new Limpar());
		jbCalcular.addActionListener(new Calcular());
		jbSair.addActionListener(new Sair());
		
		jbRetornar.setBounds(240, 620, 150, 25);
		jbLimpar.setBounds(470, 620, 150, 25);
		jbCalcular.setBounds(700, 620, 150, 25);
		jbSair.setBounds(930, 620, 150, 25);
		
		//Montagem do Container!!
		container.add(lblMatricula);
		container.add(txtMatricula);
		container.add(lblCentroCusto);
		container.add(cmbCentroCusto);
		container.add(lblNomeFunc);
		container.add(txtNomeFunc);
		container.add(lblDataAdm);
		container.add(txtDataAdm);
		container.add(bDadosFunc);
		container.add(lblSalario);
		container.add(txtSalario);
		container.add(lblGratificacao);
		container.add(txtGratificacao);
		container.add(lblComissao);
		container.add(txtComissao);
		container.add(lblHoraExtra);
		container.add(txtHoraExtra);
		container.add(lblFalta);
		container.add(txtFalta);
		container.add(bMovimentoFolha);
		container.add(lblTipoFolha);
		container.add(rbtQuinzenal);
		container.add(rbtMensal);
		container.add(lblProventos);
		container.add(lblPsalario);
		container.add(txtPsalario);
		container.add(lblPgratificacao);
		container.add(txtPgratificacao);
		container.add(lblPcomicao);
		container.add(txtPcomicao);
		container.add(lblPhoraExtra);
		container.add(txtPhoraExtra);
		container.add(lblPtotalProventos);
		container.add(txtPtotalProventos);
		container.add(borda1);
		container.add(lblDescontos);
		container.add(lblDfaltas);
		container.add(txtDfaltas);
		container.add(lblDinss);
		container.add(txtDinss);
		container.add(lblDimpRenda);
		container.add(txtDimpRenda);
		container.add(lblDvalTransp);
		container.add(txtDvalTransp);
		container.add(lblDtotalDescontos);
		container.add(txtDtotalDescontos);
		container.add(borda2);
		container.add(jbRetornar);
		container.add(jbLimpar);
		container.add(jbCalcular);
		container.add(jbSair);
	}
	
	//Evento Botão Limpar!!
	public class Retornar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			setVisible(false);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	//Evento Botão Limpar!!
	public class Limpar implements ActionListener{
		public void actionPerformed(ActionEvent e){
			txtMatricula.setText("");
			cmbCentroCusto.setSelectedIndex(0);
			txtNomeFunc.setText("");
			txtDataAdm.setText("");
			txtSalario.setText("");
			txtGratificacao.setText("");
			txtComissao.setText("");
			txtHoraExtra.setText("");
			txtFalta.setText("");
			rbtMensal.setSelected(true);
			txtPsalario.setText("");
			txtPgratificacao.setText("");
			txtPcomicao.setText("");
			txtPhoraExtra.setText("");
			txtPtotalProventos.setText("");
			txtDfaltas.setText("");
			txtDinss.setText("");
			txtDimpRenda.setText("");
			txtDvalTransp.setText("");
			txtDtotalDescontos.setText("");
		}
	}
	
	//Evento Botão Calcular!!
	public class Calcular implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			if(txtSalario.getText().isEmpty() || txtGratificacao.getText().isEmpty() ||
			   txtComissao.getText().isEmpty() || txtHoraExtra.getText().isEmpty() ||
			   txtFalta.getText().isEmpty()){
				
				JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
				
			}else if(rbtMensal.isSelected()){
				float salario = Float.parseFloat(txtSalario.getText());
				float grati = Float.parseFloat(txtGratificacao.getText());
				grati = (salario*grati)/100;
				float comissao = Float.parseFloat(txtComissao.getText());
				float horaExtra = Float.parseFloat(txtHoraExtra.getText());
				horaExtra = ((salario + grati + comissao) / 240)*horaExtra;
				float totalProv = salario + grati + comissao + horaExtra;
				
				txtPsalario.setText(Float.toString(salario));
				txtPgratificacao.setText(Float.toString(grati));
				txtPcomicao.setText(Float.toString(comissao));
				txtPhoraExtra.setText(Float.toString(horaExtra));
				txtPtotalProventos.setText(Float.toString(totalProv));
				
				float faltas = Float.parseFloat(txtFalta.getText());
				faltas = (totalProv/30)*faltas;
				txtDfaltas.setText(Float.toString(faltas));
				float inss;
				float irrf;
				
				//Calcula inss
				if(totalProv <= 500)	inss = ((totalProv-faltas)*8)/100;
				else if(totalProv > 500 && totalProv <= 1000)	inss = ((totalProv-faltas)*9)/100;
				else if(totalProv > 1000 && totalProv <= 2800)	inss = ((totalProv-faltas)*10)/100;
				else	inss = 280;
				
				//Calcula irrf
				float x = 0;
				float y = ((totalProv-inss-faltas)*15-150)/100;
				float z = ((totalProv-inss-faltas)*27.5f-350)/100;
				
				if(totalProv <= 1500)	irrf = x;
				else if(totalProv > 1500 && totalProv <= 2500)	irrf = y;
				else	irrf = z;
				
				float valeT = (totalProv*6)/100;
				float totalDesc = faltas+ inss+irrf+valeT;
				
				txtDinss.setText(Float.toString(inss));
				txtDimpRenda.setText(Float.toString(irrf));
				txtDvalTransp.setText(Float.toString(valeT));
				txtDtotalDescontos.setText(Float.toString(totalDesc));
			
			}else if(rbtQuinzenal.isSelected()){
				
				float salario = Float.parseFloat(txtSalario.getText())/2;
				float grati = Float.parseFloat(txtGratificacao.getText());
				grati = (salario*grati)/100;
				float comissao = Float.parseFloat(txtComissao.getText());
				float horaExtra = Float.parseFloat(txtHoraExtra.getText());
				horaExtra = ((salario + grati + comissao) / 120)*horaExtra;
				float totalProv = salario + grati + comissao + horaExtra;
				
				txtPsalario.setText(Float.toString(salario));
				txtPgratificacao.setText(Float.toString(grati));
				txtPcomicao.setText(Float.toString(comissao));
				txtPhoraExtra.setText(Float.toString(horaExtra));
				txtPtotalProventos.setText(Float.toString(totalProv));
				
				float faltas = Float.parseFloat(txtFalta.getText());
				faltas = (totalProv/15)*faltas;
				txtDfaltas.setText(Float.toString(faltas));
				float inss;
				float irrf;
				
				//Calcula inss
				if(totalProv <= 500)	inss = ((totalProv-faltas)*8)/100;
				else if(totalProv > 500 && totalProv <= 1000)	inss = ((totalProv-faltas)*9)/100;
				else if(totalProv > 1000 && totalProv <= 2800)	inss = ((totalProv-faltas)*10)/100;
				else	inss = 280;
				
				//Calcula irrf
				float x = 0;
				float y = ((totalProv-inss-faltas)*15-150)/100;
				float z = ((totalProv-inss-faltas)*27.5f-350)/100;
				
				if(totalProv <= 1500)	irrf = x;
				else if(totalProv > 1500 && totalProv <= 2500)	irrf = y;
				else	irrf = z;
				
				float valeT = (totalProv*6)/100;
				float totalDesc = faltas+ inss+irrf+valeT;
				
				txtDinss.setText(Float.toString(inss));
				txtDimpRenda.setText(Float.toString(irrf));
				txtDvalTransp.setText(Float.toString(valeT));
				txtDtotalDescontos.setText(Float.toString(totalDesc));
			}
		}
	}
	
	//Evento Botão Sair!!
	public class Sair implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.exit(0);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	/*
	//Método Principal!!
	public static void main(String[] args){
		ContraChequeEx7 ex = new ContraChequeEx7();
		
		ex.defineFrame();
		ex.montaTela();
	}
	*/
}














