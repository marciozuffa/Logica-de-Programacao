package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
18 - Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet 
(em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). 
*/

public class Exercicio_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informar o tamanho do arquivo em MB: ");
		double  arquivo = sc.nextDouble();
		
		System.out.println("Informar a velocidade da internet em Mbps: ");
		double velocidade = sc.nextDouble();
		
		double  tempoAproximado = ((arquivo  /  velocidade)  / 60); 
		
		System.out.printf("Tempo aproximado: %.2f",  tempoAproximado );
		
		sc.close();

	}
}
