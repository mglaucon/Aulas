package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visao.ContaCorrente;
import Visao.TransfItau;

public class ActionItau implements ActionListener{
	
	//ContaCorrente cc = new ContaCorrente();
	
	public void actionPerformed(ActionEvent e){
		TransfItau tfi = new TransfItau();
		tfi.montaTela();
	}
}
