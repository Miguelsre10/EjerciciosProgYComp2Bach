package Capitulo03_Bucles_bloque04;

public class Ejercicio03_TablasMultiplicarHasta15 {
	
	public static void main(String[] args) {
		
		int num = 0 , multiplicador = 0;
		
		do {
			num++;
			multiplicador = 0;
			while (multiplicador<10) {
				multiplicador++;
				System.out.println(num + " * " + multiplicador + " = "+ (num*multiplicador));
			}

		}
		while(num<15);
		
	}

}
