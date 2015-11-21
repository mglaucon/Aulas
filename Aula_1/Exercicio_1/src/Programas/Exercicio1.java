package Programas;

import Entity.Pessoa;
import javax.swing.JOptionPane;

public class Exercicio1 {
	Pessoa pessoa = new Pessoa();
	
	public void entradaDeDados(){
		pessoa.setNome(JOptionPane.showInputDialog(null, "Digite seu Nome: "));
		pessoa.setPeso(Double.parseDouble(JOptionPane.showInputDialog(null, "\nDigite seu Peso: ")));
		pessoa.setCpf(Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite seu CPF: ")));
		pessoa.setId(Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite sua Identidade: ")));
		pessoa.setTel(Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite seu Telefone: ")));
		pessoa.setEnd(JOptionPane.showInputDialog(null, "\nDigite seu Endereço: "));
		pessoa.setCompl(JOptionPane.showInputDialog(null, "\nDigite seu Complemento: "));
		pessoa.setBairro(JOptionPane.showInputDialog(null, "\nDigite seu Bairro"));
		pessoa.setCidade(JOptionPane.showInputDialog(null, "\nDigite sua Cidade: "));
		pessoa.setEstado(JOptionPane.showInputDialog(null, "\nDigite seu Estado: "));
		pessoa.setCep(Integer.parseInt(JOptionPane.showInputDialog(null, "\nDigite seu Cep: ")));
	}
	
	public void saidaDeDados(){
		JOptionPane.showMessageDialog(null, "Nome: " + pessoa.getNome() + "\nPeso: " + pessoa.getPeso() +
				"\nCPF: " + pessoa.getCpf() + "\nID: " + pessoa.getId() + "\nTel: " + pessoa.getTel() +
				"\nEnd: " + pessoa.getEnd() + "\nComplemento: " + pessoa.getCompl() +
				"\nBairro: " + pessoa.getBairro() + "\nCidade: " + pessoa.getCidade() +
				"\nEstado: " + pessoa.getEstado() + "\nCep: " + pessoa.getCep());
	}
}
