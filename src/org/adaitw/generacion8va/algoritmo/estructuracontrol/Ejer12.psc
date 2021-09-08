Algoritmo Ejer12
	//Realice un algoritmo que permita determinar el sueldo semanal de un trabajador con
	//base en las horas trabajadas y el pago por hora, considerando que a partir de la hora
	//número 41 y hasta la 45, cada hora se le paga el doble, de la hora 46 a la 50, el triple, y
	//que trabajar más de 50 horas no está permitido
	Definir horas, pagoXHora, sueldo  Como real
								
	Escribir "Ingrese las horas trabajadas en la semana"
	leer horas
	
	si horas >50 Entonces
		escribir "No esta permitido trabajar mas de 50 horas" 
	SiNo
		Escribir "Ingrese el pago por hora"
		leer pagoXHora
		sueldo=pagoXHora*horas
		Si horas<41 Entonces
			sueldo=sueldo
		SiNo
			Si horas<=45 Entonces
				sueldo=sueldo+((horas-41)*pagoXHora*2)
			SiNo
				sueldo=sueldo+((horas-45)*pagoXHora*3)
			fin si
		Fin Si
	Fin Si
		
	Escribir "El sueldo semanal es: $" sueldo
		
FinAlgoritmo