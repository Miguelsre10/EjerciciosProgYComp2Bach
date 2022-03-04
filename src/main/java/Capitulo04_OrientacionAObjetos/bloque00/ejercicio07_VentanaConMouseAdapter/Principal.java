package Capitulo04_OrientacionAObjetos.bloque00.ejercicio07_VentanaConMouseAdapter;

import javax.swing.JFrame;

public class Principal {

	public static void main(String[] args) {
		JFrame ventana = new JFrame();
		
		MiMouseAdapter adapter = new MiMouseAdapter();
		ventana.addMouseListener(adapter);
		ventana.addMouseMotionListener(adapter);
		
		ventana.setBounds(0, 0, 800, 600);
		ventana.setVisible(true);

	}

}
