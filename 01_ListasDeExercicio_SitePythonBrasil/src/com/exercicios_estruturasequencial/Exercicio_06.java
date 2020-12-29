package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
06 - Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
 
*/

public class Exercicio_06 {
	
	public static void main(String[] args) {
	
	Scanner input  = new Scanner(System.in);
	
	System.out.println("Informe o valor do raio: ");
	double  raio = input.nextDouble();
	
	double  area =  (Math.PI * Math.pow(raio, 2));
	
	System.out.printf("Área =   %.2f" , area);
	
	input.close();
	
	}
}
