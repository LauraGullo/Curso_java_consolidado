Algoritmo Ejer2
	//Realice un algoritmo para determinar el sueldo semanal de un trabajador con base en
	//las horas trabajadas y el pago por hora, considerando que después de las 40 horas cada
	//hora se considera como excedente y se paga el doble
	Definir sueldoSemanal, pagoHora, horas Como real
				
	Escribir "Ingrese el pago por hora "
	leer pagoHora
	Escribir "Ingrese la cantidad de horas trabajadas"
	leer horas
	Si horas<=40 Entonces
		sueldoSemanal=horas*pagoHora
	SiNo
		sueldoSemanal=((horas-40)*(pagoHora*2))+(40*pagoHora)
	Fin Si
	Escribir "El sueldo semanal es de: " sueldoSemanal
	
FinAlgoritmo
