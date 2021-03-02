package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		Criando um scanner
		Scanner scn = new Scanner(System.in);
		String condition;
					
// 		Criando um objeto através da classe Caneta		
		Caneta c1 = new Caneta();
			
//				Atribuição das características da caneta
				System.out.print("Insira o modelo da sua caneta: ");
				condition = scn.next();
				c1.model = condition;
				
				System.out.print("Insira a cor da sua caneta: ");
				condition = scn.next();
				c1.color = condition;

				System.out.print("Insira a espessura da sua caneta: ");
				condition = scn.next();
				c1.ponta = Float.parseFloat(condition);

				System.out.print("Sua caneta está tampada? ");
				condition = scn.next();
				c1.tampada = condition;
				
//				Execução dos métodos
				c1.status(); /* Mostra as características da caneta */
				c1.rabiscar(); /* Solicita se é possível rabiscar */
				c1.tampar(); /* Solicita que a caneta seja tampada */
				c1.destampar(); /* Solicita que a caneta seja destampada */ 
				
//		ENCERRA O SCANNER
		scn.close();	
	}
}