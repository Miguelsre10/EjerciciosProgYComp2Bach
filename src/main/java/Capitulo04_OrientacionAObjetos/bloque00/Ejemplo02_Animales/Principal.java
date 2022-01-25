package Capitulo04_OrientacionAObjetos.bloque00.Ejemplo02_Animales;

public class Principal {

	public static void main(String[] args) {
		
		Perro perro1 = new Perro();
		perro1.setColorPelo("negro");
		perro1.setNumeroPatas(4);
		perro1.setAlturaOrejasCm(5);
		System.out.println(perro1.toString());
		
		Perro perro2 = new Perro("blanco", 4, 9);
		System.out.println(perro2.toString());
		
		Mono Cesar = new Mono("marrón", 2, 100);
		System.out.println(Cesar.toString());
		
		Oso yogui = new Oso();
		yogui.setColorPelo("marrón");
		yogui.setNumeroPatas(4);
		System.out.println(yogui.toString());
		
		
		
		
	}

}
