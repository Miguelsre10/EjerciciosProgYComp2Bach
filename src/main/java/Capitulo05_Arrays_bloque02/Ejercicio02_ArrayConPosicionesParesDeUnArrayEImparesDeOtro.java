package Capitulo05_Arrays_bloque02;

import java.lang.reflect.Array;

public class Ejercicio02_ArrayConPosicionesParesDeUnArrayEImparesDeOtro {

	public static void main(String[] args) {
		int array[] = new int[150];
		int array2[] = new int[150];
		int array3[] = new int[150];
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) Math.round(Math.random() * 100);
			array2[i] = (int) Math.round(Math.random() * 100);
		}
		
		
        for (int i = 0; i < array.length; i++) {
        	System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
        	System.out.print(array2[i] + " ");
        }
                
        
        for (int i = 0; i < array3.length; i++) {

          if (i % 2 != 0) {
        	  array3[i] = array[i];
          }
          if(i % 2 == 0) {
         	  array3[i] = array2[i];
          }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
        	System.out.print( array3[i] + " ");
        }
	}

}
