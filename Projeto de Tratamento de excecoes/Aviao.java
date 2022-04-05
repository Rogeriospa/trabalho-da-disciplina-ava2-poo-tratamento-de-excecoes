package uva.com;

import java.util.Scanner;

public class Aviao extends Veiculo {

	protected String prefixo;
	protected String datarevisao;
	protected double percentual;
	
	//M�todo construtor sem par�metro
	public Aviao() {
		
	}
	
	//M�todo Construtor com par�metro
	public Aviao(String prefixo, String datarevisao) {
		this.prefixo = prefixo;
		this.datarevisao = datarevisao;
	}
	
	public Aviao(String prefixo, String datarevisao, int capacidadetanque, int numeropassageiros, float preco) {
		super(capacidadetanque, numeropassageiros, preco);		
		this.prefixo = prefixo;
		this.datarevisao = datarevisao;
	}
	
	//M�todos Getters e Setters
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
	
	//M�todo para reajusta pre�o do avi�o
	public void reajustarPreco(double percentual) {
		preco = getPreco() + (getPercentual() * getPreco()) / 100;
	}
	
	public void setPercentual(double percentual) {
		this.percentual = percentual;
	}
	
	public double getPercentual() {
		return percentual;
	}
	
	//M�todo Imprimir
	public void imprimir() {
		
		System.out.println("Dados T�cnicos do Avi�o");
		System.out.println("");
		System.out.println("Prefixo: " + getPrefixo());
		super.imprimir();
		System.out.println("Data de Revis�o: " + getDatarevisao());
		System.out.println("");
		System.out.println("Qual o percentual de reajuste? ");
		System.out.println("");
	}
	
	//M�todo de Entrada de Dados
	public void entrada() {
		
		    Scanner ent = new Scanner(System.in);
			System.out.println("Ficha T�cnica do Avi�o? ");
			System.out.println("");
			System.out.println("Qual o Prefixo? ");
			setPrefixo(ent.nextLine());
			System.out.println("Reajuste: ");
			setPercentual(Double.parseDouble(ent.nextLine()));
			super.entrada();
			System.out.println("Qual � a Data de Revis�o? ");
			setDatarevisao(ent.nextLine());
		    System.out.println("");
	}
}