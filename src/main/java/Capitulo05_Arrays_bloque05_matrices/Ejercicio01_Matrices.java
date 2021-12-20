package Capitulo05_Arrays_bloque05_matrices;

public class Ejercicio01_Matrices {

	public static void main(String[] args) {
		int matriz[][] = new int[][] {  { 3, 5, 6, 8, 9 },
										{10, 13, 16, 18, 19}, 
										{21, 24, 26, 27, 29}, 
										{31, 33, 35, 38, 39}, 
										{42, 43, 44, 47, 49} };
										
										
			
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
		}
	}
	
	
	/**
	 * 
	 * @param matriz
	 * @return
	 */
	
	public static boolean esMatrizPositiva(int matriz[][]) {
		boolean resultado = true;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					resultado = false;
				}
			}
		}
		return resultado;
	}
	
	
	
}
