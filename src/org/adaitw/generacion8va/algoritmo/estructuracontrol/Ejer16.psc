Algoritmo Ejer16
	//El secretario de educaci�n ha decidido otorgar un bono por desempe�o a todos los
//profesores con base en la puntuaci�n siguiente:
//	Puntos Premio
//	0 - 100 1 salario
//	101 - 150 2 salarios m�nimos
//	151 - en adelante 3 salarios m�nimos
//	Realice un algoritmo que permita determine el monto de bono que percibir� un profesor
//		(debe capturar el valor del salario m�nimo y los puntos del profesor).
	Definir puntos Como entero
	Definir salario Como real
									
	Escribir "Ingrese el salario m�nimo"
	leer salario
	escribir "Ingrese los puntos obtenidos"
	Repetir
		leer puntos
		Si puntos<0  Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que puntos>=0
	
	si puntos<=100 Entonces
		Bono=salario
	SiNo
		Si puntos<=150 Entonces
			bono=salario*2
		SiNo
			bono=salario*3
		Fin Si
	Fin Si
		
	Escribir "El bono que le corresponde por " puntos " puntos es: $" bono
		
FinAlgoritmo