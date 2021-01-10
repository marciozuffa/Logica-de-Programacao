package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

25 - Fa�a um programa que fa�a 5 perguntas para uma pessoa sobre um crime. As perguntas s�o:
"Telefonou para a v�tima?"
"Esteve no local do crime?"
"Mora perto da v�tima?"
"Devia para a v�tima?"
"J� trabalhou com a v�tima?" O programa deve no final emitir uma classifica��o sobre a participa��o da pessoa no crime. 
Se a pessoa responder positivamente a 2 quest�es ela deve ser classificada como "Suspeita", 
entre 3 e 4 como "C�mplice" e 5 como "Assassino". Caso contr�rio, ele ser� classificado como "Inocente".
 
*/

public class Exercicio_25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Responda sim ou n�o �s perguntas: ");

		System.out.println("Telefonou para a v�tima?");
		String resposta1 = scan.nextLine();

		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.nextLine();

		System.out.println("Mora perto da v�tima?");
		String resposta3 = scan.nextLine();

		System.out.println("Devia para a v�tima?");
		String resposta4 = scan.nextLine();

		System.out.println("J� trabalhou com a v�tima?");
		String resposta5 = scan.nextLine();

		System.out.println("Resposta 1: " + resposta1);
		System.out.println("Resposta 2: " + resposta2);
		System.out.println("Resposta 3: " + resposta3);
		System.out.println("Resposta 4: " + resposta4);
		System.out.println("Resposta 5: " + resposta5);

		System.out.println();

		System.out.println("Quantas respostas positivas foram dadas?");
		int parecer = scan.nextInt();

		switch (parecer) {
		case 2:
			System.out.println("Pessoa suspeita");
			break;
		case 3:
			System.out.println("Pessoa c�mplice");
			break;
		case 4:
			System.out.println("Pessoa c�mplice");
			break;
		case 5:
			System.out.println("Pessoa � assassina");
			break;
		default:
			System.out.println("Pessoa inocente");

		}

		scan.close();

	}

}