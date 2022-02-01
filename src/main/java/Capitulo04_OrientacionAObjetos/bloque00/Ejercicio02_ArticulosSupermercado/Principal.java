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
					articuloComestible.setCodigo(sc.nextInt());
					System.out.println("Introduzca el nombre del articulo: ");
					articuloComestible.setNombre(sc.next());
					System.out.println("Introduzca el precio del articulo: ");
					articuloComestible.setPrecio(sc.nextFloat());
					System.out.println("Indtroduzca la fecha de caducidad del articulo: ");
					articuloComestible.setCaducidad(sc.next());
					System.out.println("Artículo comestible creado " + articuloComestible.toString());
					break;
				case 2:
					articuloLimpieza articuloLimpieza = new articuloLimpieza();
					System.out.println("Introduzca el codigo del articulo:");
					articuloLimpieza.setCodigo(sc.nextInt());
					System.out.println("Introduzca el nombre del articulo: ");
					articuloLimpieza.setNombre(sc.next());
					System.out.println("Introduzca el precio del articulo: ");
					articuloLimpieza.setPrecio(sc.nextFloat());
					System.out.println("Indique si el articulo es ignifugo: ");
					articuloLimpieza.setIgnifugo(sc.nextBoolean());
					System.out.println("Artículo Limpieza creado " + articuloLimpieza.toString());
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
