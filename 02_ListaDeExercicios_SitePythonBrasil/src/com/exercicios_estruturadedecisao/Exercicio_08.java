package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
08 - Fa�a um programa que pergunte o pre�o de tr�s produtos e informe qual produto voc� deve comprar, 
sabendo que a decis�o � sempre pelo mais barato. 

*/

public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe o pre�o do primeiro produto: ");
		double preco1 = scanner.nextDouble();
		
		System.out.println("Informe o pre�o do segundo produto: ");
		double preco2 = scanner.nextDouble();
		
		System.out.println("Informe o pre�o do terceiro produto: ");
		double preco3 = scanner.nextDouble();
		
		if (preco1 > preco2 && preco2 > preco3 ) {
			System.out.println("O pre�o mais barato �:  R$" + preco3);
		} else if (preco2 > preco1 && preco3 > preco1) {
			System.out.println("O pre�o mais barato �:  R$" + preco1);
		} else if (preco1 > preco2 && preco3 > preco2) {
			System.out.println("O pre�o mais barato �:  R$" + preco2);
		}

		scanner.close();

	}
	
}