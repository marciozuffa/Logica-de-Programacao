package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
  
                                            Lista de Exerc�cios- Esttrutura de Decis�o
                                           https://wiki.python.org.br/EstruturaSequencial
                                           
                                           
01 - Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
 
*/

public class Exercicio_01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int n1 = input.nextInt();
		
		System.out.println("Digite outro n�mero: ");
		int n2 = input.nextInt();
		
		if (n1 > n2) {
			System.out.println("O maior n�mero �: " + n1);
		} else {
			System.out.println("O maior n�mero �: " + n2);
		}
		
		input.close();

	}
	
}