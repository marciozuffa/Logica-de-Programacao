package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

23 - Faça um Programa que peça um número e informe se o número é inteiro ou decimal. 
Dica: utilize uma função de arredondamento.
 
*/

public class Exercicio_23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um número: ");
		double numero = scan.nextDouble();
		
		double num = Math.round(numero);
		
		if (numero ==  num) {
			System.out.println(numero + " é interio");
		}else {
			System.out.println(numero + " é decimal");
		}
		
		scan.close();
		
	}
	
}