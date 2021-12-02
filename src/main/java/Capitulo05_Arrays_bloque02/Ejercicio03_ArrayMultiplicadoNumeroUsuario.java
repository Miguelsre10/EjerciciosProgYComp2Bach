package Capitulo05_Arrays_bloque02;

import java.util.Scanner;

public class Ejercicio03_ArrayMultiplicadoNumeroUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int array[]= new int[150];
		int mult;
		System.out.println("Introduce el numero por el que quieres multiplicar el array: ");
		mult = sc.nextInt();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)Math.round(Math.random()*100) ;
			System.out.print(array[i] +" ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			array[i] = array[i] * mult;
			System.out.print(array[i] +" ");
		}
		
		
	}

}
