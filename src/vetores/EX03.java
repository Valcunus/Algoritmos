package vetores;
import java.util.Scanner;

public class EX03 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double media = 0, valor = 0;

		//Vetor
		Double[] arrayNumero = new Double[6];

		//Estrutura de repeti��o para captar os n�meros

		for(int i=1;i<6;i++){

			System.out.println("Informe o " + i + " n�mero:");
			arrayNumero[i]=entrada.nextDouble();

			valor = valor + arrayNumero[i];
		}
		media = valor/5;

		System.out.println("A media dos 5 n�meros �: " + media);

		entrada.close();
	}
}