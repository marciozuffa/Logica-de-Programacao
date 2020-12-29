package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
16 - Fa�a um programa para uma loja de tintas. O programa dever� pedir o tamanho em metros quadrados da �rea a 
ser pintada. Considere que a cobertura da tinta � de 1 litro para cada 3 metros quadrados e que a tinta � vendida em 
latas de 18 litros, que custam R$ 80,00. Informe ao usu�rio a quantidades de latas de tinta a serem compradas e o 
pre�o total.

*/

public class Exercicio_16 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe em metros quadrados a �rea a ser pintada: ");
		int area = scan.nextInt();
		
		double preco = 80.00;
		
		double areaCoberturaPorLata = (18 * 3);
		
		double qtdLatas = (area / areaCoberturaPorLata) ;
		
		double precoTotal = qtdLatas * preco;
		
		System.out.println("�rea a ser pintada: " + area + " m2");
		System.out.printf("Quantidade de latas de tinta: %.2f",  qtdLatas);
		System.out.println();
		System.out.printf("Pre�o total: R$ %.2f  ", precoTotal);
		
		scan.close();
		
	}
}
