package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
08 - Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
Calcule e mostre o total do seu sal�rio no referido m�s. 
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
		System.out.println("N�mero de horas trabalhadas: " + horasMes);
		System.out.println("Sal�rio: " + salario + " reais.");

		input.close();
	}
}
