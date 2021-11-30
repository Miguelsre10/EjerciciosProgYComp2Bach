package Capitulo05_Arrays_bloque01;

public class Ejercicio01_SumaMediaMayorMenorEnArrayDe150NumerosAleatorios {

	public static void main(String[] args) {
		int array[] = new int[150];
		int suma = 0, mayor = 0,menor = 0;
		float media = 0;
	
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		//suma
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		//media
		media = ((float)suma / array.length );
		//mayor y menor
		for (int i = 0; i < array.length; i++) {
			if (i == 0) {
				mayor = array[i];
				menor = array[i];
			}
			else {
				if (array[i] > mayor) {
					mayor = array[i];
				}	
				if (array[i] < menor) {
					menor = array[i];
				}
			}
			
		}
		
		System.out.println("n/La suma de todos los numeros es : " + suma);
		System.out.println("La media de los numeros es : " + media);
		System.out.println("El numero mayor es : " + mayor);
		System.out.println("El numero menor es : " + menor);
	}

}
