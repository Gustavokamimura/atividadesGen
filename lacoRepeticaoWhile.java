package Atividade;

import java.util.Scanner;

public class lacoRepeticaoWhile {

	public static void main(String[] args) {
        
		Scanner scanner = new Scanner(System.in);

        // Inicializando contadores
        int totalMenoresDe21 = 0;
        int totalMaioresDe50 = 0;

        // Leitura inicial da idade
        System.out.print("Digite uma idade: ");
        int idade = scanner.nextInt();

        // Laço de repetição WHILE para ler idades até que seja digitada uma idade negativa
        while (idade >= 0) {
            // Verifica a idade e incrementa os contadores
            if (idade < 21) {
                totalMenoresDe21++;
            } else if (idade > 50) {
                totalMaioresDe50++;
            }

            // Leitura da próxima idade
            System.out.print("Digite uma idade: ");
            idade = scanner.nextInt();
        }

        // Exibindo os resultados
        System.out.println("\nTotal de pessoas menores de 21 anos: " + totalMenoresDe21);
        System.out.println("Total de pessoas maiores de 50 anos: " + totalMaioresDe50);

        // Fechando o Scanner
        scanner.close();
    }

	

}
