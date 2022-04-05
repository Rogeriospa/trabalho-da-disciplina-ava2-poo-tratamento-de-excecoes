package uva.com;

import java.util.Scanner;

public class MeioDeTransporte1 {
	
private static String prefixo;
private static int capacidadetanque;
private static int numeropassageiros;
private static double percentual;
private static double preco;
private static String datarevisao;
private static String nome;
private static int capacidadetanque1;
private static int numeropassageiros1;
private static int numerotripulantes;
private static int passageirosportripulantes;
private static double preco1;
private static String datalancamento;

public static void main(String[] args) {
	
    Scanner ent = new Scanner(System.in);
    
        //Vetor único de veículo para instaciar navio e avião.   
    	MeioDeTransporte1[] veiculo = new MeioDeTransporte1[2];
    		
    		//Iniciei o tratamento usando "try".
    		try{
    			
    			//Usei o loop "for" para solicitar dez dados de cada objeto veículo diferente.
    	    	for (int i = 0; i <= 2; i++) {
    	    		
    	    		veiculo[i] = new MeioDeTransporte1();
    		
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
            }
    	    	
    	    	for (int j = 0; j <= 2; j++) {
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
            veiculo[j].nome = nome;
            veiculo[j].capacidadetanque1 = capacidadetanque1;
            veiculo[j].numeropassageiros1 = numeropassageiros1;
            veiculo[j].numerotripulantes = numerotripulantes;
            veiculo[j].passageirosportripulantes = numeropassageiros1 / numerotripulantes;
            veiculo[j].preco1 = preco1;
            veiculo[j].datalancamento = datalancamento;
           
            System.out.println("");
            System.out.println("FICHA TÉCNICA DO NAVIO: ");
            System.out.println("");
            System.out.println("Nome: " + veiculo[j].nome);
            System.out.println("Número de tripulantes: " + veiculo[j].numerotripulantes);
            System.out.println("Data de lançamento: " + veiculo[j].datalancamento);
            System.out.println("Capacidade do tanque: " + veiculo[j].capacidadetanque1);
            System.out.println("Número de Passageiros: " + veiculo[j].numeropassageiros1);
            System.out.println("Número de passageiros por tripulantes: " + veiculo[j].passageirosportripulantes);
            System.out.println("Preço por passageiros: R$ " + veiculo[j].preco1);
            System.out.println("");
    	    
            //Início da Exceção. Estou usando NumberFormaException, pois é a exceção que ocorre quando se troca inteiro por string
            //onde se está pedindo inteiro, se coloca string.
    	    	}}catch(ArrayIndexOutOfBoundsException exception) {
    		System.out.println("");
    		System.out.println("POSIÇÃO INEXISTENTE DO VETOR!!!!!!");
    		System.out.println("");
    	    	}catch(NumberFormatException exception) {
    	    		System.out.println("VALOR INFORMADO , NÃO É UM NÚMERO!!!!!!");
    	    		System.out.println("");
    	    	}
    		ent.close();
    		System.out.println("FIM DA ENTRADA DE DADOS PARA O VETOR!!!!!!!!");
}
}