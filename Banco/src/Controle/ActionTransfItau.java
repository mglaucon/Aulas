package Controle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Modelo.MContaItau;
import Modelo.MTransfItau;
import Visao.TransfItau;

public class ActionTransfItau implements ActionListener{
	
	public void actionPerformed(ActionEvent e) {
		MTransfItau mti = new MTransfItau();
		MContaItau mci = new MContaItau();
		mci.setTransf(mti.getValor());
	}
	
}
