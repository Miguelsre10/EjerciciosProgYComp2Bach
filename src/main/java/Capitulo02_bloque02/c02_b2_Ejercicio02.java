package Capitulo02_bloque02;

import java.util.Scanner;

public class c02_b2_Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion, num1, num2;
		
		System.out.println("Menú:");
		System.out.println("1.- Raíz");
		System.out.println("2.- Potencia");
		System.out.println("3.- Módulo");
		
		System.out.println("Introduzca la opción: ");
		opcion = sc.nextInt();
		
		System.out.println("Introduzca el primer número: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		num2 = sc.nextInt();
		
		switch(opcion) {
		case 1:
			System.out.println("La raíz vale: " + Math.pow(num1, 1f/num2));
			break;
		case 2:
			System.out.println("La potencia vale: " + Math.pow(num1, num2));
			break;
		case 3:
			System.out.println("El modulo vale: " + num1%num2 );
			break;
		}
	}
}
