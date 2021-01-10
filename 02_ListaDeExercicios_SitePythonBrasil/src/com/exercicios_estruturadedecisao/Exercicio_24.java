package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*

24 - Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual opera��o ele deseja realizar. 
O resultado da opera��o deve ser acompanhado de uma frase que diga se o n�mero �:
par ou �mpar;
positivo ou negativo;
inteiro ou decimal.
 
*/

public class Exercicio_24 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero:  ");
		double n1 = scan.nextDouble();
		
		System.out.println("Digite o segundo  n�mero:  ");
		double n2 = scan.nextDouble();
		
		System.out.println("Qual opera��o deseja realizar?  Digite uma op��o:");
		System.out.println(" 1 - adi��o");
		System.out.println(" 2 - subtra��o");
		System.out.println(" 3 - multipli��o");
		System.out.println(" 4 - divis�o");
		double opcao  = scan.nextDouble();
		
		double resultado = 0;
		
		if (opcao == 1) {
			 resultado = (n1 + n2);
		} else if (opcao == 2) {
			 resultado = (n1 -  n2);
		} else if (opcao == 3) {
			 resultado = (n1 *  n2);
		} else if (opcao == 4) {
			 resultado = (n1 /  n2);
		}
		
		System.out.printf("Resultado: %.2f \n ",  resultado);
		
		if (resultado % 2 == 0) {
			System.out.println("N�mero par");
		} else {
			System.out.println("N�mero impar");
		} 
		
		if (resultado >= 0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
		}
		
		double tipo = Math.round(resultado);

		if (tipo == resultado) {
			System.out.println("N�mero inteiro");
		} else {
			System.out.println("N�mero decimal");
		}
		
		scan.close();
		
	}

}