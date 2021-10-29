package Capitulo02_bloque01;

import java.util.Scanner;

public class c02_Ejercicio02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		System.out.println("Introduzca el primer numero: ");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo numero: ");
		num2 = sc.nextInt();
		
		if(num1<num2) {
			System.out.println("El numero menor es el: "+ num1);
		}
		else {
			System.out.println("El numero menor es el: "+ num2);
		}

	}

}
