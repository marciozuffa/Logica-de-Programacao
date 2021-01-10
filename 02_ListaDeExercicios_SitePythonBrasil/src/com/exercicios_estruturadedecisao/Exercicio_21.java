package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
21 - Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao usuário a valor do saque e depois 
informar quantas notas de cada valor serão fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. 
O valor mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar com a quantidade de notas 
existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de 100, uma nota de 50, uma nota de 
5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de 100, uma nota de 50, quatro notas de
10, uma nota de 5 e quatro notas de 1.
 
 */

public class Exercicio_21 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor a ser sacado: ");
		int valorSaque = scan.nextInt();

		int cedulaDeCem = (int) (valorSaque / 100);
		valorSaque = valorSaque % 100;

		int cedulaDeCinquenta = (int) (valorSaque / 50);
		valorSaque = valorSaque % 50;

		int cedulaDeDez = (int) (valorSaque / 10);
		valorSaque = valorSaque % 10;

		int cedulaDeCinco = (int) (valorSaque / 5);
		valorSaque = valorSaque % 5;

		int cedulaDeUm = valorSaque;

		System.out.println("Nota de R$ 100:..." +  cedulaDeCem);
		System.out.println("Nota de R$ 50:....." +  cedulaDeCinquenta);
		System.out.println("Nota de R$ 10:....." + cedulaDeDez);
		System.out.println("Nota de R$ 5:......."  + cedulaDeCinco);
		System.out.println("Nota de R$ 1:......." +  cedulaDeUm);

		scan.close();
	}

}