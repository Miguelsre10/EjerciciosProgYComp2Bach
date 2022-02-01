package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio05_Muebles;

public class Silla extends Mueble {
	protected int numPatas;

	public Silla() {
		super();
	}

	public Silla(String mueble, String tipoMadera, int numPatas) {
		super(mueble, tipoMadera);
		this.numPatas = numPatas;
		}

	public int getNumPatas() {
		return numPatas;
	}

	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	@Override
	public String toString() {
		return "Silla [mueble=" + mueble + ", tipoMadera=" + tipoMadera + ", numPatas=" + numPatas + "]";
	}
	
	
	
	
	

}
