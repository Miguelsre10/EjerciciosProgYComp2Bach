package Capitulo05_Arrays_bloque03_AlgoritmosDeOrdenacion;

public class Ejercicio02_OrdenacionPorSeleccion_resuelto {

	public static void main(String[] args) {
		int menor, pos;
		
		int array[]= new int[15];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100 );
		}
		
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
		for (int i = 0; i < array.length; i++) {
			menor = array[i];
			pos = i;
			
			for (int j = i; j < array.length; j++) {
				if (array[j] < menor) {
					menor = array[j];
					pos = j;
				}
				
				
			}
			// Al terminar el bucle de la 'j' se que en la variable "pos" esta el menor valor explorado por la variable
			int aux = array[i];
			array[i] = array[pos];
			array[pos]= aux;
			
		}
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}

}
