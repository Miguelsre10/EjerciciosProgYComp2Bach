package Capitulo04_OrientacionAObjetos.bloque00.ejercicio07_Vnetana2;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class MiCanvas extends Canvas{
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		g.setColor(Color.decode("#db1da8"));
		g.fillRect(150, 100, 75, 55);
		g.setColor(Color.cyan);
		g.fillRect(50, 200, 50, 100);
		
		g.setColor(Color.decode("#5f2df7"));
		g.fillOval(450, 400, 100, 100);
		g.setColor(Color.decode("#e04a4b"));
		g.fillOval(300, 400, 85, 120);
		
		g.setColor(Color.BLUE);
		int x[] =new int[] {400,300,210};
		int y[] =new int[] {150,200,70};
		g.fillPolygon(x, y, 3);
		
		g.setColor(Color.GREEN);
		int X[] = new int[] {450,500,600,575 ,460};
		int Y[] = new int[] {100,50,150,250 ,220 };
		g.fillPolygon(X, Y, 5);
	}
}
