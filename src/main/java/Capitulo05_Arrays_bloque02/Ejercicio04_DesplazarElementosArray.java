package Capitulo05_Arrays_bloque02;

public class Ejercicio04_DesplazarElementosArray {

	public static void main(String[] args) {
		int array[] = new int[] {1,2,3,4,5};
		int aux = array[array.length-1];
		
		for (int i = 0; i < array.length ; i++) {
			System.out.print(array[i]+ " ");
		}
		
		for (int i = array.length - 2; i >= 0; i--) {
			array[i+1]=array[i];
		}
		array[0] = aux;
		
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
