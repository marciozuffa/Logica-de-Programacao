package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
 03 - Faça um Programa que peça dois números e imprima a soma.
 
*/

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		float  num1 = input.nextFloat();
		
		System.out.println("Digite outro número: ");
	    float  num2 = input.nextFloat();

		float  soma = (num1 + num2);
		
		System.out.println("A soma dos dois números é igual a: " + soma );
		
		input.close();
	}
}
