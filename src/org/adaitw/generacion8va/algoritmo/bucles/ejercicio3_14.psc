Algoritmo ej3_14
	//10. Se tienen dos matrices cuadradas (de 12 filas y 12 columnas cada una). Realice un algoritmo que lea los arreglos y que determine si 
	//la diagonal principal de la primera es igual a la diagonal principal de la segunda. (Diagonal principal es donde los subíndices I, J son 
	//iguales). Represente la solución mediante el diagrama de flujo y el pseudocódigo.
	
	definir contador, contador2 Como entero
	contador=0
	contador2=0
	
	Dimension matriz[2,2]
	matriz(0,0)=7
	matriz(0,1)=-5
	matriz(1,0)=-8
	matriz(1,1)=0  
	
	para i=0 hasta 1 Con Paso 1 hacer	
		para e=0 hasta 1 con paso 1 hacer
			Si matriz(i,e)<0 Entonces
				contador=contador+1
				fin si	
				
		fin para
		Si matriz(i,i)=0 Entonces
			contador2=contador2+1
		Fin Si	
	fin para
	
	
	Escribir "La cantidad de elementos negativos es: " contador
	Escribir  "La cantidad de 0 en la diagonal pcipal es: " contador2
 		
FinAlgoritmo
