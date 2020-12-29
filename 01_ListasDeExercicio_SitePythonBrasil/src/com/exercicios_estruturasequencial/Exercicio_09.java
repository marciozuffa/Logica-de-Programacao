package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
09 - Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
C = 5 * ((F-32) / 9).
 
*/

public class Exercicio_09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

			System.out.println("Informe a temperatura em graus Fahrenheit: ");
			float F = scan.nextFloat();
			
			float C = 5 * ((F - 32) / 9);
			
			System.out.printf(F + " graus Fahreinheit correspondem em  graus Celsius a %.2f  ", C);

			scan.close();
	}
}
