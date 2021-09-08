Algoritmo Ej3_21_12
	//12. Se tiene en un arreglo cien elementos representando calificaciones de los estudiantes de una escuela.
	//Realice un algoritmo que lea el arreglo y calcule la calificación promedio del grupo, además, que cuente los estudiantes que obtuvieron 
	//calificaciones arriba del promedio del grupo. Represéntelo mediante diagrama de flujo y pseudocódigo.
	Definir suma, promedio  Como Real
	Definir arribaDelPromedio Como Entero
	arribaDelPromedio=0
	suma=0
	promedio=0
	
	Dimension calificaciones(10)
	calificaciones[0] = 1
	calificaciones[1] = 7
	calificaciones[2] = 8
	calificaciones[3] = 7
	calificaciones[4] = 8
	calificaciones[5] = 6
	calificaciones[6] = 7
	calificaciones[7] = 8
	calificaciones[8] = 7
	calificaciones[9] = 10
	
	para i=0 hasta 9 Con Paso 1 Hacer
		suma=suma+calificaciones(i)
	FinPara
	
	promedio=suma/10
	
	para i=0 hasta 9 Con Paso 1 Hacer
		si calificaciones(i)>promedio
			arribaDelPromedio=arribaDelPromedio+1
		FinSi
	FinPara
	
	Escribir "El promedio delas calificaciones es: " promedio
	Escribir "La cantidad de estudiantes que obtuvieron calificaciones arriba del promedio es: " arribaDelPromedio
	
FinAlgoritmo
