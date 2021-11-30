package Capitulo05_Arrays_bloque02;

public class Ejercicio01_ArrayAzarNumerosEntre100yMenos100CambiarSignoNumerosPares {

	public static void main(String[] args) {
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 200 + (-100) );
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			if (array[i]%2 == 0 ) {
				array[i]= -array[i];
			}
			System.out.print(array[i] + " ");
		}
	}

}
