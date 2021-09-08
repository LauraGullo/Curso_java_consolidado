Algoritmo Ejer13
	//Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para
	//determinar cuánto dinero ahorra una persona en un año si considera que cada semana
	//	ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el
	//	sueldo).

	Definir ahorroSemanal, ahorroAnual, sueldoSemanal Como real
	
	Escribir "Ingrese el sueldo semanal"
	leer sueldoSemanal
	ahorroSemanal<-sueldoSemanal*0.15
	ahorroAnual<-(ahorroSemanal*4)*12
	
	Escribir "El ahorro total del año es de: " ahorroAnual
	
FinAlgoritmo
