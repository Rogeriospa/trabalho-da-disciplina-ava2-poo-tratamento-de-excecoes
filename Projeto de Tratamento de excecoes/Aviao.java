package uva.com;

import java.util.Scanner;

public class Aviao extends Veiculo {

	protected String prefixo;
	protected String datarevisao;
	protected double percentual;
	
	//Método construtor sem parâmetro
	public Aviao() {
		
	}
	
	//Método Construtor com parâmetro
	public Aviao(String prefixo, String datarevisao) {
		this.prefixo = prefixo;
		this.datarevisao = datarevisao;
	}
	
	public Aviao(String prefixo, String datarevisao, int capacidadetanque, int numeropassageiros, float preco) {
		super(capacidadetanque, numeropassageiros, preco);		
		this.prefixo = prefixo;
		this.datarevisao = datarevisao;
	}
	
	//Métodos Getters e Setters
	public String getPrefixo() {
		return prefixo;
	}
	
	public void setPrefixo(String prefixo) {
		this.prefixo = prefixo;
	}
	
	public String getDatarevisao() {
		return datarevisao;
	}
	
	public void setDatarevisao(String datarevisao) {
		this.datarevisao = datarevisao;
	}
	
	//Método para reajusta preço do avião
	public void reajustarPreco(double percentual) {
		preco = getPreco() + (getPercentual() * getPreco()) / 100;
	}
	
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	
	public double getPercentual() {
		return percentual;
	}
	
	//Método Imprimir
	public void imprimir() {
		
		System.out.println("Dados Técnicos do Avião");
		System.out.println("");
		System.out.println("Prefixo: " + getPrefixo());
		super.imprimir();
		System.out.println("Data de Revisão: " + getDatarevisao());
		System.out.println("");
		System.out.println("Qual o percentual de reajuste? ");
		System.out.println("");
	}
	
	//Método de Entrada de Dados
	public void entrada() {
		
		    Scanner ent = new Scanner(System.in);
			System.out.println("Ficha Técnica do Avião? ");
			System.out.println("");
			System.out.println("Qual o Prefixo? ");
			setPrefixo(ent.nextLine());
			System.out.println("Reajuste: ");
			setPercentual(Double.parseDouble(ent.nextLine()));
			super.entrada();
			System.out.println("Qual é a Data de Revisão? ");
			setDatarevisao(ent.nextLine());
		    System.out.println("");
	}
}