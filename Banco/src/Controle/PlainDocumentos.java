package Controle;


import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class PlainDocumentos extends PlainDocument{
	int tam = 0;
	public PlainDocumentos(int a){
		this.tam = a;
	}
	
	public void insertString(int offs, String str, AttributeSet a) throws BadLocationException{
		int tamanho = this.getLength() + str.length();
		if(tamanho <= tam){
			super.insertString(offs, str.replaceAll("[aA-zZ]", ""), a);
		}else{
			super.insertString(offs, str.replaceAll("[aA0-zZ9]", ""), a);
		}
	}
	
}
