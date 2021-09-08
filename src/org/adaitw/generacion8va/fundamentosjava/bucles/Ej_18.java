package ejercicios3;

public class Ej_18 {

	public static void main(String[] args) {

		//18. Realice un algoritmo que lea una matriz de C columnas y R renglones. A partir de ella genere dos vectores que contengan la suma de sus
		//renglones y la suma de sus columnas. Represéntelo mediante diagrama, y pseudocódigo.
		
		int sumaRenglones[]=new int[2], sumaColumnas[]=new int[8] , matrizA[][]=new int[2][8], i, j;
		
		matrizA[0][0] = 16;
		matrizA[0][1] = 7;
		matrizA[0][2] = 8;
		matrizA[0][3] = 7;
		matrizA[0][4] = 8;
		matrizA[0][5] = 6;
		matrizA[0][6] = 7;
		matrizA[0][7] = 8;

		matrizA[1][0] = 6;
		matrizA[1][1] = 9;
		matrizA[1][2] = 7;
		matrizA[1][3] = 7;
		matrizA[1][4] = 8;
		matrizA[1][5] = 6;
		matrizA[1][6] = 7;
		matrizA[1][7] = 8;

		for (i = 0; i < matrizA.length; i++) {
			for (j = 0; j < matrizA[0].length; j++) {
				sumaRenglones[i] += matrizA[i][j];
			}
			System.out.println("Suma renglón ["+i+"]: " + sumaRenglones[i]);
		}
		System.out.println(" ");
		
		for (j = 0; j < matrizA[0].length; j++) { // columnas
			for (i = 0; i < matrizA.length; i++) { // renglones
				sumaColumnas[j] += matrizA[i][j];
			}
			System.out.println("Suma columna ["+j+"]: " + sumaColumnas[j]);
		}
	}
}
