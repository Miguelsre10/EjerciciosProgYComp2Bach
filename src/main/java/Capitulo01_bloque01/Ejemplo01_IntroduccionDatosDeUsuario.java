package Capitulo01_bloque01;

import java.util.Scanner;

public class Ejemplo01_IntroduccionDatosDeUsuario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Porfavor, introduzca un numero:");
		int num = sc.nextInt();
		System.out.println("El numero introducido es: " + num);
		
		System.out.println("Introduzca un numero flotante:");
		float num2 = sc.nextFloat();
		System.out.println("El numero flotante introducido es:" + num2 );
		
		System.out.println("Por favor introduzca un String: ");
		String srt = sc.next();
		System.out.println("EL string intrducido es: "+ srt);
	}

}
