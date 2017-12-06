package br.com.fiap.beans;

import java.io.Serializable;

public class Cliente extends Pessoa implements Serializable{
	private String rg;
	private String cpf;
	private char sexo;
	private String login;
	private String senha;
	
	public int compareTo(Cliente outro){
		return Integer.compare(Integer.valueOf(cpf), Integer.valueOf(outro.cpf));
	}
	
	public Cliente(){
		
	}

	public Cliente(int codigo, String nome, String tel, String email, String rg, String cpf, char sexo, String login, String senha, Endereco endereco) {
		super(codigo, nome, tel, email, endereco);
		setRg(rg);
		setCpf(cpf);
		setSexo(sexo);
		setLogin(login);
		setSenha(senha);
	}

	public void setAll(String rg, String cpf, char sexo, String login, String senha){
		setRg(rg);
		setCpf(cpf);
		setSexo(sexo);
		setLogin(login);
		setSenha(senha);
	}
	
	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
