package vetores;
import java.util.Scanner;

public class EX02 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		//Vetor
		Double[] arrayTemp = new Double [3];
		String[] arrayNome = new String [3];

		//Estrutura de Repetição para captar os nomes

		for(int i=0;i<3;i++){ 

			System.out.println("Escreva o nome do paciente");
			arrayNome[i]=entrada.next();

			System.out.println("Informe a temperatura do paciente");
			arrayTemp[i]=entrada.nextDouble();
		}

		//Estrutura de Repetição para exibir resultados
		for(int i=0;i<3;i++){

			if(arrayTemp[i]>37){
				System.out.println("Paciente " + arrayNome[i] + " com febre.");	
			}

			entrada.close();
		}
	}
}
