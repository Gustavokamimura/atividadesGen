package Atividade;

import java.util.Scanner;

public class lacoCondicionalSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner scanner = new Scanner(System.in);

        // Exibindo a tabela de produtos
        System.out.println("Código do Produto\tProduto\t\t\tPreço Unitário");
        System.out.println("1\t\t\tCachorro Quente\t\tR$ 10.00");
        System.out.println("2\t\t\tX-Salada\t\tR$ 15.00");
        System.out.println("3\t\t\tX-Bacon\t\t\tR$ 18.00");
        System.out.println("4\t\t\tBauru\t\t\tR$ 12.00");
        System.out.println("5\t\t\tRefrigerante\t\tR$ 8.00");
        System.out.println("6\t\t\tSuco de laranja\t\tR$ 13.00");

        // Solicitando o código do produto e a quantidade comprada
        System.out.print("Digite o código do produto (1 a 6): ");
        int codigoProduto = scanner.nextInt();

        System.out.print("\nDigite a quantidade comprada: ");
        int quantidadeComprada = scanner.nextInt();

        // Calculando o valor total da conta e obtendo o nome do produto
        double valorTotal = 0;
        String nomeProduto = "";

        switch (codigoProduto) {
            case 1:
                nomeProduto = "Cachorro Quente";
                valorTotal = quantidadeComprada * 10.00;
                break;
            case 2:
                nomeProduto = "X-Salada";
                valorTotal = quantidadeComprada * 15.00;
                break;
            case 3:
                nomeProduto = "X-Bacon";
                valorTotal = quantidadeComprada * 18.00;
                break;
            case 4:
                nomeProduto = "Bauru";
                valorTotal = quantidadeComprada * 12.00;
                break;
            case 5:
                nomeProduto = "Refrigerante";
                valorTotal = quantidadeComprada * 8.00;
                break;
            case 6:
                nomeProduto = "Suco de laranja";
                valorTotal = quantidadeComprada * 13.00;
                break;
            default:
                System.out.println("Código de produto inválido.");
                System.exit(0); // Encerra o programa se o código do produto for inválido
        }

        // Exibindo o resultado
        System.out.println("Produto: " + nomeProduto);
        System.out.println("Valor total da conta: R$ " + valorTotal);

        // Fechando o scanner
        scanner.close();
    }


	}
