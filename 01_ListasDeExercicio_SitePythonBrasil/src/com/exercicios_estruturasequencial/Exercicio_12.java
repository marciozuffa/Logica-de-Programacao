package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
12 - Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que calcule seu peso ideal, 
usando a seguinte fórmula: (72.7*altura) - 58 
*/

public class Exercicio_12 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a altura: ");
		double altura = scan.nextDouble();
		
		double pesoIdeal = ((72.7 * altura) - 58);
		
		System.out.printf("Altura: %.2f  mt(s ) \n" ,  altura );
		System.out.printf( "Peso ideal:  %.2f kg" ,  pesoIdeal);
		
		scan.close();
	}
}
