package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
20 - Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada 
por aluno e apresentar:
A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
A mensagem "Aprovado com Distinção", se a média for igual a 10. 

*/

public class Exercicio_20 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota: ");
		double n1 = scan.nextDouble();

		System.out.println("Digite a segunda nota: ");
		double n2 = scan.nextDouble();

		System.out.println("Digite a terceira nota: ");
		double n3 = scan.nextDouble();

		double media = ((n1 + n2 + n3) / 3);

		if (media == 10) {
			System.out.printf("Aprovado(a) com Distinção -  média: %.2f \n",  media);
		} else if (media  >= 7) {
			System.out.printf("Aprovado(a)  -  média: %.2f  \n ",  media);
		} else if  (media  < 7){
			System.out.printf("Reprovado(a)  -  média: %.2f \n " ,  media );
		}
		
		scan.close();
	}
	
}