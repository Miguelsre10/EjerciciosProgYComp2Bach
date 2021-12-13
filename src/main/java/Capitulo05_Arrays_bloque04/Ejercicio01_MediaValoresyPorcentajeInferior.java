package Capitulo05_Arrays_bloque04;

public class Ejercicio01_MediaValoresyPorcentajeInferior {

	public static void main(String[] args) {
		int array[] = new int[150];
		int menores= 0;
		float media, suma = 0;
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100 );
		}
		
		System.out.print("Array: ");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		media = suma /array.length ;
		System.out.println("La media de los valores del array es: " + media);
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] < media) {
				menores++;
			}
		}
		System.out.println("El el porcentaje de numeros menores a la media es: " + (((float)menores/array.length)*100) + "%");
	}

}
