package Capitulo03_Bucles_bloque01;

import java.util.Scanner;

public class Ejercicio03_ContadorPositivosYNegativosIntroducidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int rep, num,  cPos= 0 , cNeg = 0;
		
		System.out.println("¿Cuantos numeros desea introducir?");
		rep = sc.nextInt();
		
		for (int i = 0; i < rep; i++) {
			System.out.println("Introduzca un numero: ");
			num = sc.nextInt();
			if (num > 0) {
				cPos++;
			}
			if (num < 0) {
				cNeg++;
			}
			
		}
		System.out.println("Positivos: "+ cPos + "  Negativos: " + cNeg );
	}

}
