package Atividade;

import java.util.Scanner;

public class lacoRepeticaoFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numero = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o primeiro número do intervalo: ");
        int n1 = numero.nextInt();

        System.out.print("Digite o último número do intervalo: ");
        int n2 = numero.nextInt();

        // Verifica se o intervalo é válido
        if (n1 >= n2) {
            System.out.println("\nIntervalo inválido!");
        } else {
            System.out.println("\nNo Intervalo entre " + n1 + " e " + n2 + ":");

            // Laço de repetição FOR para percorrer o intervalo
            for (int i = n1; i <= n2; i++) {
                // Verifica se o número é múltiplo de 3 e 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println(i + " é múltiplo de 3 e 5");
                }
            }
        }
        numero.close();
    }
}