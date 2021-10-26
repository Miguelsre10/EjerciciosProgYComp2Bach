package Capitulo01;

import java.util.Scanner;

public class Ejercicio02_CalculoCuotaMensualPrestamo {

	public static void main(String[] args) {
		int meses;
		float capital, euribor;
		float diferencial, Auxiliar;
		float interesAnual, interesMensual, cuotaMensual;		

		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Introduzca el capital: ");
		capital = sc.nextFloat();
		System.out.println("El capital es: "+ capital);
		
		System.out.println("Introduzca el numero de meses: ");
		meses = sc.nextInt();
		System.out.println("El numero de meses es: ");
		
		System.out.println("Introduzca el euribor: ");
		euribor = sc.nextFloat();
		System.out.println("El euribor es: "+ euribor);
		
		System.out.println("Introduzca el diferencial: ");
		diferencial = sc.nextFloat();
		System.out.println("El diferencial es: "+ diferencial );
		
		
// comenzamos los calculos		
		
		interesAnual = euribor + diferencial ;
		interesMensual = interesAnual / 12 /100;
		Auxiliar =(float) Math.pow(1 + interesMensual, meses);
		cuotaMensual = capital * (interesMensual*Auxiliar) / (Auxiliar - 1);
		System.out.println("debes pagar " + cuotaMensual + "euros al mes");
		
		
	}

}
