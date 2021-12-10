package Capitulo05_Arrays_bloque03_AlgoritmosDeOrdenacion;

public class Ejercicio02_OrdenacionPorSeleccion {

	public static void main(String[] args) {
		int pos, menor;
		int array[] = new int[150];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 1000 );
		}
		
		
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			pos = i;
			menor = array[i];
			
			
			for (int j = i ; j < array.length; j++) { 
				if (array[j] < array[i] ) {
					menor = array[j];
					pos = j;
				}
				
			}
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
