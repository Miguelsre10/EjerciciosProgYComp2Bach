package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01;

public class Ordenador {
	int alturaCm;
	int anchuraCm;
	String color;
	boolean esPortatil;
	String marca;
	

	public Ordenador(int newAlturaCm, int newAnchuraCm, String newColor, boolean newEsPortatil, String newMarca) {
		alturaCm = newAlturaCm;
		anchuraCm = newAnchuraCm;
		color = newColor;
		esPortatil = newEsPortatil;
		marca = newMarca;
		System.out.println("Se acaba de construir un objeto");
		
	}

	public void imprimePropiedades() {
		System.out.println("Las propiedades del ordenador son alturaCm: " + alturaCm + ", anchuraCm: " + anchuraCm + 
				", color: " + color + ", esPortatil: " + esPortatil + ", marca: "+ marca);
	}
}