package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
  
                                            Lista de Exercícios- Esttrutura de Decisão
                                           https://wiki.python.org.br/EstruturaSequencial
                                           
                                           
01 - Faça um Programa que peça dois números e imprima o maior deles.
 
*/

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n1 = input.nextInt();
		
		System.out.println("Digite outro número: ");
		int n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior número é: " + n1);
		} else {
			System.out.println("O maior número é: " + n2);
		}
		
		input.close();

	}
	
}