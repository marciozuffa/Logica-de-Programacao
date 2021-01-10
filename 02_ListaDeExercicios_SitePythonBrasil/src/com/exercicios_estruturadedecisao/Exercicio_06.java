package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
06 - Faça um Programa que leia três números e mostre o maior deles. 

*/

public class Exercicio_06 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		double n1 = in.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		double n2 = in.nextDouble();
		
		System.out.println("Informe o terceiro número: ");
		double n3 = in.nextDouble();
		
		if (n1 >  n2 && n1 >  n3 && n2 >  n3) {
			System.out.println("O maior número é: " + n1);
		}else if (n1 <  n2 && n1 >  n3 && n2 >  n3) {
			System.out.println("O maior número é: " + n2);
		} else  {
			System.out.println("O maior número é: " + n3);
		} 
		
		in.close();
		
	}
	
}