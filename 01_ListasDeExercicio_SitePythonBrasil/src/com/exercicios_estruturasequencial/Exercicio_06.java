package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
06 - Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
 
*/

public class Exercicio_06 {
	
	public static void main(String[] args) {
	
	Scanner input  = new Scanner(System.in);
	
	System.out.println("Informe o valor do raio: ");
	double  raio = input.nextDouble();
	
	double  area =  (Math.PI * Math.pow(raio, 2));
	
	System.out.printf("�rea =   %.2f" , area);
	
	input.close();
	
	}
}
