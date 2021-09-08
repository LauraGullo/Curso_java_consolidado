Algoritmo Ej3_6
	//6. Realice y represente mediante diagrama de flujo y pseudocódigo un algoritmo que lea los nombres y las edades de diez alumnos, y 
	//que los datos se almacenen en dos vectores, y con base en esto se determine el nombre del alumno con la edad mayor del arreglo.

	definir mayorEdad, posicion Como Entero
	dimension nombres[10];
	Dimension  edades[10];
	mayoredad=0;
	
	para i=0 hasta 9
		Escribir "Ingrese nombre y edad del alumno " i+1  ": ";
		leer nombres[i], edades[i];
	finpara
	
	para i=0 hasta 9
		si edades[i] > mayoredad
			mayoredad = edades[i];
			
			posicion = i;
		FinSi
    finpara
	
	
	Escribir  "El alumno de mayor edad es "  nombres[posicion] ": " mayoredad
	
	
	
FinAlgoritmo
	
