package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
15 - Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 
8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:
+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
Obs.: Salário Bruto - Descontos = Salário Líquido. 

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
		System.out.println("Salário Bruto:  R$" +  salarioBruto);
		System.out.println("IR (11%) : R$ " + irDesconto);
		System.out.println("INSS (8%) : R$ " +    inssDesconto);
		System.out.println("Sindicato ( 5%) : R$ " + sindicatoDesconto);
		System.out.println("Salário Liquido : R$ " + salarioLiquido);
		
		scan.close();

	}

}
