package Capitulo02_bloque02;

import java.util.Scanner;

public class c02_b2_Ejercicio02_CalculadoraAvanzada {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion, num1, num2;
		
		System.out.println("Menú:");
		System.out.println("1.- Raíz");
		System.out.println("2.- Potencia");
		System.out.println("3.- Módulo");
		
		System.out.println("\n\tIntroduzca la opción: ");
		opcion = sc.nextInt();
		

		
		switch(opcion) {
		case 1:		//Raíz
			
			System.out.println("Introduzca el radicando: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca el indice: ");
			num2 = sc.nextInt();
			
			System.out.println("La raíz vale: " + Math.pow(num1, 1f/num2));
			
			break;
			
		case 2:		//Potencia
			System.out.println("Introduzca la base: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca el exponente: ");
			num2 = sc.nextInt();
			
			System.out.println("La potencia vale: " + Math.pow(num1, num2));
			
			break;
			
		case 3:		//Módulo de la divion entera
			
			System.out.println("Introduzca el divdendo: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca el divisor: ");
			num2 = sc.nextInt();
			
			System.out.println("El modulo vale: " + num1%num2 );
			
			break;
			
		default:
			System.out.println("La opcion introducida no es valida");
		}
	}
}
