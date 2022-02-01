package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02_ArticulosSupermercado;

public class articuloComestible extends Articulo{
	
	protected String caducidad;

	public articuloComestible() {
		super();
	}
	
	
	public articuloComestible(String nombre, int codigo, float precio, String caducidad) {
		super(nombre, codigo, precio);
		this.caducidad = caducidad;
	}



	public String getCaducidad() {
		return caducidad;
	}
	public void setCaducidad(String caducidad) {
		this.caducidad = caducidad;
	}

	@Override
	public String toString() {
		return "ArticuloComestible [caducidad=" + caducidad + "]";
	}
	
	

}
