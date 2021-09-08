package ejercicios3;

import java.util.Scanner;

public class Ej_5 {

	public static void main(String[] args) {
		// 5. Realice un diagrama de flujo que represente el algoritmo para determinar
		// si una matriz es de tipo diagonal: es una matriz cuadrada
		// en la cual todos sus elementos son cero, excepto los electos de la diagonal
		// principal.

		Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese cantidad de filas y columnas: "); //deben ser iguales para ser matriz diagonal
        int filasColumnas = lector.nextInt();
        int matriz[][] = new int[filasColumnas][filasColumnas];
        String mensaje = "Es una matriz diagonal";
        outerloop:  //no entendi bien que es esto 
        for (int i = 0; i < filasColumnas; i++) {
            for (int j = 0; j < filasColumnas; j++) {
                System.out.printf("Ingrese el valor en (%d, %d): ", i, j);
                matriz[i][j] = lector.nextInt();
                if (i != j && matriz[i][j] != 0 || i == j && matriz[i][j] == 0) {
                    mensaje = "No es una matriz diagonal";
                    break outerloop; //cuando se ingresa un valor incorrecto frena el for y no continua pidiendo ingresar valores
                    }
            }
        }
        System.out.println("Resultado: " + mensaje);
    }
}
	
