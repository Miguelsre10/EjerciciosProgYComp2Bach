package Capitulo02_bloque01;

import java.util.Scanner;

public class c02_Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		System.out.println("Introduzca el numero: ");
		num1 = sc.nextInt();
		if (num1 %2 == 1) {
			System.out.println("El numero "+ num1 + " es impar");
		}
		else {
			System.out.println("El numero "+ num1 + " es par");

		}
		
		}

}
