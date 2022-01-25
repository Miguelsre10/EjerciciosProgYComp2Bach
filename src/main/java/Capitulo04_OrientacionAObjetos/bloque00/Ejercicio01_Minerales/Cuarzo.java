package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01_Minerales;

public class Cuarzo extends Mineral{
	private int cristalizacion;

	public Cuarzo() {
		super();
	}

	public Cuarzo(float dureza, String color, int cristalizacion) {
		super(dureza, color);
		this.cristalizacion = cristalizacion;
	}

	public int getCristalizacion() {
		return cristalizacion;
	}

	public void setCristalizacion(int cristalizacion) {
		this.cristalizacion = cristalizacion;
	}
	
	
	
	
	
	
}
