package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Visao.TransfTed;

public class ActionTed implements ActionListener{
	public void actionPerformed(ActionEvent e){
		TransfTed tft = new TransfTed();
		tft.montaTela();
	}
}
