package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

18 - Faça um Programa que peça uma data no formato dd/mm/aaaa e determine se a mesma é uma data válida.
 
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
		
		if (dia >=1 && dia <= 31 && mes >=1 && mes <= 12 &&  ano >= 0) {// por própria opção foi colocado ano negativo invalido
			System.out.println("Data válida: " + dia + " /" + mes + " /" + ano);
		} else {
			System.out.println("Data inválida: " + dia + " /" + mes + " /" + ano);
		}
		
		scan.close();

	}

}