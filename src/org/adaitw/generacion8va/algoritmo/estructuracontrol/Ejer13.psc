Algoritmo Ejer13
	//Los alumnos de una escuela desean realizar un viaje de estudios, pero requieren
	//determinar cuánto les costará el pasaje, considerando que las tarifas del autobús son
//las siguientes: si son más de 100 alumnos, el costo es de $20; si son entre 50 y 100,
		//	$35; entre 20 y 49, $40, y si son menos de 20 alumnos, $70 por cada uno. Realice el
		//		algoritmo para determinar el costo del pasaje de cada alumno.
	Definir alumnos Como entero
								
	Escribir "Ingrese las cantidad de alumnos"
	leer alumnos
	
	si alumnos >100 Entonces
		costo=20	
	SiNo
		Si alumnos>=50 Entonces
			costo=35
		SiNo
			Si alumnos>=20 Entonces
				costo=40
			SiNo
				costo=70
			fin si
		Fin Si
	Fin Si
		
	Escribir "El costo del pasaje de cada alumno es: $" costo
		
FinAlgoritmo