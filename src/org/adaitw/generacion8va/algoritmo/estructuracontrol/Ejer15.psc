Algoritmo Ejer15
	//5. Realice un algoritmo que, con base en un n�mero proporcionado (1-7), indique el d�a de
	//la semana que le corresponde (L-D). 
	Definir num Como entero
	Definir dia Como Caracter
									
	Escribir "Ingrese el n�mero (1-7)"
	
	Repetir
		leer num
		Si num<1 o num>7 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que num>=1 y num<=7
	
	//otra opci�n seria hacerlo con switch (case1-case2-etc.)
	si num=1 Entonces
		dia="Lunes"
	SiNo
		Si num=2 Entonces
			dia="Martes"
		SiNo
			Si num=3 Entonces
				dia="Mi�rcoles"
			SiNo
				Si num=4 Entonces
					dia="Jueves"
				SiNo
					Si num=5 Entonces
						dia="Viernes"
					SiNo
						Si num=6 Entonces
							dia="S�bado"
						SiNo
							dia="Domingo"
						Fin Si
					Fin Si
				Fin Si
			fin si
		Fin Si
	Fin Si
		
	Escribir "El d�a de la semana que le corresponde es: " dia
		
FinAlgoritmo