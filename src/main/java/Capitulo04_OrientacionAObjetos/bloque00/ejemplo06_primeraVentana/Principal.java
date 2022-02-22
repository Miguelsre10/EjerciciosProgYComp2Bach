package Capitulo04_OrientacionAObjetos.bloque00.ejemplo06_primeraVentana;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Principal {

	public static void main(String[] args) {
		JFrame ventana = new JFrame("8===D[]C===8");
		ventana.setBounds(0, 0, 800, 600);
		
		//ventana.getContentPane().setBackground(Color.decode("#5f2df7"));
		ventana.getContentPane().setLayout(new BorderLayout());
		
		MiCanvas canvas = new MiCanvas();
		canvas.setBackground(Color.PINK);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		
		//JTextField jtf = new JTextField();
		//jtf.setMinimumSize(new Dimension (100,100));
		//jtf.setPreferredSize(new Dimension (100,100));
		//ventana.getContentPane().add(jtf, BorderLayout.WEST);
		
		JButton jbt = new JButton("Esto es un boton");
		ventana.getContentPane().add(jbt, BorderLayout.NORTH);
		
		JButton jbt2 = new JButton("Esto es un boton");
		ventana.getContentPane().add(jbt2, BorderLayout.EAST);
		
		JCheckBox jcheck = new JCheckBox("Esto es un checkbox");
		ventana.getContentPane().add(jcheck, BorderLayout.SOUTH);
		
		JCheckBox jcheck2 = new JCheckBox("Esto es otro checkbox");
		ventana.getContentPane().add(jcheck2, BorderLayout.WEST);
		
		
		ventana.setVisible(true);
	}

}
