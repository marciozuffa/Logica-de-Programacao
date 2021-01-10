package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

 17 - Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este 
 ano é ou não bissexto.
 
*/

public class Exercicio_17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		int ano = scan.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println(ano + " é bissesto");
		} else {
			System.out.println(ano + " não é bissesto");
		}
		
		scan.close();

	}

}