package br.com.fiap.beans;

import java.io.Serializable;
import java.util.List;

public class Venda implements Comparable<Venda>, Serializable{
	private int cd_nt_fiscal;
	private Cliente cliente;
	private List<Produto> produtos;
	private double valor;
	private String forma_pgmt;
	private String data;
	
	public int compareTo(Venda outro){
		return Integer.compare(cd_nt_fiscal, outro.cd_nt_fiscal);
	}
	
	public Venda(){
		
	}

	public Venda(int cd_nt_fiscal, Cliente cliente, List<Produto> produtos, double valor, String forma_pgmt, String data) {
		this.cd_nt_fiscal = cd_nt_fiscal;
		this.cliente = cliente;
		this.produtos = produtos;
		this.valor = valor;
		this.forma_pgmt = forma_pgmt;
		this.data = data;
	}

	public String getAll(){
		return getCd_nt_fiscal() +"\n"+
				getCliente() +"\n"+
				getProdutos() +"\n"+
				getValor() +"\n"+
				getForma_pgmt() +"\n"+
				getData();
	}
	
	public void setAll(int cd_nt_fiscal, Cliente cliente, List<Produto> produtos, double valor, String forma_pgmt, String data){
		this.cd_nt_fiscal = cd_nt_fiscal;
		this.cliente = cliente;
		this.produtos = produtos;
		this.valor = valor;
		this.forma_pgmt = forma_pgmt;
		this.data = data;
	}
	
	public int getCd_nt_fiscal() {
		return cd_nt_fiscal;
	}

	public void setCd_nt_fiscal(int cd_nt_fiscal) {
		this.cd_nt_fiscal = cd_nt_fiscal;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getForma_pgmt() {
		return forma_pgmt;
	}

	public void setForma_pgmt(String forma_pgmt) {
		this.forma_pgmt = forma_pgmt;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
}
