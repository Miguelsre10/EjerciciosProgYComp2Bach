package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02_ArticulosSupermercado;

public class Articulo {
	
	protected String nombre;
	protected String codigo;
	protected float precio;
	
	public Articulo() {
		super();
	}

	public Articulo(String nombre, String codigo, float precio) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Articulos [nombre=" + nombre + ", codigo=" + codigo + ", precio=" + precio + "]";
	}
	
	
	
	
	
	

}
