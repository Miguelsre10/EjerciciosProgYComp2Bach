package Capitulo03_Bucles_bloque02;

import java.util.Scanner;

public class Ejercicio04_MultiplosDeUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros, num, resultado = 0;
		
		System.out.println("¿Cuantos numeros desea introducir?");
		numeros = sc.nextInt();
		System.out.println("intoduzca un numero");
		num = sc.nextInt();
		
		for (int i = 1; resultado < numeros; i++) {
			resultado = num * i;
			System.out.println("El "+ resultado + " es el el multiplo "+ i + " del " + num);
		}
	}

}