package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
13 - Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. 
(1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inv�lido. 

*/

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um n�mero correspondente ao dia da semana: 1 - domingo....");
		int numero = sc.nextInt();

		switch (numero) {

		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-Feira");
			break;
		case 3:
			System.out.println("Ter�a-Feira");
			break;
		case 4:
			System.out.println("Quarta-Feira");
			break;
		case 5:
			System.out.println("Quinta-Feira");
			break;
		case 6:
			System.out.println("Sexta-Feira");
			break;
		case 7:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("Valor Inv�lido");
		}

		sc.close();

	}
	
}