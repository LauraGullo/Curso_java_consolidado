Algoritmo Ejercicio3_3
	//Se tienen los nombres de los N alumnos de una escuela, además de su promedio general. Realice un algoritmo para capturar esta 
	//información, la cual se debe almacenar en arreglos, un vector para el nombre y otro para el promedio, después de capturar la 
	//información se debe ordenar con base en su promedio, de mayor a menor, los nombres deben corresponder con los promedios. 
	//Realice el algoritmo y represéntelo mediante el diagrama de flujo y el pseudocódigo.
	
	definir temporalNombres Como Caracter
	Definir temporalPromedios Como Real

		Escribir "¿Cuantos nombres desea ingresar?";
		Leer cantidadAlumnos;
		Dimension nombres(cantidadAlumnos), promedios(cantidadAlumnos)
			Para i<-0 hasta cantidadAlumnos-1 Hacer
				Escribir "Escriba el nombre del alumno " i+1 " y su respectivo promedio";
				Leer nombres(i), promedios(i);
			finpara	
			
			para i = 0 Hasta cantidadAlumnos-1 Con Paso 1 Hacer
				para j = i+1 Hasta cantidadAlumnos-1 Con Paso 1 Hacer
					si promedios(j) > promedios(i) Entonces
						temporalPromedios = promedios(i)
						promedios(i) = promedios(j)
						promedios(j) = temporalPromedios
						temporalNombres=nombres(j)
						nombres(i)=nombres(j)
						nombres(j)=temporalNombres
						finsi
					FinPara
				fin para
						
		para i=0 hasta cantidadAlumnos-1 Con Paso 1 hacer
			Escribir  nombres(i) ":" promedios(i);
		fin para	
FinAlgoritmo
