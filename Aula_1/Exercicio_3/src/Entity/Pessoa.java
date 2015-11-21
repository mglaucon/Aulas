package Entity;

public class Pessoa {
	private String nome, end, bairro, compl, cidade, estado;
	private int cep, tel, cpf, id;
	private double peso;
	
	public void setNome(String nome){
		this.nome = nome;
	}
	public String getNome(){
		return nome;
	}
	public void setEnd(String end){
		this.end = end;
	}
	public String getEnd(){
		return end;
	}
	public void setBairro(String bairro){
		this.bairro = bairro;
	}
	public String getBairro(){
		return bairro;
	}
	public void setCompl(String compl){
		this.compl = compl;
	}
	public String getCompl(){
		return compl;
	}
	public void setCidade(String cidade){
		this.cidade = cidade;
	}
	public String getCidade(){
		return cidade;
	}
	public void setEstado(String estado){
		this.estado = estado;
	}
	public String getEstado(){
		return estado;
	}
	public void setCep(int cep){
		this.cep = cep;
	}
	public int getCep(){
		return cep;
	}
	public void setTel(int tel){
		this.tel = tel;
	}
	public int getTel(){
		return tel;
	}
	public void setCpf(int cpf){
		this.cpf = cpf;
	}
	public int getCpf(){
		return cpf;
	}
	public void setId(int id){
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public void setPeso(double peso){
		this.peso = peso;
	}
	public double getPeso(){
		return peso;
	}
}
