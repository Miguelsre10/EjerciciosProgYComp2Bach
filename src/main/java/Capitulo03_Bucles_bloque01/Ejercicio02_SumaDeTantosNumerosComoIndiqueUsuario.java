package Capitulo03_Bucles_bloque01;

import java.util.Scanner;

public class Ejercicio02_SumaDeTantosNumerosComoIndiqueUsuario {

	public static void main(String[] args) {
		int suma = 0 , num, rep ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca cuantos numeros desea incorporar a la suma");
		rep = sc.nextInt();
		
		for (int i = 0; i < rep ;i++) {
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();
			if(num > 10) {
				suma = suma + num;
			}
		}
		System.out.println("La suma de los mayores de 10 es: "+ suma);
				
	}

}
