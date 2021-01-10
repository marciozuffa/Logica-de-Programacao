package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

28 - O Hipermercado Tabajara est� com uma promo��o de carnes que � imperd�vel. Confira:

                         At� 5 Kg                    Acima de 5 Kg
File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
Alcatra            R$ 5,90 por Kg          R$ 6,80 por Kg
Picanha           R$ 6,90 por Kg          R$ 7,80 por Kg

Para atender a todos os clientes, cada cliente poder� levar apenas um dos tipos de carne da promo��o, 
por�m n�o h� limites para a quantidade de carne por cliente. Se a compra for feita no cart�o Tabajara 
o cliente receber� ainda um desconto de 5% sobre o total da compra. 
Escreva um programa que pe�a o tipo e a quantidade de carne comprada pelo usu�rio e gere um cupom fiscal, 
contendo as informa��es da compra: 

tipo e quantidade de carne, 
pre�o total, 
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

		System.out.println("Informe se a compra esta sendo feita com o cart�o Tabajara: 1 - sim ou 2 -  n�o: ");
		int cartao = scan.nextInt();

		if (tipo.equalsIgnoreCase("file duplo") && kilos <= 5 && cartao == 1) {
			double precoTotal = (kilos * 4.90);
			double valorDesconto = (precoTotal * 0.05);
			double totalAPagar = precoTotal - (valorDesconto);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f\n", precoTotal);
			System.out.println("Cart�o Tabajara - cod.  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("file duplo") && kilos <= 5 && cartao == 2) {
			double precoTotal = (kilos * 4.90);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cart�o Tabajara - cod. " + cartao + " n�o");
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
			System.out.println("Cart�o Tabajara - cod  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("file duplo") && kilos > 5 && cartao == 2) {
			double precoTotal = (kilos * 5.80);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cart�o Tabajara - cod. " + cartao + " n�o");
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
			System.out.println("Cart�o Tabajara - cod.  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("alcatra") && kilos <= 5 && cartao == 2) {
			double precoTotal = (kilos * 5.90);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cart�o Tabajara - cod. " + cartao + " n�o");
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
			System.out.println("Cart�o Tabajara - cod. " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("alcatra") && kilos > 5 && cartao == 2) {
			double precoTotal = (kilos * 6.80);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cart�o Tabajara - cod. " + cartao + " n�o");
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
			System.out.println("Cart�o Tabajara - cod.  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("picanha") && kilos <= 5 && cartao == 2) {
			double precoTotal = (kilos * 6.90);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cart�o Tabajara - cod. " + cartao + " n�o");
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
			System.out.println("Cart�o Tabajara - cod  " + cartao + " sim");
			System.out.printf("Valor do desconto: R$ %.2f\n", valorDesconto);
			System.out.printf("Valor a pagar: R$ %.2f\n", totalAPagar);

		} else if (tipo.equalsIgnoreCase("picanha") && kilos > 5 && cartao == 2) {
			double precoTotal = (kilos * 7.80);
			System.out.println("Tipo de carne: " + tipo);
			System.out.println("Quantidade: kg " + kilos);
			System.out.printf("Valor total:  R$ %.2f \n", precoTotal);
			System.out.println("Cart�o Tabajara - cod. " + cartao + " n�o");
			System.out.println("Valor do desconto: R$ 0.00 ");
			System.out.printf("Valor a pagar: R$ %.2f \n", precoTotal);
		}

		scan.close();

	}

}