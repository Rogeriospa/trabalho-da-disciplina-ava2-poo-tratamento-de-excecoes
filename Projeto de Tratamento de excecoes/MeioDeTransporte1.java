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
    
        //Vetor �nico de ve�culo para instaciar navio e avi�o.   
    	MeioDeTransporte1[] veiculo = new MeioDeTransporte1[2];
    		
    		//Iniciei o tratamento usando "try".
    		try{
    			
    			//Usei o loop "for" para solicitar dez dados de cada objeto ve�culo diferente.
    	    	for (int i = 0; i <= 2; i++) {
    	    		
    	    		veiculo[i] = new MeioDeTransporte1();
    		
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
            }
    	    	
    	    	for (int j = 0; j <= 2; j++) {
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
            veiculo[j].nome = nome;
            veiculo[j].capacidadetanque1 = capacidadetanque1;
            veiculo[j].numeropassageiros1 = numeropassageiros1;
            veiculo[j].numerotripulantes = numerotripulantes;
            veiculo[j].passageirosportripulantes = numeropassageiros1 / numerotripulantes;
            veiculo[j].preco1 = preco1;
            veiculo[j].datalancamento = datalancamento;
           
            System.out.println("");
            System.out.println("FICHA T�CNICA DO NAVIO: ");
            System.out.println("");
            System.out.println("Nome: " + veiculo[j].nome);
            System.out.println("N�mero de tripulantes: " + veiculo[j].numerotripulantes);
            System.out.println("Data de lan�amento: " + veiculo[j].datalancamento);
            System.out.println("Capacidade do tanque: " + veiculo[j].capacidadetanque1);
            System.out.println("N�mero de Passageiros: " + veiculo[j].numeropassageiros1);
            System.out.println("N�mero de passageiros por tripulantes: " + veiculo[j].passageirosportripulantes);
            System.out.println("Pre�o por passageiros: R$ " + veiculo[j].preco1);
            System.out.println("");
    	    
            //In�cio da Exce��o. Estou usando NumberFormaException, pois � a exce��o que ocorre quando se troca inteiro por string
            //onde se est� pedindo inteiro, se coloca string.
    	    	}}catch(ArrayIndexOutOfBoundsException exception) {
    		System.out.println("");
    		System.out.println("POSI��O INEXISTENTE DO VETOR!!!!!!");
    		System.out.println("");
    	    	}catch(NumberFormatException exception) {
    	    		System.out.println("VALOR INFORMADO , N�O � UM N�MERO!!!!!!");
    	    		System.out.println("");
    	    	}
    		ent.close();
    		System.out.println("FIM DA ENTRADA DE DADOS PARA O VETOR!!!!!!!!");
}
}