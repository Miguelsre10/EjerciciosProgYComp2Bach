package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01_Minerales;

public class Mineral {
	protected float dureza;
	protected String color;
	
	public Mineral() {
		super();
	}

	public Mineral(float dureza, String color) {
		super();
		this.dureza = dureza;
		this.color = color;
	}

	
	public float getDureza() {
		return dureza;
	}
	public void setDureza(float dureza) {
		this.dureza = dureza;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	
	
	@Override
	public String toString() {
		return "Mineral [dureza=" + dureza + ", color=" + color + "]";
	}
	
	
	

}
