package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

18 - Fa�a um Programa que pe�a uma data no formato dd/mm/aaaa e determine se a mesma � uma data v�lida.
 
*/

public class Exercicio_18 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o dia: xx");
		int dia = scan.nextInt();
		
		System.out.println("Informe do mes: xx ");
		int mes = scan.nextInt();
		
		System.out.println("Informe o ano:  xxxx");
		int ano = scan.nextInt();
		
		if (dia >=1 && dia <= 31 && mes >=1 && mes <= 12 &&  ano >= 0) {// por pr�pria op��o foi colocado ano negativo invalido
			System.out.println("Data v�lida: " + dia + " /" + mes + " /" + ano);
		} else {
			System.out.println("Data inv�lida: " + dia + " /" + mes + " /" + ano);
		}
		
		scan.close();

	}

}