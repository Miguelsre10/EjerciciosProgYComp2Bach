package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02_ArticulosSupermercado;

public class articuloLimpieza extends Articulo{
	protected boolean ignifugo;

	public articuloLimpieza() {
		super();
	}
	
	public articuloLimpieza(String nombre, String codigo, float precio, boolean ignifugo) {
		super(nombre, codigo, precio);
		this.ignifugo = ignifugo;
	}

	public boolean isIgnifugo() {
		return ignifugo;
	}
	public void setIgnifugo(boolean ignifugo) {
		this.ignifugo = ignifugo;
	}

	@Override
	public String toString() {
		return "ArticuloLimpieza [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + ", ignifugo="
				+ ignifugo + "]";
	}
	
	
	

}
