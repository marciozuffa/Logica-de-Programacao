package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

 17 - Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano e em seguida informe se este 
 ano � ou n�o bissexto.
 
*/

public class Exercicio_17 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o ano: ");
		int ano = scan.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println(ano + " � bissesto");
		} else {
			System.out.println(ano + " n�o � bissesto");
		}
		
		scan.close();

	}

}