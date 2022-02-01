package Capitulo04_OrientacionAObjetos.bloque00.Ejercicio02_ArticulosSupermercado;

public class Articulo {
	
	protected String nombre;
	protected int codigo;
	protected float precio;
	
	public Articulo() {
		super();
	}

	public Articulo(String nombre, int codigo, float precio) {
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
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
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
