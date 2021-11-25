package Capitulo03_Bucles_bloque03;

import java.util.Scanner;

public class Ejercicio02_NumeroDePositivosYDeNegativosHastaCero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=1, mayor=0, menor=0;
				
		for (int i = 0; num != 0 ; i++) {
			
			System.out.println("intoduzca un numero");
			num = sc.nextInt();
			
			if(i == 0) {
				mayor = num;
				menor = mayor;
			}
			else {
				if (num> mayor){
					mayor = num;
				}
				if (num<menor) {
					menor = num ;
				}
			}
		}
		System.out.println("El numero mayor de los introducidos es: "+ mayor);
		System.out.println("El numero menor de los introducidos es: "+ menor);
		}
	}



