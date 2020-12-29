package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
17 - Faça um Programa para uma loja de tintas. O programa deverá pedir o tamanho em metros quadrados da área a ser 
pintada. Considere que a cobertura da tinta é de 1 litro para cada 6 metros quadrados e que a tinta é vendida em latas de 
18 litros, que custam R$ 80,00 ou em galões de 3,6 litros, que custam R$ 25,00.
Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
comprar apenas latas de 18 litros;
comprar apenas galões de 3,6 litros;
misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e sempre arredonde os 
valores para cima, isto é, considere latas cheias. 

*/

public class Exercicio_17 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Informe a área a ser pintada: ");
		double  area = sc.nextDouble();
		
		double precoLata = 80.00;
		
		double precoGalao = 25.00;
		
		double  areaCoberturaLata = (18 * 6);
		
		double  areaCoberturaGalao = (3.6 * 6);
		
		double orcamentoLata = (area / areaCoberturaLata) * (precoLata);
		
		double orcamentoLatasNecssarias = (area / areaCoberturaLata) ;
		
		double orcamentoGalao = (area / areaCoberturaGalao) * (precoGalao);
		
		double orcamentoGalaoNecessario = (area / areaCoberturaGalao);
		
		System.out.println("Orçamento apenas com lata de tinta: ");
		System.out.printf("Quantidade de latas:  %.2f \n", orcamentoLatasNecssarias );
		System.out.printf( "Preço:  R$ %.2f \n",  orcamentoLata);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Orçamento apenas com galões: ");
		System.out.printf("Quantidade de galões:  %.2f \n", orcamentoGalaoNecessario);
		System.out.printf( "Preço:  R$ %.2f",  orcamentoGalao);
		
		sc.close();
		
	}
}
