package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
 03 - Fa�a um Programa que pe�a dois n�meros e imprima a soma.
 
*/

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		float  num1 = input.nextFloat();
		
		System.out.println("Digite outro n�mero: ");
	    float  num2 = input.nextFloat();

		float  soma = (num1 + num2);
		
		System.out.println("A soma dos dois n�meros � igual a: " + soma );
		
		input.close();
	}
}
