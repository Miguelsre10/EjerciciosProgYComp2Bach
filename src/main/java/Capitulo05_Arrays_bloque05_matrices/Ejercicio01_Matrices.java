package Capitulo05_Arrays_bloque05_matrices;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio01_Matrices {

	public static void main(String[] args) {
		int k = 0;
		int array[] = new int[] {} ;
		int matriz[][] = new int[][] {  { 3, 5, 6, 8, 9 },
										{10, 12, 16, 18, 19}, 
										{21, 22, 25, 26, 28}, 
										{30, 31, 35, 38, 39}, 
										{42, 43, 44, 45, 47} };
										
										
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				k++;
			}
		}
		
		
		mostrarMatriz(matriz);
		System.out.println(esMatrizPositiva(matriz));
		System.out.println(esMatrizDiagonal(matriz));
		System.out.println( "La matriz es triangular superior: " + esMatrizTriangularSuperior(matriz));
		//convertirMatrizEnArray(matriz, array, k);
		System.out.println("La matriz es simetrica: " + esMatrizSimetrica(matriz));
		matrizOpuesta(matriz);
		eliminarNumeroMatriz(k, k, matriz);
		
		
	}
	
	
	/**
	 * 
	 * @param matriz
	 */
	
	public static void mostrarMatriz (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	
	public static boolean esMatrizPositiva(int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					return false;
				}
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	
	public static boolean esMatrizDiagonal( int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i != j && matriz[i][j] != 0) {
					return false;
				}
				
			}
		}
		return true;
	}
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	
	
	public static boolean esMatrizTriangularSuperior ( int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j < i && matriz[i][j] != 0) {
					return true;
				}
			}
		}
		return false;
	}
	
	/**
	 * 
	 * @param matriz
	 * @param array
	 * @param k
	 */
	
	public static void convertirMatrizEnArray (int matriz[][], int array[], int k) {
		k = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[k]= matriz[i][j];
				System.out.print(array[k]);
				k++;
			}
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @return
	 */
	
	public static boolean esMatrizSimetrica (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] != matriz [j][i]) {
					return false;
				}
			}
		}
		 return true;
		
	}
	
	/**
	 * 
	 * @param matriz
	 */
	
	public static void matrizOpuesta (int matriz[][]) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j]= -(matriz[i][j]);
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public static void eliminarNumeroMatriz (int fila, int colum, int matriz[][]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Elija la fila de la que desea eliminar un numero:");
		fila = sc.nextInt() - 1;
		System.out.println("Elija la columna de la que desea eliminar un numero:");
		colum = sc.nextInt() - 1;
		matriz[fila][colum] = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}

}
