package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
06 - Fa�a um Programa que leia tr�s n�meros e mostre o maior deles. 

*/

public class Exercicio_06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o primeiro n�mero: ");
		double n1 = in.nextDouble();
		
		System.out.println("Informe o segundo n�mero: ");
		double n2 = in.nextDouble();
		
		System.out.println("Informe o terceiro n�mero: ");
		double n3 = in.nextDouble();
		
		if (n1 >  n2 && n1 >  n3 && n2 >  n3) {
			System.out.println("O maior n�mero �: " + n1);
		}else if (n1 <  n2 && n1 >  n3 && n2 >  n3) {
			System.out.println("O maior n�mero �: " + n2);
		} else  {
			System.out.println("O maior n�mero �: " + n3);
		} 
		
		in.close();
		
	}
	
}