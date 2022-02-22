package Capitulo04_OrientacionAObjetos.bloque00.ejemplo06_primeraVentana;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas{
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.BLACK);
		g.fillRect(100, 150, 100, 75);
		
		g.setColor(Color.decode("#5f2df7"));
		g.fillOval(350, 400, 100, 100);
		
		g.setColor(Color.red);
		int x[] =new int[] {200,300,400};
		int y[] =new int[] {200,300,400};
	}
}
