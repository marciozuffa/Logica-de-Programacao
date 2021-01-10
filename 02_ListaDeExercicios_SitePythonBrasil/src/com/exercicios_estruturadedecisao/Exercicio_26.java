package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
26 - Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
�lcool:
at� 20 litros, desconto de 3% por litro
acima de 20 litros, desconto de 5% por litro
Gasolina:
at� 20 litros, desconto de 4% por litro
acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o n�mero de litros vendidos, 
o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor a ser pago pelo 
cliente sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do �lcool � R$ 1,90.
 
*/

public class Exercicio_26 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o tipo de combust�vel:  A-�lcool, G-gasolina");
		String tipo = scan.nextLine();
		
		System.out.println("Informe a quantidade de litros");
		double quantidadeLitros = scan.nextDouble();
		
		if (tipo.equalsIgnoreCase("A")  && quantidadeLitros > 20) {
			double valorPago = quantidadeLitros *  ((1.90) - (1.90 * 0.05));
			System.out.printf("Valor a pagar: R$  %.2f" , valorPago);
			
		} else if (tipo.equalsIgnoreCase("A")  && quantidadeLitros <= 20){
			double valorPago = quantidadeLitros *  ((1.90) - (1.90 * 0.03));
			System.out.printf("Valor a pagar: R$  %.2f" , valorPago);
		}
		
		if (tipo.equalsIgnoreCase("G")  && quantidadeLitros > 20) {
			double valorPago = quantidadeLitros *  ((2.50) - (2.50 * 0.06));
			System.out.printf("Valor a pagar: R$  %.2f" , valorPago);
			
		} else if (tipo.equalsIgnoreCase("G")  && quantidadeLitros <= 20){
			double valorPago = quantidadeLitros *  ((2.50) - (2.50 * 0.04));
			System.out.printf("Valor a pagar: R$  %.2f" , valorPago);
		}
		
		scan.close();
		
	}

}