Algoritmo Ejer16
	//El secretario de educación ha decidido otorgar un bono por desempeño a todos los
//profesores con base en la puntuación siguiente:
//	Puntos Premio
//	0 - 100 1 salario
//	101 - 150 2 salarios mínimos
//	151 - en adelante 3 salarios mínimos
//	Realice un algoritmo que permita determine el monto de bono que percibirá un profesor
//		(debe capturar el valor del salario mínimo y los puntos del profesor).
	Definir puntos Como entero
	Definir salario Como real
									
	Escribir "Ingrese el salario mínimo"
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