package Capitulo03_Bucles_bloque03;

import java.util.Scanner;

public class Ejercicio04_NumeroMayorYMenorHastaCero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1, pos=0, neg=0;
				
		for (int i = 0; num != 0 ; i++) {
			
			System.out.println("intoduzca un numero");
			num = sc.nextInt();
			
			if(num < 0) {
				neg++;
			}
			if(num>0)	{
				pos++;
			}
			
		}
		System.out.println("Se han introducido: " + pos + " numeros positivos");
		System.out.println("Se han introducido: " + neg + " numeros negativos");
		
	}
	
}







