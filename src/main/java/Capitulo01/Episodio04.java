package Capitulo01;

import java.util.Scanner;

public class Episodio04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca un numero entero:");
		int nEntero = sc.nextInt();
		
		System.out.println("Introduzca un numero flotante:");
		float nFloat = sc.nextFloat();
		
		System.out.println("Introduzca un numero doble:");
		double nDoble = sc.nextDouble();
		
		double media = (nEntero + nFloat + nDoble)/3;
		System.out.println("La media de los tres numeros es → " + media);
	}

}
