package com.exercicios_estruturadedecisao;

/*
 
02 - Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo. 

*/

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um número: ");
		double numero = input.nextDouble();

		if (numero >= 0) {
			System.out.println(numero + " é positivo");
		} else {
			System.out.println(numero + " é negativo ");
		}

		input.close();
		
	}
	
}