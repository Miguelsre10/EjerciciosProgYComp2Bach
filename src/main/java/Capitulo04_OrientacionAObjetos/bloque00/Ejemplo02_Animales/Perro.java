package Capitulo04_OrientacionAObjetos.bloque00.Ejemplo02_Animales;

public class Perro extends Animal{
	
	private int alturaOrejasCm;
	
	
	public Perro() {
		super();
	}
	
	
	public Perro(String colorPelo, int numeroPatas, int alturaOrejasCm) {
		super(colorPelo, numeroPatas);
		this.alturaOrejasCm = alturaOrejasCm;
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
