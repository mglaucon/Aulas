package Programas;

import Entity.Pessoa;

import javax.swing.JOptionPane;

public class Exemplo2 {
	Pessoa pessoa = new Pessoa();
	
	public void entradaDeDados(){
		pessoa.setNome(JOptionPane.showInputDialog(null, "Digite seu nome: "));
		pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "digite sua idade: ")));
		pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite seu peso: ")));
	}
	public void saidaDeDados(){
		JOptionPane.showMessageDialog(null, "Nome: " + pessoa.getNome() +
				"\nIdade: " + pessoa.getIdade() + "\nPeso: " + pessoa.getPeso());
	}
}
