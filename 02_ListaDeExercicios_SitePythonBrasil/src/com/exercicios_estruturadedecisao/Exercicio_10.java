package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
10 - Faça um Programa que pergunte em que turno você estuda. Peça para digitar 
M-matutino ou V-Vespertino ou N- Noturno. Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!"
 ou "Valor Inválido!", conforme o caso. 
 
*/

public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a letra correspondente ao seu turno: ");
		System.out.println("M - matutino, V - verpertino, N - noturno");
		String letra = sc.next();

		if (letra.equalsIgnoreCase("M")) {
			System.out.println("Bom dia!");
		} else if (letra.equalsIgnoreCase("V")) {
			System.out.println("Boa tarde!");
		} else if (letra.equalsIgnoreCase("N")) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Valor inválido!");
		}
		
		sc.close();
		
	}
	
}