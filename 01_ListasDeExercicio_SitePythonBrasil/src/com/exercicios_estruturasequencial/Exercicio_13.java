package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
13 - Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que calcule seu peso ideal,
 utilizando as seguintes fórmulas:
Para homens: (72.7*h) - 58
Para mulheres: (62.1*h) - 44.7
 
*/

public class Exercicio_13 {

	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		System.out.println("Informe a altura: ");
		double altura = scanner.nextDouble();
		
		double homens = ((72.7 * altura) - 58);
		
		double mulheres = ((62.1 * altura) - 44.7);
		
		System.out.printf("Mulheres com altura = %.2f  \n" ,  altura);
		System.out.printf("Peso ideal = %.2f kg \n" ,  mulheres);
		System.out.printf("Homens com altura =  %.2f \n" ,altura );
		System.out.printf("Peso ideal = %.2f kg" ,  homens);

		scanner.close();
	}
}
