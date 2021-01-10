package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
19 - Faça um Programa que leia um número inteiro menor que 1000 e imprima a quantidade de centenas, dezenas 
e unidades do mesmo.
Observando os termos no plural a colocação do "e", da vírgula entre outros. 
Exemplo:
326 = 3 centenas, 2 dezenas e 6 unidades
12 = 1 dezena e 2 unidades Testar com: 326, 300, 100, 320, 310,305, 301, 101, 311, 111, 25, 20, 10, 21, 11, 1, 7 e 16

*/

public class Exercicio_19 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com o  número:");
		 double valor = scan.nextDouble();
		 
		double unidade = (valor % 10);
		 
		double extrairUnidade = (valor - unidade) / 10;
		 
		double dezena = extrairUnidade % 10;
		 
		 double centena = valor / 100; 
		
		 System.out.println((int)valor + " =  " + (int)centena + " centena(s), " + (int)dezena + " dezena(s) e " + (int)unidade + "  unidade(s)");

		scan.close();
		
	}

}