package br.com.Login;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.function.LongToIntFunction;

import javax.swing.JOptionPane;

import br.com.Principal.Pdv;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Driver;
import com.mysql.jdbc.Statement;

public class Banco{
	private java.sql.Connection con = null;
	private java.sql.Statement stmt = null;
	private ResultSet resultset = null;
	
	public void Conectar(){
		String servidor = "jdbc:mysql://localhost:3306/pdv";
		String usuario = "root";
		String senha = "flamengo21";
		String driver = "com.mysql.jdbc.Driver";
		
		try{
			Class.forName(driver);
			this.con = DriverManager.getConnection(servidor, usuario, senha);
			this.stmt = this.con.createStatement();
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Erro: "+e.getMessage());
		}
	}
	
	public void Login(String usuario, String senha){
		try{
			String query = "SELECT usuario,senha FROM login WHERE usuario='"+usuario+"';";
			this.resultset = this.stmt.executeQuery(query);
			
			if(usuario.length() == 0 || senha.length() == 0)	JOptionPane.showMessageDialog(null, "Insira uma senha!!");
			else{
				while(this.resultset.next()){
					if(usuario.equals(this.resultset.getString("usuario")) && senha.equals(this.resultset.getString("senha"))){
						Pdv pdv = new Pdv();
						pdv.SistemaVendaMenu();
						Login.log = 1;
					}else	JOptionPane.showMessageDialog(null, "Usuario ou Senha incorreta!!");
				}
			}
		}catch(Exception e){
			System.out.println("Erro: "+e.getMessage());
		}
	}
}
