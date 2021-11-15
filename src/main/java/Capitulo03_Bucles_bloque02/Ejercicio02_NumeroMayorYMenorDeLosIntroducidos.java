package Capitulo03_Bucles_bloque02;

import java.util.Scanner;

public class Ejercicio02_NumeroMayorYMenorDeLosIntroducidos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numeros, num, mayor = 0, menor = 0 ;
		
		System.out.println("¿Cuantos numeros desea introducir?");
		numeros = sc.nextInt();
		
		for (int i = 0; i < numeros; i++) {
			System.out.println("intoduzca un numero");
			num = sc.nextInt();
			if (num> mayor){
				mayor = num;
			}
			if (num<menor)
				menor = num ;
		}
		System.out.println("El numero mayor de los introducidos es: "+ mayor);
		System.out.println("El numero menor de los introducidos es: "+ menor);
	}

}
