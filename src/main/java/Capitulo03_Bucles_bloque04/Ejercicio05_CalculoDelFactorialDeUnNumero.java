package Capitulo03_Bucles_bloque04;

import java.util.Scanner;

public class Ejercicio05_CalculoDelFactorialDeUnNumero {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num, suma =1, multiplicador=0;
		System.out.println("Introduzca un numero");
		num = sc.nextInt();
		multiplicador =num - 1;
		
		 while(multiplicador>=0) {
			 
			 suma = suma * (num -multiplicador);
			 
			 multiplicador--;
		 }
				
		System.out.println("!"+ num +" es igual a "+ suma);
	}

}