package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio03_Muebles;

public class Mueble {
	protected String mueble;
	protected String tipoMadera;
	
	public Mueble() {
		super();
	}

	public Mueble(String mueble, String tipoMadera) {
		super();
		this.mueble = mueble;
		this.tipoMadera = tipoMadera;
	}

	public String getMueble() {
		return mueble;
	}
	public void setMueble(String mueble) {
		this.mueble = mueble;
	}

	public String getTipoMadera() {
		return tipoMadera;
	}
	public void setTipoMadera(String tipoMadera) {
		this.tipoMadera = tipoMadera;
	}

	
	@Override
	public String toString() {
		return "Mueble [mueble=" + mueble + ", tipoMadera=" + tipoMadera + "]";
	}
	
	
	
}
