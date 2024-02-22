package Atividade;

import java.util.Scanner;


public class lacoCondicionalIf {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		int n1 = 0, n2 = 0, n3 = 0;
		
		System.out.println("Digite o número A: " );
		n1 = numero.nextInt();
		
		System.out.println("Digite o número B: " );
		n2 = numero.nextInt();
		
		System.out.println("Digite o número C: " );
		n3 = numero.nextInt();
		
		numero.close();
		
		if((n1 + n2) >= n3)
			System.out.println("A soma de A + B é maior que C");
		else
			System.out.println("A soma de A + B é menor que C");
			
		
	}
	

	}
