package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
22 - Faça um Programa que peça um número inteiro e determine se ele é par ou impar. Dica: utilize o operador módulo 
(resto da divisão). 

*/

public class Exercicio_22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um número inteiro: ");
		int numero = scanner.nextInt();
		
		if  (numero % 2 == 0) {
			System.out.println("Número Par");
		} else {
			System.out.println("Número Ímpar");
		}

		scanner.close();

	}
	
}