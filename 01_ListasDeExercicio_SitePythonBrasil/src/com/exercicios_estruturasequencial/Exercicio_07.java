package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
 07 - Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
*/

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado do quadrado:");
		double lado = input.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		double resultado = (area * 2);

		System.out.println("A área do quadrado é: " + area + " , o dobro dela é: " + resultado);
		
		input.close();
	}
}
