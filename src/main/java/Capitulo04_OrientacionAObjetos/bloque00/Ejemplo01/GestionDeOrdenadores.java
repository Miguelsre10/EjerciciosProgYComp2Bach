package Capitulo04_OrientacionAObjetos.bloque00.Ejemplo01;

import javax.swing.ImageIcon;

public class GestionDeOrdenadores {

	public static void main(String[] args) {
		Ordenador prueba1 = new Ordenador();
		prueba1.setAlturaCm(4);
		prueba1.setAnchuraCm(35);
		prueba1.setColor("blanco");
		prueba1.setEsPortatil(true);
		prueba1.setMarca("HP");
		System.out.println(prueba1.toString());
		
		Ordenador prueba2 = new Ordenador();
		prueba2.setAlturaCm(3);
		prueba2.setAnchuraCm(30);
		prueba2.setColor("negro");
		prueba2.setEsPortatil(true);
		prueba2.setMarca("Asus");
		System.out.println(prueba2.toString());
		
	}

}
