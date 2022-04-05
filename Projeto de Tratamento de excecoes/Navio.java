package uva.com;

import java.util.Scanner;

public class Navio extends Veiculo {
	
	//Atributos
	protected String nome;
	protected int numerotripulantes;
	protected String datalancamento;
	protected int passageirosportripulantes;
	
	//M�todo construtor sem par�metro
	public Navio() {
		
	}
	
	//M�todo construtor com par�metro
	public Navio(String nome, int numerotripulantes, String datalancamento, int passageirosportripulantes) {
		this.nome = nome;
		this.numerotripulantes = numerotripulantes;
		this.datalancamento = datalancamento;
		this.passageirosportripulantes = passageirosportripulantes;
	}
	
	public Navio(String nome, int numerotripulantes, String datalancamento, int passageirosportripulantes, int capacidadetanque, int numeropassageiros, float preco) {
		super(capacidadetanque, numeropassageiros, preco);
		this.nome = nome;
		this.numerotripulantes = numerotripulantes;
		this.datalancamento = datalancamento;
		this.passageirosportripulantes = passageirosportripulantes;
	}
    
	//M�todo Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumerotripulantes() {
		return numerotripulantes;
	}

	public void setNumerotripulantes(int numerotripulantes) {
		this.numerotripulantes = numerotripulantes;
	}

	public String getDatalancamento() {
		return datalancamento;
	}

	public void setDatalancamento(String datalancamento) {
		this.datalancamento = datalancamento;
	}

	public int getPassageirosportripulantes() {
		return passageirosportripulantes;
	}

	public void setPassageirosportripulantes(int passageirosportripulantes) {
		this.passageirosportripulantes = passageirosportripulantes;
	}
	
	public void passageirosportripulantes() {
		
	}
	
	//M�todo imprimir
	public void imprimir() {
		
		System.out.println("Dados T�cnicos do Navio");
		System.out.println("");
		System.out.println("Nome: " + getNome());
		super.imprimir();
		System.out.println("N�mero de Tripulantes: " + getNumerotripulantes());
		System.out.println("N�mero de Passageiros: " + getNumeropassageiros() / getNumerotripulantes());
		System.out.println("Data de Lan�amento: " + getDatalancamento());
	}
	
	//M�todo de Entrada de Dados
	public void entrada() {
		
		    Scanner ent = new Scanner(System.in);
			System.out.println("Ficha T�cnica do Navio! ");
			System.out.println("");
			System.out.println("Qual o Nome? ");
			setNome(ent.nextLine());
			System.out.println("Qual o N�mero de Tripulantes? ");
			setNumeropassageiros(Integer.parseInt(ent.nextLine()));
			super.entrada();
			System.out.println("Quando � a Data de Lan�amento?");
			setDatalancamento(ent.nextLine());
		    System.out.println("");
	}
}