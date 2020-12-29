package com.exercicios_estruturasequencial;

import java.util.Scanner;

/*
17 - Fa�a um Programa para uma loja de tintas. O programa dever� pedir o tamanho em metros quadrados da �rea a ser 
pintada. Considere que a cobertura da tinta � de 1 litro para cada 6 metros quadrados e que a tinta � vendida em latas de 
18 litros, que custam R$ 80,00 ou em gal�es de 3,6 litros, que custam R$ 25,00.
Informe ao usu�rio as quantidades de tinta a serem compradas e os respectivos pre�os em 3 situa��es:
comprar apenas latas de 18 litros;
comprar apenas gal�es de 3,6 litros;
misturar latas e gal�es, de forma que o desperd�cio de tinta seja menor. Acrescente 10% de folga e sempre arredonde os 
valores para cima, isto �, considere latas cheias. 

*/

public class Exercicio_17 {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Informe a �rea a ser pintada: ");
		double  area = sc.nextDouble();
		
		double precoLata = 80.00;
		
		double precoGalao = 25.00;
		
		double  areaCoberturaLata = (18 * 6);
		
		double  areaCoberturaGalao = (3.6 * 6);
		
		double orcamentoLata = (area / areaCoberturaLata) * (precoLata);
		
		double orcamentoLatasNecssarias = (area / areaCoberturaLata) ;
		
		double orcamentoGalao = (area / areaCoberturaGalao) * (precoGalao);
		
		double orcamentoGalaoNecessario = (area / areaCoberturaGalao);
		
		System.out.println("Or�amento apenas com lata de tinta: ");
		System.out.printf("Quantidade de latas:  %.2f \n", orcamentoLatasNecssarias );
		System.out.printf( "Pre�o:  R$ %.2f \n",  orcamentoLata);
		System.out.println("---------------------------------------------------------------------");
		System.out.println("Or�amento apenas com gal�es: ");
		System.out.printf("Quantidade de gal�es:  %.2f \n", orcamentoGalaoNecessario);
		System.out.printf( "Pre�o:  R$ %.2f",  orcamentoGalao);
		
		sc.close();
		
	}
}
