package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
05 - Faça um Programa que converta metros para centímetros.

*/

public class Exercicio_05 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor em metro(s) ");
		float metro = sc.nextFloat();
		
		float cm = (metro * 100);
		
		System.out.println(metro + " metro(s) corresponde(m) a: " + cm + " centimetro(s)");
		
		sc.close();
	}
}
