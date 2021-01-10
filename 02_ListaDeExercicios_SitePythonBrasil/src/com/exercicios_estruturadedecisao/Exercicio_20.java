package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
20 - Fa�a um Programa para leitura de tr�s notas parciais de um aluno. O programa deve calcular a m�dia alcan�ada 
por aluno e apresentar:
A mensagem "Aprovado", se a m�dia for maior ou igual a 7, com a respectiva m�dia alcan�ada;
A mensagem "Reprovado", se a m�dia for menor do que 7, com a respectiva m�dia alcan�ada;
A mensagem "Aprovado com Distin��o", se a m�dia for igual a 10. 

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
			System.out.printf("Aprovado(a) com Distin��o -  m�dia: %.2f \n",  media);
		} else if (media  >= 7) {
			System.out.printf("Aprovado(a)  -  m�dia: %.2f  \n ",  media);
		} else if  (media  < 7){
			System.out.printf("Reprovado(a)  -  m�dia: %.2f \n " ,  media );
		}
		
		scan.close();
	}
	
}