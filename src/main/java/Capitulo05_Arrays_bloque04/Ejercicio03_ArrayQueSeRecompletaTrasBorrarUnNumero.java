package Capitulo05_Arrays_bloque04;

import java.util.Scanner;

public class Ejercicio03_ArrayQueSeRecompletaTrasBorrarUnNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		int array[] = new int [10];
		
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100 );
		}
		
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		System.out.println("Introduce la posicion del array que desea eliminar");
		num = sc.nextInt();
		
		for (int i = num; i < array.length-1; i++) {
			array[i] = array[i+1];
		}
		array[array.length-1] = (int) Math.round(Math.random() * 100);
		
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
