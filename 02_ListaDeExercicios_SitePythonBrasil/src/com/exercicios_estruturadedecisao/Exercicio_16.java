package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

16 - Fa�a um programa que calcule as ra�zes de uma equa��o do segundo grau, na forma ax2 + bx + c. 
O programa dever� pedir os valores de a, b e c e fazer as consist�ncias, informando ao usu�rio nas seguintes situa��es:
Se o usu�rio informar o valor de A igual a zero, a equa��o n�o � do segundo grau e o programa n�o deve fazer pedir os 
demais valores, sendo encerrado;
Se o delta calculado for negativo, a equa��o n�o possui raizes reais. Informe ao usu�rio e encerre o programa;
Se o delta calculado for igual a zero a equa��o possui apenas uma raiz real; informe-a ao usu�rio;
Se o delta for positivo, a equa��o possui duas raiz reais; informe-as ao usu�rio;
 
*/

public class Exercicio_16 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o coeficiente de a: ");
		int a = scan.nextInt();
		
		if (a == 0) {
			System.out.println("O n�mero n�o pode ser negativo");
		} else {
			System.out.println("Informe o coeficiente de b: ");
			int b = scan.nextInt();
			
			System.out.println("Informe o coeficiente de c: ");
			int c = scan.nextInt();
			
			double delta = Math.pow(b, 2) - (4 * a * c);
			System.out.println("delta = " + delta);
			
			if (delta < 0) {
				System.out.println("Delta: " + delta + " -   a equa��o n�o possui raizes reais. Fim do programa");
				
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