package br.com.fiap.beans;

import java.io.Serializable;

public class Pessoa implements Comparable<Pessoa>, Serializable{
	private int codigo;
	private String nome;
	private String tel;
	private String email;
	private Endereco endereco;

	public int compareTo(Pessoa outro){
		return Integer.compare(codigo, outro.codigo);
	}
	
	public Pessoa(){

	}

	public Pessoa(int codigo, String nome, String tel, String email, Endereco endereco) {
		setCodigo(codigo);
		setNome(nome);
		setTel(tel);
		setEmail(email);
		setEndereco(endereco);
	}

	public String getAll(){
		return "Código: "+codigo+"\n"+
				"Nome: "+nome+"\n"+
				"Telefone: "+tel+"\n"+
				"E-mail: "+email+"\n"+
				"Endereco: "+endereco.getAll();
	}

	public void setAll(int codigo, String nome, String tel, String email, Endereco endereco){
		setCodigo(codigo);
		setNome(nome);
		setTel(tel);
		setEmail(email);
		setEndereco(endereco);
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}	
