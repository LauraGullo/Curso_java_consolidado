Algoritmo Ejer17
	//Realice el diagrama de flujo y pseudoc�digo que representen el algoritmo para
	//determinar el promedio que obtendr� un alumno considerando que realiza tres
	//ex�menes, de los cuales el primero y el segundo tienen una ponderaci�n de 25%,
//mientras que el tercero de 50%.

	Definir promedio, primerExamen, segundoExamen, tercerExamen Como real
	
	Escribir "Ingrese el resultado del primer examen"
	leer primerExamen
	Escribir "Ingrese el resultado del segundo examen"
	leer segundoExamen
	Escribir "Ingrese el resultado del tercer examen"
	leer tercerExamen
	promedio=primerExamen*0.25+segundoExamen*0.25+tercerExamen*0.5
	//Otra forma de hacerlo: promedio<-(((primerExamen+segundoExamen)/2)+tercerExamen)/2
	Escribir "El promedio es de: " promedio
	
	
FinAlgoritmo
