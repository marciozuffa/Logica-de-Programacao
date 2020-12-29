package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
15 - Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
Calcule e mostre o total do seu sal�rio no referido m�s, sabendo-se que s�o descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, fa�a um programa que nos d�:
sal�rio bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o sal�rio l�quido.
calcule os descontos e o sal�rio l�quido, conforme a tabela abaixo:
+ Sal�rio Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Sal�rio Liquido : R$
Obs.: Sal�rio Bruto - Descontos = Sal�rio L�quido. 

*/

public class Exercicio_15 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe o valor da hora de trabalho: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Informe a quantidade de horas trabalhadas no mes: ");
		double numeroHoras = scan.nextDouble();
		
		double salarioBruto = (valorHora * numeroHoras);
		
		double irDesconto =  (salarioBruto * 0.11);
		
		double inssDesconto = (salarioBruto * 0.08);
		
		double sindicatoDesconto = (salarioBruto * 0.05);
		
		double salarioLiquido = (salarioBruto) - (irDesconto + inssDesconto + sindicatoDesconto);
		
		System.out.println("Horas trabalhadas no mes: " + numeroHoras);
		System.out.println("Valor da hora de trabalho: R$ "+ valorHora);
		System.out.println("Sal�rio Bruto:  R$" +  salarioBruto);
		System.out.println("IR (11%) : R$ " + irDesconto);
		System.out.println("INSS (8%) : R$ " +    inssDesconto);
		System.out.println("Sindicato ( 5%) : R$ " + sindicatoDesconto);
		System.out.println("Sal�rio Liquido : R$ " + salarioLiquido);
		
		scan.close();

	}

}
