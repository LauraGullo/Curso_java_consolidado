Algoritmo Ejer3_12
	//
	
	Definir suma Como Real
	suma=0
	
	Dimension calificaciones[4]
	calificaciones(0) =7
	calificaciones(1)= 7
	calificaciones(2) = 7
	calificaciones(3)=7
	
	para i=0 hasta 3 Con Paso 1 hacer	
		suma=suma+calificaciones(i)
		
						
	fin para
	
	promedio=suma/4
	
	
	para i=0 hasta 3 Con Paso 1 hacer
		Si calificaciones(i)>promedio Entonces
			contador=contador+1
		Fin Si
    FinPara

	
	Escribir "El promedio es: " promedio
	
	escribir "La cantidad de alumnos con una calificación mayor al promedio es: " contador
	
	
	
	
FinAlgoritmo
