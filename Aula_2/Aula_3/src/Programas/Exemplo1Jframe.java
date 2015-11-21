package Programas;
import javax.swing.JFrame;

public class Exemplo1Jframe  extends JFrame{

	public Exemplo1Jframe(){ // Construtor
		super("Titulo do Frame: Testando Frame");
	}
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		Exemplo1Jframe janela = new Exemplo1Jframe();
		
		janela.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// Executa maximizado
		
		janela.setLocationRelativeTo(null);
		// centraliza a janela na tela
		
		janela.setSize(400, 200);
		// definindo tamanho da janela
		
		// Outra forma de colocar titulo no Frame
		//janela.setTitle("Janela de Teste FRAME");
		// titulo da janela
		
		// janela.setVisible(true); // Mostrando a janela
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		janela.show(); // Mostrando a janela
	}
}
