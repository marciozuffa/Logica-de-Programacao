package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
05 - Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média 
alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.
 
*/

public class Exercicio_05 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota_1 = in.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota_2 = in.nextDouble();
		
		double media = ((nota_1 + nota_2) / 2 );
		
		if (media  == 10) {
			System.out.println("Aprovado(a) com distinção!!");
		} else if(media >= 7){
			System.out.println("Aprovado(a!)");
		} else {
			System.out.println("Reprovado(a!)");
		}
		
		in.close();

	}
	
}
