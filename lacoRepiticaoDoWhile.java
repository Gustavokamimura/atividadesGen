package Atividade;

import java.util.Scanner;

public class lacoRepiticaoDoWhile {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializando a variável de soma
        int somaPositivos = 0;

        // Leitura inicial do número
        int numero;
        do {
            System.out.print("Digite um número: ");
            numero = scanner.nextInt();

            // Verifica se o número é positivo e adiciona à soma
            if (numero > 0) {
                somaPositivos += numero;
            }

        } while (numero != 0);

        // Exibindo o resultado
        System.out.println("\nA soma dos números positivos é: " + somaPositivos);

        // Fechando o Scanner
        scanner.close();
    }

	

}
