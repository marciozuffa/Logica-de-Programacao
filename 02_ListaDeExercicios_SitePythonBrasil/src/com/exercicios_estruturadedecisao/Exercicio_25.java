package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

25 - Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?" O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. 
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", 
entre 3 e 4 como "Cúmplice" e 5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 
*/

public class Exercicio_25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Responda sim ou não às perguntas: ");

		System.out.println("Telefonou para a vítima?");
		String resposta1 = scan.nextLine();

		System.out.println("Esteve no local do crime?");
		String resposta2 = scan.nextLine();

		System.out.println("Mora perto da vítima?");
		String resposta3 = scan.nextLine();

		System.out.println("Devia para a vítima?");
		String resposta4 = scan.nextLine();

		System.out.println("Já trabalhou com a vítima?");
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
			System.out.println("Pessoa cúmplice");
			break;
		case 4:
			System.out.println("Pessoa cúmplice");
			break;
		case 5:
			System.out.println("Pessoa é assassina");
			break;
		default:
			System.out.println("Pessoa inocente");

		}

		scan.close();

	}

}