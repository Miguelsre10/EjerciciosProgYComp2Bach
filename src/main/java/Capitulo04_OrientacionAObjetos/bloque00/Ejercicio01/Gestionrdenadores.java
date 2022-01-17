package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01;

import javax.swing.ImageIcon;

public class Gestionrdenadores {

	public static void main(String[] args) {
		Ordenador prueba1 = new Ordenador(35, 4, "blanco", true, "HP");
		prueba1.imprimePropiedades();
		
		Ordenador prueba2 = new Ordenador(20, 40, "negro", false, "persoalizado");
		prueba2.imprimePropiedades();
		
	}

}
