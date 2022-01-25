package Capitulo04_OrientacionAObjetos.bloque00.Ejemplo02_Animales;

public class Animal {
	
	protected String colorPelo;
	protected int numeroPatas;
	
	
	public Animal() {
		super();
	}
	
	public Animal(String colorPelo, int numeroPatas) {
		super();
		this.colorPelo = colorPelo;
		this.numeroPatas = numeroPatas;
	}
	
	public String getColorPelo() {
		return colorPelo;
	}
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}
	public int getNumeroPatas() {
		return numeroPatas;
	}
	public void setNumeroPatas(int numeroPatas) {
		this.numeroPatas = numeroPatas;
	}
	@Override
	public String toString() {
		return "Animal [colorPelo=" + colorPelo + ", numeroPatas=" + numeroPatas + "]";
	}
	

}
