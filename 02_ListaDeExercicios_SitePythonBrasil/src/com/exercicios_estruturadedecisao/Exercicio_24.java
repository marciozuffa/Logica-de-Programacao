package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

24 - Faça um Programa que leia 2 números e em seguida pergunte ao usuário qual operação ele deseja realizar. 
O resultado da operação deve ser acompanhado de uma frase que diga se o número é:
par ou ímpar;
positivo ou negativo;
inteiro ou decimal.
 
*/

public class Exercicio_24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número:  ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite o segundo  número:  ");
		double n2 = scan.nextDouble();
		
		System.out.println("Qual operação deseja realizar?  Digite uma opção:");
		System.out.println(" 1 - adição");
		System.out.println(" 2 - subtração");
		System.out.println(" 3 - multiplição");
		System.out.println(" 4 - divisão");
		double opcao  = scan.nextDouble();
		
		double resultado = 0;
		
		if (opcao == 1) {
			 resultado = (n1 + n2);
		} else if (opcao == 2) {
			 resultado = (n1 -  n2);
		} else if (opcao == 3) {
			 resultado = (n1 *  n2);
		} else if (opcao == 4) {
			 resultado = (n1 /  n2);
		}
		
		System.out.printf("Resultado: %.2f \n ",  resultado);
		
		if (resultado % 2 == 0) {
			System.out.println("Número par");
		} else {
			System.out.println("Número impar");
		} 
		
		if (resultado >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		double tipo = Math.round(resultado);

		if (tipo == resultado) {
			System.out.println("Número inteiro");
		} else {
			System.out.println("Número decimal");
		}
		
		scan.close();
		
	}

}