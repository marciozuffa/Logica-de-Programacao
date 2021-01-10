package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
11 - As Organizações Tabajara resolveram dar um aumento de salário aos seus colaboradores e lhe contraram para 
desenvolver o programa que calculará os reajustes.
Faça um programa que recebe o salário de um colaborador e o reajuste segundo o seguinte critério, baseado no 
salário atual:
salários até R$ 280,00 (incluindo) : aumento de 20%
salários entre R$ 280,00 e R$ 700,00 : aumento de 15%
salários entre R$ 700,00 e R$ 1500,00 : aumento de 10%
salários de R$ 1500,00 em diante : aumento de 5% Após o aumento ser realizado, informe na tela:
o salário antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo salário, após o aumento.
 
*/
public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double perc5 = 0.05;
		double perc10 = 0.10;
		double perc15 = 0.15;
		double perc20 = 0.20;
		
		System.out.println("Informe o salário: ");
		double salario = sc.nextDouble();
		
		if (salario <= 280.00) {
			System.out.println("Salário antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado: " + (perc20 * 100) + " %");
			double valorReajuste = (salario * perc20);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo salário: R$ " + (salario + valorReajuste));
			
		} else if (salario > 280 && salario < 700) {
			System.out.println("Salário antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado: " + (perc15 * 100)  + "  %");
			double valorReajuste = (salario * perc15);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo salário: R$ " + (salario + valorReajuste));
			
		} else if (salario >= 700  && salario < 1500) {
			System.out.println("Salário antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado: " + (perc10 * 100)  + "  %");
			double valorReajuste = (salario * perc10);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo salário: R$ " + (salario + valorReajuste));
			
		} else if  (salario >= 1500){
			System.out.println("Salário antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado:  " + + (perc5 * 100) + "  %");
			double valorReajuste = (salario * perc5);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo salário: R$ " + (salario + valorReajuste));
		}
		
		sc.close();
		
	}
	
}