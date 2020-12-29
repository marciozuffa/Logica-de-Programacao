package com.exercicios_estruturasequencial;

/*
14 -  Jo�o Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento di�rio 
de seu trabalho. Toda vez que ele traz um peso de peixes maior que o estabelecido pelo regulamento de pesca do estado 
de S�o Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um 
programa que leia a vari�vel peso (peso de peixes) e calcule o excesso. Gravar na vari�vel excesso a quantidade 
de quilos al�m do limite e na vari�vel multa o valor da multa que Jo�o dever� pagar. Imprima os dados do programa 
com as mensagens adequadas.
 
*/

import java.util.Scanner;

public class Exercicio_14 {

	public static void main(String[] args) {
		
		Scanner scan  = new Scanner(System.in);
		
		System.out.println("Informe o peso dos peixes pescados: ");
		double pesoPeixes = scan.nextDouble();
		
		double pesoPermitido = 50;
		
		double multa = 4.00;
		
		double excesso  = (pesoPeixes - pesoPermitido);
		
		double multaValor = (excesso * multa); 
		
		System.out.println("Peso de peixes pescados: " +  pesoPeixes + " kg");
		System.out.println("Peso permitido: " + pesoPermitido + " kg");
		System.out.println("Excesso de peso: " + excesso + " kg");
		System.out.printf("Valor da multa:  R$ %.2f \n ",  multa );
		System.out.printf("Valor da multa a pagar:  R$ %.2f ",  multaValor);
		
		scan.close();
	}
}
