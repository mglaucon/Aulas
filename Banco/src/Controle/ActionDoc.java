package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visao.TransfDoc;

public class ActionDoc implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TransfDoc tfd = new TransfDoc();
		tfd.montaTela();
	}
}
