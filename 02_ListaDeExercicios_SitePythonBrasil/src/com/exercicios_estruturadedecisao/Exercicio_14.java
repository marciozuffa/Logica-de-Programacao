package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
14 - Faça um programa que lê as duas notas parciais obtidas por um aluno numa disciplina ao longo de um semestre, 
e calcule a sua média. A atribuição de conceitos obedece à tabela abaixo:
  Média de Aproveitamento  Conceito
  Entre 9.0 e 10.0        A
  Entre 7.5 e 9.0          B
  Entre 6.0 e 7.5          C
  Entre 4.0 e 6.0          D
  Entre 4.0 e zero        E
O algoritmo deve mostrar na tela as notas, a média, o conceito correspondente e a mensagem 
“APROVADO” se o conceito for A, B ou C ou “REPROVADO” se o conceito for D ou E. 

*/

public class Exercicio_14 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o nome do(a) aluno(a): ");
		String nome = scan.next();

		System.out.println("Informa a primeira nota: ");
		double n1 = scan.nextDouble();
		
		System.out.println("Informa a segunda nota: ");
		double n2 = scan.nextDouble();
		
		double media = ((n1 + n2) / 2);
		
		if (media >= 9.0 || media == 10) {
			System.out.println("Aluno(a): " + nome);
			System.out.println("Nota 1: " + n1 + " ,  Nota 2: " + n2);
			System.out.println("Média: " + media + " , Conceito  A");
			System.out.println("Aprovado(a)!");

		} else if (media >= 7.5 && media  < 9.0) {
			System.out.println("Aluno(a): " + nome);
			System.out.println("Nota 1: " + n1 + " ,  Nota 2: " + n2);
			System.out.println("Média: " + media + " , Conceito  B");
			System.out.println("Aprovado(a)!");
			
		} else if (media >= 6.0  && media  < 7.5) {
			System.out.println("Aluno(a): " + nome);
			System.out.println("Nota 1: " + n1 + " ,  Nota 2: " + n2);
			System.out.println("Média: " + media + " , Conceito  C");
			System.out.println("Aprovado(a)!");
			
		} else if (media >= 4.0  && media  < 6.0) {
			System.out.println("Aluno(a): " + nome);
			System.out.println("Nota 1: " + n1 + " ,  Nota 2: " + n2);
			System.out.println("Média: " + media + " , Conceito  D");
			System.out.println("Reprovado(a)!");
			
		} else if (media >= 0.0  && media  <  4.0) {
			System.out.println("Aluno(a): " + nome);
			System.out.println("Nota 1: " + n1 + " ,  Nota 2: " + n2);
			System.out.println("Média: " + media + " , Conceito  E");
			System.out.println("Reprovado(a)!");
		}
		
		scan.close();
		
	}
	
}