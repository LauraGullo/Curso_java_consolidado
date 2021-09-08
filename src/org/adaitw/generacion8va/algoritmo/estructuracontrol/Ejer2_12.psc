Algoritmo Ejer2_12
	//El consultorio del Dr. Lorenzo T. Mata Lozano tiene como política cobrar la
//consulta con base en el número de cita, de la siguiente forma:
//	? Las tres primeras citas a $200.00 c/u.
//	? Las siguientes dos citas a $150.00 c/u.
//	? Las tres siguientes citas a $100.00 c/u.
//	? Las restantes a $50.00 c/u, mientras dure el tratamiento.
//	Se requiere un algoritmo para determinar:
//				a) Cuánto pagará el paciente por la cita.
	//			b) El monto de lo que ha pagado el paciente por el tratamiento.

	Definir costoCita, nCitas, costoTotal Como entero
				
	Escribir "Ingrese la cantidad de citas"
	leer nCitas
	
	Si nCitas<=3 Entonces
		costoTotal=200*nCitas
	SiNo
		Si nCitas<=5 Entonces
			costoTotal=((nCitas-3)*150)+600
		SiNo
			Si nCitas<=8 Entonces
				costoTotal=((nCitas-5)*100)+900
			SiNo
				costoTotal=((nCitas-8)*50)+1200
			Fin Si
		Fin Si
	Fin Si
	
	costoCita=costoTotal/nCitas
	
	Escribir "El costo por cada cita es de: " costoCita	
	Escribir "El costo total es: " costoTotal
FinAlgoritmo
