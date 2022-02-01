package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio05_Muebles;

public class Armario extends Mueble{
	protected int numPuertas;

	public Armario() {
		super();
	}

	public Armario(String mueble, String tipoMadera, int numPuertas) {
		super(mueble, tipoMadera);
		this.numPuertas = numPuertas;
	}

	public int getNumPuertas() {
		return numPuertas;
	}
	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Armario [mueble=" + mueble + ", tipoMadera=" + tipoMadera + ", numPuertas=" + numPuertas + "]";
	}
	
	

}
