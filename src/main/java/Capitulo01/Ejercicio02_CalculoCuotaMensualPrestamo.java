package Capitulo01;

import java.util.Scanner;

public class Ejercicio02_CalculoCuotaMensualPrestamo {

	public static void main(String[] args) {
		int meses;
		float capital, euribor;
		float Diferencial;
		float interesAnual, interesMensual, auxilar, cuotaMensual;
		

		
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Introduzca el capital: ");
		capital = sc.nextFloat();
		System.out.println("El capital es: "+ capital);
		
		System.out.println("Introduzca el euribor: ");
		euribor = sc.nextFloat();
		System.out.println("El euribor es: "+ euribor);
		
		System.out.println("Introduzca el diferencial: ");
		capital = sc.nextFloat();
		System.out.println("El diferencial es: "+ Diferencial );
		
		System.out.println("Introduzca el capital: ");
		meses = sc.nextInt();
		System.out.println("El numero de meses es: ");
		
// comenzamos los calculos		
		
		interesAnual = euribor + Diferencial ;
		interesMensual = interesAnual / 12 /100;
		auxiliar =(float) Math.pow(1 + interesMensual, meses);
		cuotaMensual = (interesMensual*auxiliar) / (auxiliar - 1);
		System.out.println("debes pagar " + cuotaMensual + "euros al mes");
		
		
	}

}
