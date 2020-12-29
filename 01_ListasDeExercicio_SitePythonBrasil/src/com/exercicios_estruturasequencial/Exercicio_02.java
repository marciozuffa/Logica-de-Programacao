package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
02 - Faça um Programa que peça um número e então mostre a mensagem  "O número informado foi [número]."

*/

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int  numero = scanner.nextInt();
		
		System.out.println("O número digitado foi: " + numero);
		
		scanner.close();

	}
}
