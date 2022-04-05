package uva.com;

import java.util.Scanner;

import junit.framework.TestCase;

public class MeioDeTransporteTest extends TestCase {
	
	//Atributos
		String prefixo, datarevisao, nome, datalancamento;
		int capacidadetanque, numeropassageiros; 
		int numerotripulantes, passageirosportripulantes;
		double percentual, preco;

	public static void main(String[] args) {
		
	    Scanner ent = new Scanner(System.in);
	    
	        //Vetor único de veículo para instaciar navio e avião.   
	    	MeioDeTransporte[] veiculo = new MeioDeTransporte[9];
	    	
	    	System.out.println("ENTRE COM OS DADOS DOS VEÍCULOS!!!!");
	    	System.out.println("");
	    		
	    		//Inicio do tratamento de exceção usando "try".
	    		try{
	    		
	    		//Usei o loop "for" para solicitar dez dados de cada objeto veículo diferente.
	    	    for (int i = 0; i <= 9; i++) {
	    	    		
	    	    veiculo[i] = new MeioDeTransporte();
	    			
	    		//Código onde pode ocorrer a exceção.
	    	    //Entrada de dados usando o Scanner.
	    		System.out.println("FORMULÁRIO DE PREENCHIMENTO TÉCNICO DOS AVIÕES: ");
				System.out.println("");
				System.out.println("Qual o prefixo do avião? ");
				String prefixo = ent.nextLine();
				System.out.println("Qual a Data de Revisão do avião? ");
				String datarevisao = ent.nextLine();
				System.out.println("Qual a capacidade do tanque do avião? ");
				int capacidadetanque = Integer.parseInt(ent.nextLine());
				System.out.println("Qual o número de passageiros suporta o avião? ");
				int numeropassageiros = Integer.parseInt(ent.nextLine());
				System.out.println("Valor do reajuste? ");
				double percentual = Double.parseDouble(ent.nextLine());
				System.out.println("Qual o preço por passageiros? ");
				double preco = Double.parseDouble(ent.nextLine());
				System.out.println("");
				
				//Objeto veículo para mostrar os dados de avião.
				veiculo[i].prefixo = prefixo;
				veiculo[i].capacidadetanque = capacidadetanque;
				veiculo[i].numeropassageiros = numeropassageiros;
				veiculo[i].percentual = percentual;
				veiculo[i].preco = preco + (percentual * preco / 100);
				veiculo[i].datarevisao = datarevisao;

				//Para mostrar os dados lançado através do Scanner.
				System.out.println("FICHA TÉCNICA DO AVIÃO: ");
			    System.out.println("");
			    System.out.println("Prefixo: " + veiculo[i].prefixo);
			    System.out.println("Data de Revisão: " + veiculo[i].datarevisao);
			    System.out.println("Capacidade do Tanque: " + veiculo[i].capacidadetanque);
			    System.out.println("Número de Passageiro: " + veiculo[i].numeropassageiros);
			    System.out.println("Preço reajustado é: R$ " + veiculo[i].preco);
			    System.out.println("");	    
			    
			    //Código onde pode ocorrer a exceção.
	    	    //Entrada de dados usando o Scanner.
			    System.out.println("FORMULÁRIO DE PREENCHIMENTO TÉCNICO DOS NAVIOS: ");
	            System.out.println("");
	            System.out.println("Qual o nome do navio? ");
	            String nome = ent.nextLine();
	            System.out.println("Qual o número de tripulantes do navio? ");
	            int numerotripulantes = Integer.parseInt(ent.nextLine());
	            System.out.println("Qual a data de lançamento? ");
	            String datalancamento = ent.nextLine();
	            System.out.println("Qual a capacidade do tanque do navio? ");
	            int capacidadetanque1 = Integer.parseInt(ent.nextLine());
	            System.out.println("Qual o número de passageiros? ");
	            int numeropassageiros1 = Integer.parseInt(ent.nextLine());
	            System.out.println("Qual o preço por passageiros? ");
	            double preco1 = Double.parseDouble(ent.nextLine());
	            
				//Objeto veículo para mostrar os dados de navio.
	            veiculo[i].nome = nome;
	            veiculo[i].capacidadetanque = capacidadetanque;
	            veiculo[i].numeropassageiros = numeropassageiros;
	            veiculo[i].numerotripulantes = numerotripulantes;
	            veiculo[i].passageirosportripulantes = numeropassageiros / numerotripulantes;
	            veiculo[i].preco = preco1;
	            veiculo[i].datalancamento = datalancamento;
	           
	            //Para mostrar os dados lançado através do Scanner.
	            System.out.println("");
	            System.out.println("FICHA TÉCNICA DO NAVIO: ");
	            System.out.println("");
	            System.out.println("Nome: " + veiculo[i].nome);
	            System.out.println("Número de tripulantes: " + veiculo[i].numerotripulantes);
	            System.out.println("Data de lançamento: " + veiculo[i].datalancamento);
	            System.out.println("Capacidade do tanque: " + veiculo[i].capacidadetanque);
	            System.out.println("Número de Passageiros: " + veiculo[i].numeropassageiros);
	            System.out.println("Número de passageiros por tripulantes: " + veiculo[i].passageirosportripulantes);
	            System.out.println("Preço por passageiros: R$ " + veiculo[i].preco);
	            System.out.println("");
	            
	            //Caso haja a solicitação de uma nova posição no vetor, e essa não existe. Um ArrayIndexOutOfBoundsException, será acionado.
	    	    }}catch(ArrayIndexOutOfBoundsException exception) {
	    		System.out.println("POSIÇÃO INEXISTENTE DO VETOR!!!!!!");
	    		System.out.println("");
	    		
	            //Caso coloque uma letra no lugar de um número. Um NumberFormatException, será acionado.
	    	    }catch(NumberFormatException exception) {
	    	    System.out.println("VALOR INFORMADO , NÃO É UM NÚMERO!!!!!!");
	    	    System.out.println("");
	    	    }
	    		
	    		//Caso ocorra uma exceção, a entrada de dados será encerrada pelo programa.
	    		ent.close();
	    		System.out.println("FIM DA ENTRADA DE DADOS PARA O VETOR!!!!!!!!");

             }
        }