Algoritmo Ejer2_8
	//El director de una escuela está organizando un viaje de estudios, y requiere
	//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de
//viajes por el servicio. La forma de cobrar es la siguiente: si son 100 alumnos o más, el
	//	costo por cada alumno es de $65.00; de 50 a 99 alumnos, el costo es de $70.00, de 30 a
	//	49, de $95.00, y si son menos de 30, el costo de la renta del autobús es de $4000.00, sin
	//		importar el número de alumnos. Realice un algoritmo que permita determinar el pago a
	//			la compañía de autobuses y lo que debe pagar cada alumno por el viaje (represente en
	//			pseudocódigo y diagrama de flujo)
    Definir costoAlumno Como Real
	Definir alumnos, costoTotal Como Entero
			
	Escribir "Ingrese la cantidad de alumnos"
	leer alumnos
			
	Si alumnos>=100 Entonces
		costoAlumno=65
				
	SiNo
		Si alumnos>=50 Entonces
			costoAlumno=70
			
		SiNo
			Si alumnos>=30 Entonces
				costoAlumno=95
				
			SiNo
				costoAlumno=4000/alumnos
			Fin Si
		Fin Si
	
	Fin Si
	costoTotal=alumnos*costoAlumno
	Escribir "El costo de cada alumno es de: " costoAlumno
	Escribir "El costo total es: " costoTotal
FinAlgoritmo
