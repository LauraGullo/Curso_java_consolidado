package ejercicios3;

public class Ej6 {

	public static void main(String[] args) {
		/*
		 * Se requiere determinar cuántos ceros se encuentran en un arreglo de cuatro
		 * renglones y cuatro columnas, las cuales almacenan valores comprendidos entre
		 * 0 y 9.
		 */

		int contador = 0, valores[][] = new int[4][4];

		valores[0][0] = 0;
		valores[0][1] = 2;
		valores[0][2] = 3;
		valores[0][3] = 4;
		valores[1][0] = 1;
		valores[1][1] = 2;
		valores[1][2] = 3;
		valores[1][3] = 4;
		valores[2][0] = 1;
		valores[2][1] = 0;
		valores[2][2] = 0;
		valores[2][3] = 4;
		valores[3][0] = 0;
		valores[3][1] = 2;
		valores[3][2] = 3;
		valores[3][3] = 4;

		for (int i = 0; i < valores.length; i++) {
			for (int e = 0; e < valores[0].length; e++) {
				if (valores[i][e] == 0) {
					contador++;
				}
			}
		}
		System.out.print("La cantidad de 0 en el arreglo es: " + contador);
	}
}
