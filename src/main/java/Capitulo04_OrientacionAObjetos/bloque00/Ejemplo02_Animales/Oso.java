package Capitulo04_OrientacionAObjetos.bloque00.Ejemplo02_Animales;

public class Oso extends Animal{
	
	private int numeroGarras;
	
	
	public Oso() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Oso(String colorPelo, int numeroPatas, int numeroGarras) {
		super(colorPelo, numeroPatas);
		this.numeroGarras = numeroGarras;
	}



	public int getNumeroGarras() {
		return numeroGarras;
	}

	public void setNumeroGarras(int numeroGarras) {
		this.numeroGarras = numeroGarras;
	}


	@Override
	public String toString() {
		return "Oso [colorPelo=" + colorPelo + ", numeroPatas=" + numeroPatas + ", numeroGarras=" + numeroGarras + "]";
	}
	
	
	
}
