package Capitulo03_Bucles_bloque04;

import java.util.Scanner;

public class Ejercicio02_BuscarNumerosPrimosEnRangoDadoPorUsuarioSinFor {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, i, inicio, fin;
		boolean numeroEsPrimo = true;
		
		System.out.println("Dame el número por que quieres empezar: ");
		inicio = sc.nextInt();
		System.out.println("Dame el número por que quieres terminar: ");
		fin = sc.nextInt();
		num = inicio;
		i = 2 ;
		while (num<= fin) {
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
		 num++;
		 numeroEsPrimo = true;
		 i = 2;
		}

	}
}