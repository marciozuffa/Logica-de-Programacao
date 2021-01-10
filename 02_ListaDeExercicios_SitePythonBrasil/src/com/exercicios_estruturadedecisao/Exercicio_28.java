package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

28 - O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:

                         Até 5 Kg                    Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra            R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha           R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
porém não há limites para a quantidade de carne por cliente. Se a compra for feita no cartão Tabajara 
o cliente receberá ainda um desconto de 5% sobre o total da compra. 
Escreva um programa que peça o tipo e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, 
contendo as informações da compra: 

tipo e quantidade de carne, 
preço total, 
tipo de pagamento, 
valor do desconto e 
valor a pagar.

*/

public class Exercicio_28 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o tipo de carne que deseja: ");
		String tipo = scan.nextLine();

		System.out.println("Informe a quantidade de carne em kilos: ");
		double kilos = scan.nextDouble();

		System.out.println("Informe se a compra esta sendo feita com o cartão Tabajara: 1 - sim ou 2 -  não: ");
		int cartao = scan.nextInt();

		if (tipo.equalsIgnoreCase("file duplo") && kilos <= 5 && cartao == 1) {
			double precoTotal = (kilos * 4.90);
			double valorDesconto = (precoTotal * 0.05);
			double totalAPagar = precoTotal - (valorDesconto);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f\n", precoTotal);
			System.out.println("Cartão Tabajara - cod.  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("file duplo") && kilos <= 5 && cartao == 2) {
			double precoTotal = (kilos * 4.90);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cartão Tabajara - cod. " + cartao + " não");
			System.out.println("Valor do desconto: R$ 0.00 ");
			System.out.printf("Valor a pagar: R$ %.2f \n", precoTotal);
		}

		if (tipo.equalsIgnoreCase("file duplo") && kilos > 5 && cartao == 1) {
			double precoTotal = (kilos * 5.80);
			double valorDesconto = (precoTotal * 0.05);
			double totalAPagar = precoTotal - (valorDesconto);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f\n", precoTotal);
			System.out.println("Cartão Tabajara - cod  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("file duplo") && kilos > 5 && cartao == 2) {
			double precoTotal = (kilos * 5.80);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cartão Tabajara - cod. " + cartao + " não");
			System.out.println("Valor do desconto: R$ 0.00 ");
			System.out.printf("Valor a pagar: R$ %.2f \n", precoTotal);
		}

		if (tipo.equalsIgnoreCase("alcatra") && kilos <= 5 && cartao == 1) {
			double precoTotal = (kilos * 5.90);
			double valorDesconto = (precoTotal * 0.05);
			double totalAPagar = precoTotal - (valorDesconto);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f\n", precoTotal);
			System.out.println("Cartão Tabajara - cod.  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("alcatra") && kilos <= 5 && cartao == 2) {
			double precoTotal = (kilos * 5.90);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cartão Tabajara - cod. " + cartao + " não");
			System.out.println("Valor do desconto: R$ 0.00 ");
			System.out.printf("Valor a pagar: R$ %.2f \n", precoTotal);
		}

		if (tipo.equalsIgnoreCase("alcatra") && kilos > 5 && cartao == 1) {
			double precoTotal = (kilos * 6.80);
			double valorDesconto = (precoTotal * 0.05);
			double totalAPagar = precoTotal - (valorDesconto);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f\n", precoTotal);
			System.out.println("Cartão Tabajara - cod. " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("alcatra") && kilos > 5 && cartao == 2) {
			double precoTotal = (kilos * 6.80);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cartão Tabajara - cod. " + cartao + " não");
			System.out.println("Valor do desconto: R$ 0.00 ");
			System.out.printf("Valor a pagar: R$ %.2f \n", precoTotal);
		}

		if (tipo.equalsIgnoreCase("picanha") && kilos <= 5 && cartao == 1) {
			double precoTotal = (kilos * 6.90);
			double valorDesconto = (precoTotal * 0.05);
			double totalAPagar = precoTotal - (valorDesconto);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f\n", precoTotal);
			System.out.println("Cartão Tabajara - cod.  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("picanha") && kilos <= 5 && cartao == 2) {
			double precoTotal = (kilos * 6.90);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cartão Tabajara - cod. " + cartao + " não");
			System.out.println("Valor do desconto: R$ 0.00 ");
			System.out.printf("Valor a pagar: R$ %.2f \n", precoTotal);
		}

		if (tipo.equalsIgnoreCase("picanha") && kilos > 5 && cartao == 1) {
			double precoTotal = (kilos * 7.80);
			double valorDesconto = (precoTotal * 0.05);
			double totalAPagar = precoTotal - (valorDesconto);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f\n", precoTotal);
			System.out.println("Cartão Tabajara - cod  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("picanha") && kilos > 5 && cartao == 2) {
			double precoTotal = (kilos * 7.80);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cartão Tabajara - cod. " + cartao + " não");
			System.out.println("Valor do desconto: R$ 0.00 ");
			System.out.printf("Valor a pagar: R$ %.2f \n", precoTotal);
		}

		scan.close();

	}

}