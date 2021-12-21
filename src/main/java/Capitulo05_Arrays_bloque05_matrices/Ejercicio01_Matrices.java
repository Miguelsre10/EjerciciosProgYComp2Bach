package Capitulo05_Arrays_bloque05_matrices;

import java.util.Iterator;

public class Ejercicio01_Matrices {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {  { 3, 5, 6, 8, 9 },
										{10, 12, 16, 18, 19}, 
										{21, 22, 25, 26, 28}, 
										{30, 31, 35, 38, 39}, 
										{42, 43, 44, 45, 47} };
		int array[] = new int [ ((matriz.length)-1 ) *   (matriz.length)-1 ];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				array[0]=matriz[i][j];
			}
		}
		mostrarMatriz(matriz);
		//System.out.println(esMatrizPositiva(matriz));
		//System.out.println(esMatrizDiagonal(matriz));
		System.out.println( "La matriz es triangular superior: " + esMatrizTriangularSuperior(matriz));
		
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
	
	public static void convertirMatrizEnArray () {
		
		
	}
	
	
	
	
}
