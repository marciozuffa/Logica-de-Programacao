package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
04 - Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia. 
*/

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double nota_1 = sc.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota_2 = sc.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double nota_3 = sc.nextDouble();
		
		System.out.println("Digite a quarta nota: ");
		double nota_4 = sc.nextDouble();
		
       double media = (nota_1 + nota_2 + nota_3 + nota_4)  / 4;
       
		System.out.printf("A m�dia � igual a : %.2f ",  media);
		
		sc.close();
	}
}
