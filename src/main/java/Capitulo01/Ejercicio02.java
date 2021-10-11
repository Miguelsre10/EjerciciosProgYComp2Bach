package Capitulo01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un numero entero:");
		int numEntero = sc.nextInt();
		System.out.println("El numero entero es: "+ numEntero);

		System.out.println("Introduzca un numero flotrate");
		float numFlotante = sc.nextFloat();
		System.out.println("El numero flotante es: "+ numFlotante); 
		
		System.out.println("Introduzca un numero doble");
		double numDoble = sc.nextDouble();
		System.out.println("El numero doble es: " + numDoble ); 

	}

}