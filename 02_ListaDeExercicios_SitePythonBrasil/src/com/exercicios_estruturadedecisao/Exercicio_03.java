package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
03 - Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". 
Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido. 

*/

public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Escolha F ou M: ");
		String letra = input.next();

		if (letra.equalsIgnoreCase("F")) {
			System.out.println("Sexo Feminino");
		} else if (letra.equalsIgnoreCase("M")) {
			System.out.println("Sexo Masculino");
		} else {
			System.out.println("Sexo Inv�lido");
		}

		input.close();
		
	}
	
}