package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
15 - Faça um Programa que peça os 3 lados de um triângulo. O programa deverá informar se os valores podem ser 
um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
Dicas:
Três lados formam um triângulo quando a soma de quaisquer dois lados for maior que o terceiro;
Triângulo Equilátero: três lados iguais;
Triângulo Isósceles: quaisquer dois lados iguais;
Triângulo Escaleno: três lados diferentes;
 
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
			System.out.println("Não é um triangulo");
		
		} else if (a == b && a == c){
			System.out.println("Triangulo equilátero");
		} else if ((a==b || b == c || a==c)) {
			System.out.println("Triangulao isóceles");
		} else {
			System.out.println("Triangulo escaleno");
		}

		scan.close();
	}

}