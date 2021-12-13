package Capitulo05_Arrays_bloque04;

public class Ejercicio02_ArrayConMediaDeDosArrays {

	public static void main(String[] args) {
		int array1[] = new int [5];
		int array2[] = new int [5];
		int array3[] = new int [5];
		
		
		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) Math.round(Math.random() * 100 );
		}
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) Math.round(Math.random() * 100 );
		}
		
		
		System.out.print("Array1: ");
		for (int i = 0; i < array1.length; i++) {
			System.out.print(array1[i] + " ");
		}
		System.out.println();
		
		System.out.print("Array2: ");
		for (int i = 0; i < array2.length; i++) {
			System.out.print(array2[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array3.length; i++) {
			array3[i] = (array1[i]+array2[i])/2;
		}
		
		System.out.print("Array2: ");
		for (int i = 0; i < array3.length; i++) {
			System.out.print(array3[i] + " ");
		}
		
		
	}

}
