package Capitulo05_Arrays_bloque03_AlgoritmosDeOrdenacion;

public class Ejercicio02_OrdenacionPorSeleccion {

	public static void main(String[] args) {
		int aux, aux2;
		int array[] = new int[10];
		boolean cambios = false;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 20 );
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		do {
			for (int i = 0; i < array.length; i++) {
				aux = i;
				aux2 = i;
				for (int j = i+1 ; j < array.length; j++) { 
					if (array[j] < array[i] ) {
						aux2 = j;
						aux = j;
						cambios = true;	
					}
					else {
						cambios=false;
					}
					
				}
				array[aux2]=array[i];
				array[i]=array[aux];
			}
		}
		while(cambios = true);
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		
	}
}
