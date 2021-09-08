Algoritmo Ejer2_15
	//El banco "Pueblo desconocido" ha decidido aumentar el l�mite de cr�dito de las
	//tarjetas de cr�dito de sus clientes, para esto considera que si su cliente tiene tarjeta
	//		tipo 1, el aumento ser� de 25 %; si tiene tipo 2, ser� de 35 %; si tiene tipo 3, de 40 %, y
	//				para cualquier otro tipo, de 50 %. Ahora bien, si la persona cuenta con m�s de una
	//						tarjeta, s�lo se considera la de tipo mayor o la que el cliente indique. Realice un
	//						algoritmo y represente su diagrama de flujo y el pseudoc�digo para determinar el nuevo
	//								l�mite de cr�dito que tendr� una persona en su tarjeta.

	Definir limiteActual, nuevoLimite, Aumento Como Real 
	Definir tipoTarjeta Como Entero
				
	Escribir "Ingrese el l�mite actual de la tarjeta"
	leer limiteActual
	Escribir "Ingrese tipo de tarjeta"
	Leer tipoTarjeta
	Segun tipoTarjeta Hacer
		1:
			Aumento=0.25*limiteActual
		2:
			Aumento=0.35*limiteActual
		3:
			Aumento=0.40*limiteActual
		De Otro Modo:
			Aumento=0.5*limiteActual
	Fin Segun
	
	nuevoLimite=limiteActual+Aumento
	Escribir "El nuevo l�mite de la tarjeta es: " nuevoLimite
FinAlgoritmo
