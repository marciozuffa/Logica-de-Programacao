package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
15 - Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. O programa dever� informar se os valores podem ser 
um tri�ngulo. Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
Dicas:
Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
Tri�ngulo Equil�tero: tr�s lados iguais;
Tri�ngulo Is�sceles: quaisquer dois lados iguais;
Tri�ngulo Escaleno: tr�s lados diferentes;
 
*/

public class Exercicio_15 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a medida do lado a: ");
		double a = scan.nextDouble();
		
		System.out.println("Informe a medida do lado b: ");
		double b = scan.nextDouble();
		
		System.out.println("Informe a medida do lado c: ");
		double c = scan.nextDouble();
		
		if (a + b < c ||  a + c < b ||  b + c < a ){
			System.out.println("N�o � um triangulo");
		
		} else if (a == b && a == c){
			System.out.println("Triangulo equil�tero");
		} else if ((a==b || b == c || a==c)) {
			System.out.println("Triangulao is�celes");
		} else {
			System.out.println("Triangulo escaleno");
		}

		scan.close();
	}

}