package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
09 - Faça um Programa que leia três números e mostre-os em ordem decrescente.
 
*/

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double n1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double n2 = scanner.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double n3 = scanner.nextDouble();
		
		if (n1 < n2 && n2 < n3  &&  n1 < n3 ) {
			System.out.println("Orderm decrescente: " + n3 + " , " + n2 + " , " + n1);
		} else if (n1 < n2 && n2 > n3 && n1 < n3 ) {
			System.out.println("Orderm decrescente: " + n2 + " , " + n3 + " , " + n1);
		} else if (n1 > n2 && n2 < n3 && n1 <  n3) {
			System.out.println("Orderm decrescente: " + n3 + " , " + n1 + " , " + n2);
		}else if (n1 < n2 && n2 > n3 && n1 > n3) {
			System.out.println("Orderm decrescente: " + n2 + " , " + n1 + " , " + n3);
		} else if (n1 > n2 && n2 < n3 && n1 > n3) {
			System.out.println("Orderm decrescente: " + n1 + " , " + n3 + " , " + n2);
		} else if (n1 > n2 && n2 > n3 && n1 > n3) {
			System.out.println("Orderm decrescente: " + n1 + " , " + n2 + " , " + n3);
		}

		scanner.close();

	}
	
}