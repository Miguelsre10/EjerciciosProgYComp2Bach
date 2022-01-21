package Capitulo04_OrientacionAObjetos.bloque00.Ejemplo02_Animales;

public class Perro {
	
	private String colorPelo;
	private int numeroPatas;
	private int alturaOrejasCm;
	
	
	public Perro() {
		super();
	}
	
	
	public Perro(String colorPelo, int numeroPatas, int alturaOrejasCm) {
		super();
		this.colorPelo = colorPelo;
		this.numeroPatas = numeroPatas;
		this.alturaOrejasCm = alturaOrejasCm;
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
	public int getAlturaOrejasCm() {
		return alturaOrejasCm;
	}
	public void setAlturaOrejasCm(int alturaOrejasCm) {
		this.alturaOrejasCm = alturaOrejasCm;
	}


	@Override
	public String toString() {
		return "Perro [colorPelo=" + colorPelo + ", numeroPatas=" + numeroPatas + ", alturaOrejasCm=" + alturaOrejasCm
				+ "]";
	}
	
	
	

}
