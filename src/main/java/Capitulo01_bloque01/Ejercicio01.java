package Capitulo01_bloque01;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Introduzca un numero entero:");
		int numEntero = sc.nextInt();

		System.out.println("Introduzca un numero flotrate");
		float numFlotante = sc.nextFloat();

		System.out.println("Introduzca un numero doble");
		double numDoble = sc.nextDouble();
		
		System.out.println("El numero entero es: "+ numEntero + ". El numero flotante es: "+ numFlotante+ ", El numero doble es: " + numDoble ); 
	}

}