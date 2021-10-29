package Capitulo02_bloque02;

import java.util.Scanner;

public class c02_b2_Ejercicio04 {

	public static void main(String[] args) {
		int precio, pago, v, r, nM;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduzca el preico total de la compra: ");
		precio = sc.nextInt();
		System.out.println("Introduzca la cantidad de de dinero con la que se ha efectuado el pago: ");
		pago = sc.nextInt();
		v = pago - precio ;
		System.out.println("Se debera devolver: "+ v);
		System.out.println("Se deberan devolver:");
		r = v%100;
		nM = v/100;
		System.out.println(nM + " monedas de 100");
		nM = r/50;
		r = r%50;
		System.out.println(nM + " monedas de 50");
		nM = r/25;
		r = r%25;
		System.out.println(nM + " monedas de 25");
		nM = r/5;
		r = r%5;
		System.out.println(nM + " monedas de 5");
		nM = r/1;
		r = r%1;
		System.out.println(nM + " monedas de 1");
		
		
	}

}
