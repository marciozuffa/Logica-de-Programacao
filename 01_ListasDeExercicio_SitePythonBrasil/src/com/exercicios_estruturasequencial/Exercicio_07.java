package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
 07 - Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.
*/

public class Exercicio_07 {

	public static void main(String[] args) {
		
		Scanner input  = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado do quadrado:");
		double lado = input.nextDouble();
		
		double area = Math.pow(lado, 2);
		
		double resultado = (area * 2);

		System.out.println("A �rea do quadrado �: " + area + " , o dobro dela �: " + resultado);
		
		input.close();
	}
}
