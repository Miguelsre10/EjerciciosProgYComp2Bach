package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio01_Minerales;

public class Oro extends Mineral{
	private int brillo;

	public Oro() {
		super();
	}

	public Oro(float dureza, String color, int brillo) {
		super(dureza, color);
		this.brillo = brillo;
	}

	public int getBrillo() {
		return brillo;
	}

	public void setBrillo(int brillo) {
		this.brillo = brillo;
	}
	
	
	
	
	
}
