package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
11 - Fa�a um Programa que pe�a 2 n�meros inteiros e um n�mero real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
O terceiro elevado ao cubo.
 
*/

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um n�mero inteiro: ");
		int A = scan.nextInt();
		
		System.out.println("Digite outro  n�mero inteiro: ");
		int B = scan.nextInt();
		
		System.out.println("Digite um n�mero real ");
		double  C = scan.nextDouble();

		double produto = (A *2) * (B/2);
		
		double soma =  (A * 3) + (C);
		
		double cubo = Math.pow(C,3);
		
		System.out.println("O produto do dobro do primeiro com metade do segundo: " + produto);
		System.out.println("A soma do triplo do primeiro com o terceiro: " + soma);
		System.out.println("O terceiro elevado ao cubo: " + cubo);
		
		scan.close();
	}
}
