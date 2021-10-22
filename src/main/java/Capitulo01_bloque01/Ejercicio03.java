package Capitulo01_bloque01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero: ");
		int nEnt = sc.nextInt();
		
		System.out.println("Introduzca un numero flotante: ");
		float nFlo = sc.nextFloat();
		
		System.out.println("Introduzca un numero doble: ");
		double nDob = sc.nextDouble();
		
		double suma = nEnt + nFlo + nDob ;
		System.out.println("La suma de los numeros introducidos es: "+ suma);
		
	}

}
