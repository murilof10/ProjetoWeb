package br.com.fiap.beans;

import java.io.Serializable;

public class Endereco implements Comparable<Endereco>, Serializable{
	private int codigo;
	private String cidade;
	private String estado;
	private String bairro;
	private String rua;
	private int num;

	public int compareTo(Endereco outro){
		return Integer.compare(codigo, outro.codigo);
	}
	
	public Endereco(){

	}

	public Endereco(int codigo, String cidade, String estado, String bairro, String rua, int num) {
		setCodigo(codigo);
		setCidade(cidade);
		setEstado(estado);
		setBairro(bairro);
		setRua(rua);
		setNum(num);
	}

	public String getAll(){
		return getCodigo() +"\n"+ getNum() +"\n"+ getRua() +"\n"+ getBairro() +"\n"+ getCidade() +"\n"+ getEstado();
	}

	public void setAll(int codigo, String cidade, String estado, String bairro, String rua, int num){
		setCodigo(codigo);
		setCidade(cidade);
		setEstado(estado);
		setBairro(bairro);
		setRua(rua);
		setNum(num);
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

}
