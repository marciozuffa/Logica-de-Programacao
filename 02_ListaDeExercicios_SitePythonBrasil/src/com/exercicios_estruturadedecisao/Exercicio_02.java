package com.exercicios_estruturadedecisao;

/*
 
02 - Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo. 

*/

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Digite um n�mero: ");
		double numero = input.nextDouble();

		if (numero >= 0) {
			System.out.println(numero + " � positivo");
		} else {
			System.out.println(numero + " � negativo ");
		}

		input.close();
		
	}
	
}