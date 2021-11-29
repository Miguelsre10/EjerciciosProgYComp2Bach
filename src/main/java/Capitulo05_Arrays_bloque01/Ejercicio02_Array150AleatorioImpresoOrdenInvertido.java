package Capitulo05_Arrays_bloque01;

public class Ejercicio02_Array150AleatorioImpresoOrdenInvertido {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		System.out.print("Orden normal del array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.print("\nOrden invertido del array: ");
		for (int i = (array.length-1); i >= 0 ; i--) {
			System.out.print(array[i] + " ");
		}
	}

}
