package Capitulo04_OrientacionAObjetos.bloque00.Ejemplo02_Animales;

public class Mono extends Animal{
	
	private int alturaCm;
	
	
	public Mono() {
		super();
	}
	
	public Mono(String colorPelo, int numeroPatas, int alturaCm) {
		super(colorPelo, numeroPatas);
		this.alturaCm = alturaCm;
	}
	
	
	public int getAlturaCm() {
		return alturaCm;
	}
	public void setAlturaCm(int alturaCm) {
		this.alturaCm = alturaCm;
	}

	@Override
	public String toString() {
		return "Mono [colorPelo=" + colorPelo + ", numeroPatas=" + numeroPatas + ", alturaCm=" + alturaCm + "]";
	}
	
	
	
	
	
}
