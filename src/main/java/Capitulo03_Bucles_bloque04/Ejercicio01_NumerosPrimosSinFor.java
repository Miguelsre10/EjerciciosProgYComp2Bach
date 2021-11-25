package Capitulo03_Bucles_bloque04;

import java.util.Scanner;

public class Ejercicio01_NumerosPrimosSinFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i;
		boolean numeroEsPrimo = true;
		
		System.out.println("Dame el número: ");
		num = sc.nextInt();
		
		i = 2;
		while (i < num) {
			if (num % i == 0) {
				numeroEsPrimo = false;
			}
			i++;
		}

		if (numeroEsPrimo == true) {
			System.out.println("El número " + num + " es primo");
		}
		else {
			System.out.println("El número " + num + " es compuesto");
		}
	}

}
