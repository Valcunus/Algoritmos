package vetores;
import java.util.Scanner;

public class EX01 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		//Vetor
		String[] arrayNome = new String [5];

		//Estrutura de Repetição para captar os nomes
		for(int i=0;i<5;i++){ 
			System.out.println("Escreva 5 nomes");
			arrayNome[i]=entrada.next();
		}

		//Estrutura de Repetição para exibir os nomes
		for(int i=0;i<5;i++){
			System.out.println("O nomes: " + (i+1) + " captado foi " + arrayNome[i]);
		}
		entrada.close();
	}
}
