package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

23 - Fa�a um Programa que pe�a um n�mero e informe se o n�mero � inteiro ou decimal. 
Dica: utilize uma fun��o de arredondamento.
 
*/

public class Exercicio_23 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um n�mero: ");
		double numero = scan.nextDouble();
		
		double num = Math.round(numero);
		
		if (numero ==  num) {
			System.out.println(numero + " � interio");
		}else {
			System.out.println(numero + " � decimal");
		}
		
		scan.close();
		
	}
	
}