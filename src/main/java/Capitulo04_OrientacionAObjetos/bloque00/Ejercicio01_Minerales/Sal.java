package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01_Minerales;

public class Sal extends Mineral{
	private float disolucion;

	public Sal() {
		super();
	}

	public Sal(float dureza, String color, float disolucion) {
		super(dureza, color);
		this.disolucion = disolucion;
	}

	public float getDisolucion() {
		return disolucion;
	}

	public void setDisolucion(float disolucion) {
		this.disolucion = disolucion;
	}

	@Override
	public String toString() {
		return "Sal [dureza=" + dureza + ", color=" + color + ", disolucion=" + disolucion + "]";
	}
	
	

	
	
}
