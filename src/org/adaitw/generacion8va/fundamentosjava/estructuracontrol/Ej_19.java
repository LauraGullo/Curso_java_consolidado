package ejercicios2;

import java.util.Scanner;

public class Ej_19 {

	public static void main(String[] args) {
		/*
		 * La secretaria de salud requiere un diagrama de flujo que le represente el
		 * algoritmo que permita determinar qué tipo de vacuna (A, B o C) debe aplicar a
		 * una persona, considerando que si es mayor de 70 años, sin importar el sexo,
		 * se le aplica la tipo C; si tiene entre 16 y 69 años, y es mujer, se le aplica
		 * la B, y si es hombre, la A; si es menor de 16 años, se le aplica la tipo A,
		 * sin importar el sexo
		 */
		int edad;
		String sexo, vacuna;

		System.out.println("Ingrese su edad");
		Scanner lector = new Scanner(System.in);
		edad = lector.nextInt();
		System.out.println("Ingrese sexo F o M");
		sexo = lector.next();
		while (!sexo.equals("f") && !sexo.equals("m")) {
			System.out.println("Valor incorrecto. Ingrese valor nuevamente");
			sexo = lector.next();
		}
		if (edad >= 70) {
			vacuna = "C";
		} else if (edad >= 16 && sexo.equals("f")) {
			vacuna = "B";
		} else {
			vacuna = "A";
		}
		System.out.print("La vacuna que debe aplicar es " + vacuna);
	}
}
