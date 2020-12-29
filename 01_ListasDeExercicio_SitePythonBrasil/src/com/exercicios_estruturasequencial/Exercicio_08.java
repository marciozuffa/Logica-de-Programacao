package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
08 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês. 
*/

public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Informe o valor da hora trahalhada: ");
		double valorHora = input.nextDouble();

		System.out.println("Informe quantas horas trabalhadas no mes: ");
		double horasMes = input.nextDouble();

		double salario = (valorHora * horasMes);

		System.out.println("Valor da hora: " + valorHora + " reais.");
		System.out.println("Número de horas trabalhadas: " + horasMes);
		System.out.println("Salário: " + salario + " reais.");

		input.close();
	}
}
