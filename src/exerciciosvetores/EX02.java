package exerciciosvetores;
import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		//Variaveis
		
		int credito = 0, debito = 0;
		
		//Vetor
		String[] arrayNome = new String [7];
		int[] arrayNumero = new int [7];
		
		for(int i=1;i<7;i++){
			
			System.out.println("Informe o valor");
			arrayNumero[i]=entrada.nextInt();
			
			System.out.println("Informe o tipo de operação: D - Débito - C - Crédito");
			arrayNome[i]=entrada.next();
			
			if(arrayNome[i] == "D"){
				credito=credito+arrayNumero[i];
			}else{
				debito=debito+arrayNumero[i];
			}
			
			System.out.println("Total de debito: " + debito);
			System.out.println("Total de credito: " + credito);
		}
		
		entrada.close();
	}
}