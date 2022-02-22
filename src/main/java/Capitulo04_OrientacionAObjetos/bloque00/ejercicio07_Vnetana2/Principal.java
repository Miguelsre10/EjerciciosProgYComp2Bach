package Capitulo04_OrientacionAObjetos.bloque00.ejercicio07_Vnetana2;

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
		JFrame ventana = new JFrame();
		ventana.setBounds(0, 0, 800, 600);
		

		ventana.getContentPane().setLayout(new BorderLayout());
		
		MiCanvas canvas = new MiCanvas();
		canvas.setBackground(Color.LIGHT_GRAY);
		ventana.getContentPane().add(canvas, BorderLayout.CENTER);
		

		
		ventana.setVisible(true);
	}

}
