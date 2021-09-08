Algoritmo Ejer4
	//El dueño de un estacionamiento requiere un diagrama de flujo con el algoritmo que le
	//permita determinar cuánto debe cobrar por el uso del estacionamiento a sus clientes.
//Las tarifas que se tienen son las siguientes:
	//a. Las dos primeras horas a $5.00 c/u.
	//b. Las siguientes tres a $4.00 c/u.
	//c. Las cinco siguientes a $3.00 c/u.
	//d. Después de diez horas el costo por cada una es de dos pesos.
	Definir costo, horas Como real
				
	Escribir "Ingrese la cantidad de horas de uso del estacionamiento"
	leer horas
	
	Si horas<=2 Entonces
		costo=5*horas
	SiNo
		Si horas<=5 Entonces
			costo=(horas-2)*4+10
		SiNo
			Si horas<=10 Entonces
				costo=(horas-5)*3+22
			SiNo
				costo=(horas-10)*2+37
			Fin Si
		Fin Si
	Fin Si
	Escribir "El costo por el estacionamiento es: " costo
	
FinAlgoritmo
