package ejercicios3;

public class Ej5 {

	public static void main(String[] args) {
		// Realice un algoritmo que lea un vector de seis elementos e intercambie las
		// posiciones de sus elementos, de tal forma que el primer
		// elemento pase a ser el último y el último el primero, el segundo el penúltimo
		// y así sucesivamente, e imprima ese vector.

		int valores[] = new int[6], j = 0, i, temporal = 0;

		valores[0] = 1;
		valores[1] = 2;
		valores[2] = 3;
		valores[3] = 4;
		valores[4] = 5;
		valores[5] = 6;

		for (i = 0; i < valores.length; i++) {
			temporal = valores[i];
			valores[i] = valores[5 - j];
			valores[5 - j] = temporal;
			j = j + 1;
		}

		for (i = 0; i < valores.length; i++) {
			System.out.println("valores ("+i+"): "+valores[i]);

		}
	}

}
