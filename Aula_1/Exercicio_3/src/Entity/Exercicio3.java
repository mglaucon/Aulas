package Entity;

import javax.swing.JOptionPane;

public class Exercicio3 {
	
	FolhaPagamento Fpag = new FolhaPagamento();
	
	public void pegaDadosFolha(String nome, double sal, double grati){
		Fpag.setNome(nome);
		Fpag.setSalario(sal);
		Fpag.setGrati(grati);
	}
	public double calculaSalarioBruto(){
		double sBruto = Fpag.getSalario() + Fpag.getGrati();
		Fpag.setSbruto(sBruto);
		return Fpag.getSbruto();
	}
	public void calculaFalta(int faltas){
		faltas = (int) ((Fpag.getSalario() + Fpag.getGrati())/30 * faltas);
		Fpag.setFaltas(faltas);
	}
	public double calculaInss(){
		double inss;
		if(Fpag.getSbruto() <= 500){
			inss = ((Fpag.getSbruto() - Fpag.getFaltas()) * 8)/100;
			Fpag.setInss(inss);
			return Fpag.getInss();
		}else if(Fpag.getSbruto() > 500 || Fpag.getSbruto() <= 1000){
			inss = ((Fpag.getSbruto() - Fpag.getFaltas()) * 9)/100;
			Fpag.setInss(inss);
			return Fpag.getInss();
		}else if(Fpag.getSbruto() > 1000 || Fpag.getSbruto() <= 2800){
			inss = ((Fpag.getSbruto() - Fpag.getFaltas()) * 10)/100;
			Fpag.setInss(inss);
			return Fpag.getInss();
		}else {
			inss = 280;
			Fpag.setInss(inss);
			return Fpag.getInss();
		}
	}
	public double calculaIrrf(){
		double irrf;
		double x, y, z;
		x = 0;
		y = (Fpag.getSbruto() - Fpag.getInss()) * 15/100;
		z = (Fpag.getSbruto() - Fpag.getInss()) * 27.5/100;
		
		if(Fpag.getSbruto() <= 1500){
			irrf = x;
			Fpag.setImpoRenda(irrf);;
			return Fpag.getImpoRenda();
		}else if(Fpag.getSbruto() > 1500 && Fpag.getSbruto() <= 2500){
			irrf = y;
			Fpag.setImpoRenda(irrf);
			return Fpag.getImpoRenda();
		}else{
			irrf = z;
			Fpag.setImpoRenda(irrf);
			return Fpag.getImpoRenda();
		}
	}
	public double totalDesconto(){
		double total = Fpag.getFaltas() + Fpag.getInss() + Fpag.getImpoRenda();
		return total;
	}
	public double calcLiquido(){
		double liq = Fpag.getSbruto() - totalDesconto();
		return liq;
	}
	
	public void entradaDeDados(){
		
		pegaDadosFolha(JOptionPane.showInputDialog(null, "Nome: "),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Salario: ")),
				Double.parseDouble(JOptionPane.showInputDialog(null, "Gratificação: ")));
		calculaFalta(Integer.parseInt(JOptionPane.showInputDialog(null, "Faltas: ")));
	}
	public void saidaDeDados(){
		JOptionPane.showMessageDialog(null, "Funcionário: " + Fpag.getNome()
				+ "\nSalário: " + Fpag.getSalario() + "\nGratificação: " + Fpag.getGrati()
				+ "\nSalário Bruto: " + calculaSalarioBruto()
				+ "\n\nFaltas: " + Fpag.getFaltas()
				+ "\nINSS: " + calculaInss()
				+ "\nIRRF: " + calculaIrrf()
				+ "\nTotal de desconto: " + totalDesconto()
				+ "\nSalário Liquido: " + calcLiquido());
	}
}
