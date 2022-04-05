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
	    
	        //Vetor �nico de ve�culo para instaciar navio e avi�o.   
	    	MeioDeTransporte[] veiculo = new MeioDeTransporte[9];
	    	
	    	System.out.println("ENTRE COM OS DADOS DOS VE�CULOS!!!!");
	    	System.out.println("");
	    		
	    		//Inicio do tratamento de exce��o usando "try".
	    		try{
	    		
	    		//Usei o loop "for" para solicitar dez dados de cada objeto ve�culo diferente.
	    	    for (int i = 0; i <= 9; i++) {
	    	    		
	    	    veiculo[i] = new MeioDeTransporte();
	    			
	    		//C�digo onde pode ocorrer a exce��o.
	    	    //Entrada de dados usando o Scanner.
	    		System.out.println("FORMUL�RIO DE PREENCHIMENTO T�CNICO DOS AVI�ES: ");
				System.out.println("");
				System.out.println("Qual o prefixo do avi�o? ");
				String prefixo = ent.nextLine();
				System.out.println("Qual a Data de Revis�o do avi�o? ");
				String datarevisao = ent.nextLine();
				System.out.println("Qual a capacidade do tanque do avi�o? ");
				int capacidadetanque = Integer.parseInt(ent.nextLine());
				System.out.println("Qual o n�mero de passageiros suporta o avi�o? ");
				int numeropassageiros = Integer.parseInt(ent.nextLine());
				System.out.println("Valor do reajuste? ");
				double percentual = Double.parseDouble(ent.nextLine());
				System.out.println("Qual o pre�o por passageiros? ");
				double preco = Double.parseDouble(ent.nextLine());
				System.out.println("");
				
				//Objeto ve�culo para mostrar os dados de avi�o.
				veiculo[i].prefixo = prefixo;
				veiculo[i].capacidadetanque = capacidadetanque;
				veiculo[i].numeropassageiros = numeropassageiros;
				veiculo[i].percentual = percentual;
				veiculo[i].preco = preco + (percentual * preco / 100);
				veiculo[i].datarevisao = datarevisao;

				//Para mostrar os dados lan�ado atrav�s do Scanner.
				System.out.println("FICHA T�CNICA DO AVI�O: ");
			    System.out.println("");
			    System.out.println("Prefixo: " + veiculo[i].prefixo);
			    System.out.println("Data de Revis�o: " + veiculo[i].datarevisao);
			    System.out.println("Capacidade do Tanque: " + veiculo[i].capacidadetanque);
			    System.out.println("N�mero de Passageiro: " + veiculo[i].numeropassageiros);
			    System.out.println("Pre�o reajustado �: R$ " + veiculo[i].preco);
			    System.out.println("");	    
			    
			    //C�digo onde pode ocorrer a exce��o.
	    	    //Entrada de dados usando o Scanner.
			    System.out.println("FORMUL�RIO DE PREENCHIMENTO T�CNICO DOS NAVIOS: ");
	            System.out.println("");
	            System.out.println("Qual o nome do navio? ");
	            String nome = ent.nextLine();
	            System.out.println("Qual o n�mero de tripulantes do navio? ");
	            int numerotripulantes = Integer.parseInt(ent.nextLine());
	            System.out.println("Qual a data de lan�amento? ");
	            String datalancamento = ent.nextLine();
	            System.out.println("Qual a capacidade do tanque do navio? ");
	            int capacidadetanque1 = Integer.parseInt(ent.nextLine());
	            System.out.println("Qual o n�mero de passageiros? ");
	            int numeropassageiros1 = Integer.parseInt(ent.nextLine());
	            System.out.println("Qual o pre�o por passageiros? ");
	            double preco1 = Double.parseDouble(ent.nextLine());
	            
				//Objeto ve�culo para mostrar os dados de navio.
	            veiculo[i].nome = nome;
	            veiculo[i].capacidadetanque = capacidadetanque;
	            veiculo[i].numeropassageiros = numeropassageiros;
	            veiculo[i].numerotripulantes = numerotripulantes;
	            veiculo[i].passageirosportripulantes = numeropassageiros / numerotripulantes;
	            veiculo[i].preco = preco1;
	            veiculo[i].datalancamento = datalancamento;
	           
	            //Para mostrar os dados lan�ado atrav�s do Scanner.
	            System.out.println("");
	            System.out.println("FICHA T�CNICA DO NAVIO: ");
	            System.out.println("");
	            System.out.println("Nome: " + veiculo[i].nome);
	            System.out.println("N�mero de tripulantes: " + veiculo[i].numerotripulantes);
	            System.out.println("Data de lan�amento: " + veiculo[i].datalancamento);
	            System.out.println("Capacidade do tanque: " + veiculo[i].capacidadetanque);
	            System.out.println("N�mero de Passageiros: " + veiculo[i].numeropassageiros);
	            System.out.println("N�mero de passageiros por tripulantes: " + veiculo[i].passageirosportripulantes);
	            System.out.println("Pre�o por passageiros: R$ " + veiculo[i].preco);
	            System.out.println("");
	            
	            //Caso haja a solicita��o de uma nova posi��o no vetor, e essa n�o existe. Um ArrayIndexOutOfBoundsException, ser� acionado.
	    	    }}catch(ArrayIndexOutOfBoundsException exception) {
	    		System.out.println("POSI��O INEXISTENTE DO VETOR!!!!!!");
	    		System.out.println("");
	    		
	            //Caso coloque uma letra no lugar de um n�mero. Um NumberFormatException, ser� acionado.
	    	    }catch(NumberFormatException exception) {
	    	    System.out.println("VALOR INFORMADO , N�O � UM N�MERO!!!!!!");
	    	    System.out.println("");
	    	    }
	    		
	    		//Caso ocorra uma exce��o, a entrada de dados ser� encerrada pelo programa.
	    		ent.close();
	    		System.out.println("FIM DA ENTRADA DE DADOS PARA O VETOR!!!!!!!!");

             }
        }