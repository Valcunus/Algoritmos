package exerciciosvetores;
import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		//Variaveis
		int par = 0, impar = 0;
		
		//Vetor
		int[] arrayNumero  = new int[7];

		//Estrutura de Repeti��o
		for(int i=1;i<7;i++){

			System.out.println("Digite um n�mero");
			arrayNumero[i] = entrada.nextInt();
					
			if(arrayNumero[i] %2 == 0){
				System.out.println("Este n�mero � par");
				par++;
			}else{
				System.out.println("Este n�mero � impar");
				impar++;
			}
		}
			//Saidas
			
			System.out.println("Total de n�meros pares: " + par);
			System.out.println("Total de n�meros impares: " + impar);
			
			entrada.close();

		}
	}
