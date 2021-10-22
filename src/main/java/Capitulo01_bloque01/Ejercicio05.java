package Capitulo01_bloque01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int aux;
		
		System.out.println("Introduzca la primera variable");
		int num1 = sc.nextInt();
		
		System.out.println("Introduzca la segunda varaible");
		int num2 = sc.nextInt();
		
		System.out.println("Num1: " + num1 + " - Num2: " + num2 );

		aux = num1;
		num1 = num2;
		num2 = aux;
		
		System.out.println("Num1: " + num1 + " - Num2: " + num2 );

	}

}
