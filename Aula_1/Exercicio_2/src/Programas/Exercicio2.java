package Programas;

import javax.swing.JOptionPane;

import Entity.Venda;

public class Exercicio2 {
	Venda venda = new Venda();
	
	public void entradaDeDados(){
		venda.setNome(JOptionPane.showInputDialog(null, "Nome do Vendedor: "));
		venda.setAnoMesVenda(Integer.parseInt(JOptionPane.showInputDialog(null, " Mês da venda: ")));
		venda.setVlrVenda(Double.parseDouble(JOptionPane.showInputDialog(null, "Valor da venda: ")));
		venda.setComissao(Double.parseDouble(JOptionPane.showInputDialog(null, "Percentual da comissão: ")));
	}
	public void saidaDeDados(){
		JOptionPane.showMessageDialog(null, "Vendedor: " + venda.getNome() +
				"\nVenda: " + venda.getVlrVenda() + "\nComissão: " + venda.getComissao());
	}
}
