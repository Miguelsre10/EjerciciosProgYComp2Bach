package Capitulo03_Bucles_bloque02;

import java.util.Scanner;

public class Ejercicio04_MultiplosDeUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int limite, num, resultado = 0;
		
		System.out.println("Introduzca un limite");
		limite = sc.nextInt();
		System.out.println("intoduzca un numero");
		num = sc.nextInt();
		
		for (int i = 1; resultado < limite; i++) {
			resultado = num * i;
			System.out.println("El "+ resultado + " es el el multiplo "+ i + " del " + num);
		}
	}

}