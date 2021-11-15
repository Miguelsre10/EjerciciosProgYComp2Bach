package Capitulo03_Bucles_bloque02;

import java.util.Scanner;

public class Ejercicio01_MediaCantidadNumerosIntroducidosUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeros, num, suma= 0, media;
		
		System.out.println("¿Cuantos numeros desa introducir?");
		numeros = sc.nextInt();
		for (int i = 0; i < numeros; i++) {
			System.out.println("intoduzca un numero");
			num = sc.nextInt();
			suma = suma + num ;
			
		}
		media = suma/numeros;
		System.out.println("La media de los numeros introducidos es: "+ media);
	}

}
