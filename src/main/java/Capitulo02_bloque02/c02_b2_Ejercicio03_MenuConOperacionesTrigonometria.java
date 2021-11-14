package Capitulo02_bloque02;

import java.util.Scanner;

public class c02_b2_Ejercicio03_MenuConOperacionesTrigonometria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion, num1, num2;
		
		System.out.println("Menú:");
		System.out.println("1.- Cálculo de la hipotenusa de un triángulo");
		System.out.println("2.- Cálculo del área de un circulo");
		System.out.println("3.- Cálculo del perímetro de una circunferencia");
		System.out.println("4.- Cálculo del área de un rectángulo");
		System.out.println("5.- Cálculo del área de un triángulo");
		System.out.println("0.- Salir de la aplicación");		
		opcion = sc.nextInt();
		
		switch (opcion) {
		
		case 0:
			System.out.println("Calculadora desactivada, reinicie la calculadora si desea volver a usarla ");
			break;
			
		case 1:
			System.out.println("Introduzca la longitud del cateto 1: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca la longitud del cateto 2: ");
			num2 = sc.nextInt();
			System.out.println("La hipotenusa mide:" + (Math.hypot(num1, num2)));
			break;
			
		case 2:
			System.out.println("Introduzca la longitud del radio");
			num1 = sc.nextInt();
			System.out.println("El area del circulo es: "+ ((num1*num1)* (Math.PI)));
			break;
		case 3:
			
			System.out.println("Introduzca la longitud del radio");
			num1 = sc.nextInt();
			System.out.println("El perimetro de la circunferencia es: "+ (2*(Math.PI)*num1));
			break;
			
		case 4: 
			System.out.println("Introduzca la longitud de la base: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca la altura: ");
			num2 = sc.nextInt();
			System.out.println("El área del rectangulo es:" + (num1*num2));
			break;
			
		case 5:
			System.out.println("Introduzca la longitud de la base: ");
			num1 = sc.nextInt();
			System.out.println("Introduzca la altura: ");
			num2 = sc.nextInt();
			System.out.println("El área del triángulo es:" + ((num1*num2)/2));
			break;
			
		default:
			System.out.println("La opcion introducida no es valida, reinicie la calculadora");
			
		}
	}
}

