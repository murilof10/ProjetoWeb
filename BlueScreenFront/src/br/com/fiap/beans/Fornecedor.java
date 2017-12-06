package br.com.fiap.beans;

import java.io.Serializable;

public class Fornecedor extends Pessoa implements Serializable{
	private String cnpj;

	public int compareTo(Fornecedor outro){
		return Integer.compare(Integer.valueOf(cnpj), Integer.valueOf(outro.cnpj));
	}
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Fornecedor(int codigo, String nome, String tel, String email, String cnpj, Endereco endereco) {
		super(codigo, nome, tel, email, endereco);
		setCnpj(cnpj);
	}

	public Fornecedor(){

	}
}
