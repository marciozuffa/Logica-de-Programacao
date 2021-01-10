package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
12 - Faça um programa para o cálculo de uma folha de pagamento, sabendo que os descontos são do Imposto de Renda, 
que depende do salário bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS corresponde a 11% 
do Salário Bruto, mas não é descontado (é a empresa que deposita). O Salário Líquido corresponde ao Salário Bruto 
menos os descontos. O programa deverá pedir ao usuário o valor da sua hora e a quantidade de horas trabalhadas no mês.
Desconto do IR:
Salário Bruto até 900 (inclusive) - isento
Salário Bruto até 1500 (inclusive) - desconto de 5%
Salário Bruto até 2500 (inclusive) - desconto de 10%
Salário Bruto acima de 2500 - desconto de 20% Imprima na tela as informações, dispostas conforme o exemplo abaixo. 
No exemplo o valor da hora é 5 e a quantidade de hora é 220.
        Salário Bruto: (5 * 220)   : R$ 1100,00
        (-) IR (5%)                         : R$   55,00  
        (-) INSS ( 10%)                 : R$  110,00
        FGTS (11%)                      : R$  121,00
        Total de descontos             : R$  165,00
        Salário Liquido                  : R$  935,00 
        
*/
public class Exercicio_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double quantidadeHoras;
		double valorHora;
		double salarioBruto;
		double sindicato, inss, ir, fgts;
		double descontoSindicato = 0.03;
		double descontoIr_5 = 0.05;
		double descontoIr_10 = 0.10;
		double descontoIr_20 = 0.20;
		double descontoInss = 0.10;
		double valorFgts = 0.11;
		double totalDescontos;
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		quantidadeHoras = sc.nextDouble();
		
		System.out.println("Informe o valor da hora de trabalho: ");
		valorHora= sc.nextDouble();
		
		salarioBruto = (quantidadeHoras * valorHora);
		
		if (salarioBruto <= 900) {
			sindicato = (salarioBruto * descontoSindicato);
			inss = (salarioBruto * descontoInss);
			fgts = (salarioBruto *  valorFgts);
			totalDescontos = (sindicato + inss);
			System.out.printf("Salário bruto:  ( " + valorHora  + " * " + quantidadeHoras + ")  :R$ %.2f\n " ,  salarioBruto);
		    System.out.println("(-)Sindicato (3%)                    :R$  " +  sindicato);
		    System.out.println("(-)IR                                           isento");
			System.out.println("(-)INSS (10%)                          :R$ " +  inss);
			System.out.println(" FGTS (11%)                            :R$  "  + fgts);
			System.out.println("Total de descontos                    :R$ " + (totalDescontos));
			System.out.println("Salário Líquido                         :R$ " + (salarioBruto - totalDescontos));
			
	} else if (salarioBruto >900 && salarioBruto <= 1500) {
		sindicato = (salarioBruto * descontoSindicato);
		ir = (salarioBruto * descontoIr_5);
		inss = (salarioBruto * descontoInss);
		fgts = (salarioBruto *  valorFgts);
		totalDescontos = (sindicato + inss + ir);
		System.out.printf("Salário bruto:  ( " + valorHora  + " * " + quantidadeHoras + ")  :R$ %.2f\n " ,  salarioBruto);
	    System.out.println("(-)Sindicato (3%)                     :R$  " +  sindicato);
	    System.out.println("(-)IR (5%)                                 :R$  " + ir);
		System.out.println("(-)INSS (10%)                          :R$ " +  inss);
		System.out.println(" FGTS (11%)                            :R$  "  + fgts);
		System.out.println("Total de descontos                    :R$ " + (totalDescontos));
		System.out.println("Salário Líquido                         :R$ " + (salarioBruto - totalDescontos));
		
	} else if (salarioBruto > 1500 && salarioBruto <= 2500) {
		sindicato = (salarioBruto * descontoSindicato);
		ir = (salarioBruto * descontoIr_10);
		inss = (salarioBruto * descontoInss);
		fgts = (salarioBruto *  valorFgts);
		totalDescontos = (sindicato + inss + ir);
		System.out.printf("Salário bruto:  ( " + valorHora  + " * " + quantidadeHoras + ")  :R$ %.2f\n " ,  salarioBruto);
	    System.out.println("(-)Sindicato (3%)                    :R$  " +  sindicato);
	    System.out.println("(-)IR (10%)                              :R$  " + ir);
		System.out.println("(-)INSS (10%)                          :R$ " +  inss);
		System.out.println(" FGTS (11%)                            :R$  "  + fgts);
		System.out.println("Total de descontos                    :R$ " + (totalDescontos));
		System.out.println("Salário Líquido                         :R$ " + (salarioBruto - totalDescontos));
		
	} else if (salarioBruto > 2500) {
		sindicato = (salarioBruto * descontoSindicato);
		ir = (salarioBruto * descontoIr_20);
		inss = (salarioBruto * descontoInss);
		fgts = (salarioBruto *  valorFgts);
		totalDescontos = (sindicato + inss + ir);
		System.out.printf("Salário bruto:  ( " + valorHora  + " * " + quantidadeHoras + ")  :R$ %.2f\n " ,  salarioBruto);
	    System.out.println("(-)Sindicato (3%)                    :R$  " +  sindicato);
	    System.out.println("(-)IR (10%)                              :R$  " + ir);
		System.out.println("(-)INSS (10%)                          :R$ " +  inss);
		System.out.println(" FGTS (11%)                            :R$  "  + fgts);
		System.out.println("Total de descontos                    :R$ " + (totalDescontos));
		System.out.println("Salário Líquido                         :R$ " + (salarioBruto - totalDescontos));
		
	}

		sc.close();

	}
	
}