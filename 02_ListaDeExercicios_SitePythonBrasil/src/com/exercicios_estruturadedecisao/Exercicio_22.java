package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
22 - Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. Dica: utilize o operador m�dulo 
(resto da divis�o). 

*/

public class Exercicio_22 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro: ");
		int numero = scanner.nextInt();
		
		if  (numero % 2 == 0) {
			System.out.println("N�mero Par");
		} else {
			System.out.println("N�mero �mpar");
		}

		scanner.close();

	}
	
}