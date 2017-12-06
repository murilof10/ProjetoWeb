package br.com.fiap.beans;

import java.io.Serializable;

public class Produto implements Comparable<Produto>, Serializable{
	private int codigo;
	private String desc;
	private String cor;
	private double preco;
	private int qtd_estoque;
	private Fornecedor fornecedor;

	public int compareTo(Produto outro){
		return Integer.compare(codigo, outro.codigo);
	}
	
	public Produto(){

	}
	public Produto(int codigo, String desc, String cor, double preco, int qtd_estoque, Fornecedor fornecedor) {
		setCodigo(codigo);
		setDesc(desc);
		setCor(cor);
		setPreco(preco);
		setQtd_estoque(qtd_estoque);
		setFornecedor(fornecedor);
	}

	public void setAll(int codigo, String desc, String cor, double preco, int qtd_estoque, Fornecedor fornecedor){
		setCodigo(codigo);
		setDesc(desc);
		setCor(cor);
		setPreco(preco);
		setQtd_estoque(qtd_estoque);
		setFornecedor(fornecedor);
	}
	public String getAll(){
		return getCodigo()+"\n"+
				getDesc()+"\n"+
				getCor()+"\n"+
				getPreco()+"\n"+
				getQtd_estoque()+"\n"+
				fornecedor.getAll();
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQtd_estoque() {
		return qtd_estoque;
	}
	public void setQtd_estoque(int qtd_estoque) {
		this.qtd_estoque = qtd_estoque;
	}
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
}
