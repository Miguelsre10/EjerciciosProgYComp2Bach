package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02_ArticulosSupermercado;

import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		do {
			opcion = menu();
			switch(opcion){
				case 1:
					articuloComestible articuloComestible = new articuloComestible();
					System.out.println("Introduzca el codigo del articulo:");
					//articuloComestible.setCodigo(sc.nextInt());
					System.out.println("Introduzca");
					
					break;
				case 2:
					
					break;
					
			}
		}
		while(opcion != 0);
		
		
		
	}
	
	public static int menu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("0. Salir");
		System.out.println("1. Crear articulo comestible");
		System.out.println("2. Crear articulo de limpieza");
		int opcion = sc.nextInt();
		return opcion;
	}
	
}
