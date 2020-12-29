package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
11 - Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
o produto do dobro do primeiro com metade do segundo .
a soma do triplo do primeiro com o terceiro.
O terceiro elevado ao cubo.
 
*/

public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite um número inteiro: ");
		int A = scan.nextInt();
		
		System.out.println("Digite outro  número inteiro: ");
		int B = scan.nextInt();
		
		System.out.println("Digite um número real ");
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
