package com.exercicios_estruturadedecisao;

import java.util.Scanner;

/*
 
04 - Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
 
*/

public class Exercicio_04 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("Digite uma letra: ");
		String letra = in.next();	
		
		switch (letra) {
		
		case "a",  "A":
			    System.out.println("Vogal");
		        break;
		        
		case "e",  "E":
		    System.out.println("Vogal");
	        break;
	        
		case "i",  "I":
		    System.out.println("Vogal");
	        break;
	        
		case "o",  "O":
		    System.out.println("Vogal");
	        break;
	        
		case "u",  "U":
		    System.out.println("Vogal");
	        break;
	        
	        default:
	        	System.out.println("Consoante");
		}
	
		in.close();

	}
	
}