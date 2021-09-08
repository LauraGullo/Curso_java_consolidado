Algoritmo Ejer19
	//El hotel "Cama Arena" requiere determinar lo que le debe cobrar a un huésped por su
	//estancia en una de sus habitaciones. Realice un diagrama de flujo y pseudocódigo que
	//representen el algoritmo para determinar ese cobro.
	Definir costoHabitacion, costoTotal Como real
	Definir dias Como Entero
	
	Escribir "Ingrese el costo de la habitación por día"
	leer costoHabitacion
	Escribir "Ingrese la cantidad de días de su estancia"
	leer dias
	costoTotal=costoHabitacion*dias
	Escribir "El cobro por la estancia es de: " costoTotal
	
	
FinAlgoritmo
