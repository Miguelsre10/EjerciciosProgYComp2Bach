package Capitulo04_OrientacionAObjetos.bloque00.ejercicio07_VentanaConMouseAdapter;


import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MiMouseAdapter extends MouseAdapter {

	public MiMouseAdapter() {
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Se ha pinchado sobre la ventana");
		super.mouseClicked(e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("El raton se encuentra en la posición: " + e.getX() + ", " + e.getY());
		super.mouseMoved(e);
	}
	
	

}
