package model;

public class Correntista {
	private String nome;
	private Integer numeroConta;
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNumeroConta(Integer nc) {
		this.numeroConta = nc;
	}
	
	public Integer getNumeroConta() {
		return this.numeroConta;
	}
}
