package ejercicios3;

public class Ej_19 {

	public static void main(String[] args) {

		//19. Realice un algoritmo que calcule el valor que se obtiene al multiplicar entre sí los elementos de la diagonal principal de una matriz
		//de 5 por 5 elementos, represéntelo mediante diagrama y pseudocódigo.
		
		int matrizA[][]=new int [5][5],i,j, producto=1;
				
		matrizA[0][0] = 16;
		matrizA[0][1] = 7;
		matrizA[0][2] = 8;
		matrizA[0][3] = 7;
		matrizA[0][4] = 8;
		
		matrizA[1][0] = 6;
		matrizA[1][1] = 9;
		matrizA[1][2] = 7;
		matrizA[1][3] = 7;
		matrizA[1][4] = 8;
		
		matrizA[2][0] = 0;
		matrizA[2][1] = 9;
		matrizA[2][2] = 7;
		matrizA[2][3] = 7;
		matrizA[2][4] = 8;
		
		matrizA[3][0] = 6;
		matrizA[3][1] = 9;
		matrizA[3][2] = 7;
		matrizA[3][3] = 7;
		matrizA[3][4] = 8;
		
		matrizA[4][0] = 6;
		matrizA[4][1] = 9;
		matrizA[4][2] = 7;
		matrizA[4][3] = 7;
		matrizA[4][4] = 8;
		
		for( i=0; i<matrizA.length; i++) {  
				producto*=matrizA[i][i]; 
		}
	
		System.out.print( "El resultado de la multiplicación de los elementos de la diagonal principal es: "+ producto);
	}
}
