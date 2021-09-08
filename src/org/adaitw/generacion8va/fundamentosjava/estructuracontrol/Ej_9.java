package ejercicios2;

import java.util.Scanner;

public class Ej_9 {

	public static void main(String[] args) {
		/*
		 * Una compa��a de seguros para autos ofrece dos tipos de p�liza: cobertura
		 * amplia (A) y da�os a terceros (B). Para el plan A, la cuota base es de
		 * $1,200, y para el B, de $950. A ambos planes se les carga 10% del costo si la
		 * persona que conduce tiene por h�bito beber alcohol, 5% si utiliza lentes, 5%
		 * si padece alguna enfermedad ?como de- ficiencia cardiaca o diabetes?, y si
		 * tiene m�s de 40 a�os, se le carga 20%, de lo contrario s�lo 10%. Todos estos
		 * cargos se realizan sobre el costo base. Realice diagrama de flujo que
		 * represente el algoritmo para determinar cu�nto le cuesta a una persona
		 * contratar una p�liza.
		 */
		int poliza, cuotaBase, edad;
		double costoPoliza, cargoXBeber, cargoXEdad, cargoXEnfermedad, cargoXLentes;
		String bebe, lentes, enfermedad;

		System.out.println("Ingrese la p�liza que desea contratar: 1_Cobertura amplia o 2_Da�os a terceros");
		Scanner lector = new Scanner(System.in);
		poliza = lector.nextInt();
		
		while (poliza!=1 && poliza!=2) {
			  System.out.println("Valor incorrecto. Ingrese valor nuevamente.");
			  poliza=lector.nextInt();
			 }
		
		System.out.println("Ingrese su edad");
		edad = lector.nextInt();

		System.out.println("Responda SI o NO seg�n corresponda:");
		System.out.println("Bebe alcohol?");
		bebe = lector.next();
		
		 while (!bebe.equals("si") && !bebe.equals("no")) {
		  System.out.println("Respuesta incorrecta. Ingrese la respuesta nuevamente.");
		  bebe=lector.next();
		 }
		 

		System.out.println("Usa lentes?");
		lentes = lector.next();
		
		while (!lentes.equals("si") && !lentes.equals("no")) {
			  System.out.println("Respuesta incorrecta. Ingrese la respuesta nuevamente.");
			  lentes=lector.next();
			 }

		System.out.println("Padece alguna enfermedad?");
		enfermedad = lector.next();
		while (!enfermedad.equals("si") && !enfermedad.equals("no")) {
			  System.out.println("Respuesta incorrecta. Ingrese la respuesta nuevamente.");
			  enfermedad=lector.next();
			 }
	
		if (poliza == 1) {
			cuotaBase = 1200;
		} else {
			cuotaBase = 950;
		}

		if (bebe.equals("si")) {
			cargoXBeber = cuotaBase * 0.1;
		} else {
			cargoXBeber = 0;
		}

		if (edad > 40) {
			cargoXEdad = cuotaBase * 0.2;
		} else {
			cargoXEdad = cuotaBase * 0.1;
		}

		if (lentes.equals("si")) {
			cargoXLentes = cuotaBase * 0.05;
		} else {
			cargoXLentes = 0;
		}

		if (enfermedad.equals("si")) {
			cargoXEnfermedad = cuotaBase * 0.05;
		} else {
			cargoXEnfermedad = 0;
		}

		costoPoliza = cuotaBase + cargoXBeber + cargoXEdad + cargoXEnfermedad + cargoXLentes;

		System.out.print("El costo de la p�liza es $" + costoPoliza);
	}
}
