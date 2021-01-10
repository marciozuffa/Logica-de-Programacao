package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

16 - Faça um programa que calcule as raízes de uma equação do segundo grau, na forma ax2 + bx + c. 
O programa deverá pedir os valores de a, b e c e fazer as consistências, informando ao usuário nas seguintes situações:
Se o usuário informar o valor de A igual a zero, a equação não é do segundo grau e o programa não deve fazer pedir os 
demais valores, sendo encerrado;
Se o delta calculado for negativo, a equação não possui raizes reais. Informe ao usuário e encerre o programa;
Se o delta calculado for igual a zero a equação possui apenas uma raiz real; informe-a ao usuário;
Se o delta for positivo, a equação possui duas raiz reais; informe-as ao usuário;
 
*/

public class Exercicio_16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o coeficiente de a: ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("O número não pode ser negativo");
		} else {
			System.out.println("Informe o coeficiente de b: ");
			int b = scan.nextInt();
			
			System.out.println("Informe o coeficiente de c: ");
			int c = scan.nextInt();
			
			double delta = Math.pow(b, 2) - (4 * a * c);
			System.out.println("delta = " + delta);
			
			if (delta < 0) {
				System.out.println("Delta: " + delta + " -   a equação não possui raizes reais. Fim do programa");
				
			} else if (delta == 0) {
				double raiz = -b / (2 * a);
				System.out.println("delta = 0  ,  raiz = " + raiz );
				
			} else  {
				double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
				double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.println("Raiz 1 = " + raiz1 + " e raiz2 = " + raiz2) ;
			}
		}

		scan.close();

	}

}