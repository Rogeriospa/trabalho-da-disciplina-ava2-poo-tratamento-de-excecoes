package uva.com;

import java.util.Scanner;
import junit.framework.TestCase;

public class VeiculoTest {

	public class Veiculo extends TestCase {

		//Atributos
		protected int capacidadetanque;
		protected int numeropassageiros;
		protected double preco;
		
		//Método Construtor sem parâmetro
		public Veiculo() {
			
		}
		
		//Construtor com parâmetro
		public Veiculo(int capacidadetanque, int numeropassageiros, float preco) {
			
		}
	    
		//Métodos Getters e Setters
		public int getCapacidadetanque() {
			return capacidadetanque;
		}

		public void setCapacidadetanque(int capacidadetanque) {
			this.capacidadetanque = capacidadetanque;
		}

		public int getNumeropassageiros() {
			return numeropassageiros;
		}

		public void setNumeropassageiros(int numeropassageiros) {
			this.numeropassageiros = numeropassageiros;
		}

		public double getPreco() {
			return preco;
		}

		public void setPreco(double preco) {
			this.preco = preco;
		}
	    
		//Sobrepor (toString)
		@Override
		public String toString() {
			return "Veiculo [capacidadetanque=" + capacidadetanque + ", numeropassageiros=" + numeropassageiros + ", preco="
					+ preco + "]";
		}
		
		//Método Imprimir
		public void imprimir() {
			System.out.println("Número de Passageiro: " + getNumeropassageiros());
			System.out.println("Capacidade do Tanque: " + getCapacidadetanque());
			System.out.println("Preço da Passagem: " + getPreco());
		}
		
		//Método Entrada de dados
		
		public void entrada() {
			
			Scanner ent = new Scanner(System.in);
			System.out.print("Qual a capacidade do Tanque? ");
			setCapacidadetanque(Integer.parseInt(ent.nextLine()));
			System.out.print("Qual o núemro de passageiro? ");
			setNumeropassageiros(Integer.parseInt(ent.nextLine()));
			System.out.print("Qual o preço? ");
			setPreco(Double.parseDouble(ent.nextLine()));
}
	}
}