package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
02 - Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem  "O n�mero informado foi [n�mero]."

*/

public class Exercicio_02 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um n�mero: ");
		int  numero = scanner.nextInt();
		
		System.out.println("O n�mero digitado foi: " + numero);
		
		scanner.close();

	}
}
