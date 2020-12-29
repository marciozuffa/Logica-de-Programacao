package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
10 - Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit. 
*/

public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a temperatura em graus Celsius: ");
		double C = scan.nextDouble();

		double F = ((C * 1.8) + 32);

		System.out.printf(C + " graus Celsius correspondem  a %.2f  F", F);

		scan.close();
		
	}
}
