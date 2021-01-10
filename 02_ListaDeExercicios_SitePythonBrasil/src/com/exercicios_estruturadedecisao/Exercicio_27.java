package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

27 - Uma fruteira está vendendo frutas com a seguinte tabela de preços:
                        Até 5 Kg                Acima de 5 Kg
Morango         R$ 2,50 por Kg     R$ 2,20 por Kg
Maçã              R$ 1,80 por Kg       R$ 1,50 por Kg
Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
receberá ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) 
de morangos e a quantidade (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente.

*/

public class Exercicio_27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o peso em kg de morango: ");
		double pesoMorango = scan.nextDouble();
		
		System.out.println("Informe o peso em kg de maça: ");
		double pesoMaca = scan.nextDouble();
		
		double pesoTotal = (pesoMorango + pesoMaca);
		double valorTotalMorango = 0;
		double valorTotalMaca = 0;
		double valorTotalCompra = (valorTotalMorango + valorTotalMaca);;
		double precoFinal = 0;
		
		if (pesoMorango <= 5) {
			valorTotalMorango = (pesoMorango * 2.50);
		} else if (pesoMorango > 5) {
			valorTotalMorango = (pesoMorango  * 2.20);
		}
		
		if (pesoMaca <= 5) {
			valorTotalMaca = (pesoMaca * 1.80);
		} else if (pesoMaca > 5) {
			valorTotalMaca = (pesoMaca * 1.50);
		}
		
		valorTotalCompra = (valorTotalMorango + valorTotalMaca);;
		pesoTotal = (pesoMorango + pesoMaca);
		
		if (pesoTotal > 8 || valorTotalCompra > 25.00) {
		     precoFinal = valorTotalCompra - (valorTotalCompra * 0.10);
		} else {
			precoFinal = valorTotalCompra;
		}
		
		System.out.println("Morango: kg " + pesoMorango );
		System.out.println("Maçã: kg " + pesoMaca );
		System.out.printf("Total a pagar: R$ %.2f" , precoFinal);
		
		scan.close();

	}

}