package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
11 - As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e lhe contraram para 
desenvolver o programa que calcular� os reajustes.
Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte crit�rio, baseado no 
sal�rio atual:
sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
o sal�rio antes do reajuste;
o percentual de aumento aplicado;
o valor do aumento;
o novo sal�rio, ap�s o aumento.
 
*/
public class Exercicio_11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double perc5 = 0.05;
		double perc10 = 0.10;
		double perc15 = 0.15;
		double perc20 = 0.20;
		
		System.out.println("Informe o sal�rio: ");
		double salario = sc.nextDouble();
		
		if (salario <= 280.00) {
			System.out.println("Sal�rio antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado: " + (perc20 * 100) + " %");
			double valorReajuste = (salario * perc20);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo sal�rio: R$ " + (salario + valorReajuste));
			
		} else if (salario > 280 && salario < 700) {
			System.out.println("Sal�rio antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado: " + (perc15 * 100)  + "  %");
			double valorReajuste = (salario * perc15);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo sal�rio: R$ " + (salario + valorReajuste));
			
		} else if (salario >= 700  && salario < 1500) {
			System.out.println("Sal�rio antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado: " + (perc10 * 100)  + "  %");
			double valorReajuste = (salario * perc10);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo sal�rio: R$ " + (salario + valorReajuste));
			
		} else if  (salario >= 1500){
			System.out.println("Sal�rio antes do reajuste: R$ " + salario );
			System.out.println("Percentual aplicado:  " + + (perc5 * 100) + "  %");
			double valorReajuste = (salario * perc5);
			System.out.println("Valor do reajuste: R$ " + valorReajuste);
			System.out.println("Valor do novo sal�rio: R$ " + (salario + valorReajuste));
		}
		
		sc.close();
		
	}
	
}