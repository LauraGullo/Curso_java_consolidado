package ejercicios2;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		/*
		 * El banco "Pueblo desconocido" ha decidido aumentar el l�mite de cr�dito de
		 * las tarjetas de cr�dito de sus clientes, para esto considera que si su
		 * cliente tiene tarjeta tipo 1, el aumento ser� de 25 %; si tiene tipo 2, ser�
		 * de 35 %; si tiene tipo 3, de 40 %, y para cualquier otro tipo, de 50 %. Ahora
		 * bien, si la persona cuenta con m�s de una tarjeta, s�lo se considera la de
		 * tipo mayor o la que el cliente indique. Realice un algoritmo y represente su
		 * diagrama de flujo y el pseudoc�digo para determinar el nuevo l�mite de
		 * cr�dito que tendr� una persona en su tarjeta.
		 */

		double limiteActual, nuevoLimite, aumento;
		int tipoTarjeta;
		System.out.println("Ingrese el l�mite actual de la tarjeta");
		Scanner lector = new Scanner(System.in);
		limiteActual = lector.nextDouble();
		System.out.println("Ingrese tipo de tarjeta");
		tipoTarjeta = lector.nextInt();
		switch (tipoTarjeta) {
		case 1:
			aumento = 0.25 * limiteActual;
			break;
		case 2:
			aumento = 0.35 * limiteActual;
			break;
		case 3:
			aumento = 0.40 * limiteActual;
			break;
		default:
			aumento = 0.5 * limiteActual;
			break;
		}
		nuevoLimite = limiteActual + aumento;
		System.out.print("El nuevo l�mite de la tarjeta es $" + nuevoLimite);
	}
}
