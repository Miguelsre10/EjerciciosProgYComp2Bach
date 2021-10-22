package Capitulo01_bloque01;

import java.util.Scanner;

public class Ejercicio02_CalculoCuotaMensualPrestamo {

	public static void main(String[] args) {
		int meses;
		float capital;
		float diferencial, auxiliar, euribor;
		float interesAnual, interesMensual, cuotaMensual;
		
		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Introduzca el capital: ");
		capital = sc.nextFloat();
		System.out.println("El capital es: "+ capital);
		
		System.out.println("Introduzca el numero de meses: ");
		meses = sc.nextInt();
		System.out.println("El numero de meses es: "+ meses );
		
		System.out.println("Introduzca el diferencial: ");
		diferencial = sc.nextFloat();
		System.out.println("El diferencial es: "+ diferencial );
		
		System.out.println("Introduzca el euribor: ");
		euribor = sc.nextFloat();
		System.out.println("El euribor es: "+ euribor);
		
		
// comenzamos los calculos		
		
		interesAnual = euribor + diferencial ;
		interesMensual = interesAnual / 12 /100;
		auxiliar =(float) Math.pow(1 + interesMensual, meses);
		cuotaMensual = capital * (interesMensual * auxiliar) / (auxiliar - 1);
		System.out.println("debes pagar " + cuotaMensual + "euros al mes");
		
		
	}

}
