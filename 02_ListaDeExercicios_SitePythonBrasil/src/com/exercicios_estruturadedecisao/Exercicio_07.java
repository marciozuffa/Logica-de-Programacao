package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
07 - Faça um Programa que leia três números e mostre o maior e o menor deles.
 
*/

public class Exercicio_07 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		double n1 = scanner.nextDouble();

		System.out.println("Informe o segundo número: ");
		double n2 = scanner.nextDouble();

		System.out.println("Informe o terceiro número: ");
		double n3 = scanner.nextDouble();

		if (n1 < n2 && n2 < n3  &&  n1 < n3 ) {
			System.out.println("Maior: " + n3 +  " e  menor " + n1);
		} else if (n1 < n2 && n2 > n3 && n1 < n3 ) {
			System.out.println("Maior: " + n2 +  " e  menor " + n1);
		} else if (n1 > n2 && n2 < n3 && n1 <  n3) {
			System.out.println("Maior: " + n3 +  " e  menor " + n2);
		}else if (n1 < n2 && n2 > n3 && n1 > n3) {
			System.out.println("Maior: " + n2 +  " e  menor " + n3);
		} else if (n1 > n2 && n2 < n3 && n1 > n3) {
			System.out.println("Maior: " + n1 +  " e  menor " + n2);
		} else if (n1 > n2 && n2 > n3 && n1 > n3) {
			System.out.println("Maior: " + n1 +  " e  menor " + n3);
		}

		scanner.close();

	}
	
}