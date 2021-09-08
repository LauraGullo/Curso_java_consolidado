Algoritmo Ej3_23_14
	//14. Realice un algoritmo que lea una matriz de N filas y M columnas y que cuente los elementos negativos que contiene, 
	//así como también cuántos elementos de la diagonal principal son igual a cero. Represéntelo mediante diagrama de flujo y pseudocódigo.
	Definir contadorNegativos, contadorCeros Como Entero
	contadorCeros=0
	contadorNegativos=0
		
	dimension matriz(4,4) 
	matriz[0,0] = 2
	matriz[0,1] = 7
	matriz[0,2] = 8
	matriz[0,3] = 7
	
	matriz[1,0] = 1
	matriz[1,1] = 0
	matriz[1,2] = 8
	matriz[1,3] = 7
	
	matriz[2,0] = 1
	matriz[2,1] = 7
	matriz[2,2] =0
	matriz[2,3] = -7
	
	matriz[3,0] = 1
	matriz[3,1] = -7
	matriz[3,2] = -8
	matriz[3,3] = 0
	
	para i=0 hasta 3 
		para e=0 hasta 3
			si matriz(i,e)<0
				contadorNegativos=contadorNegativos+1
			FinSi
			si i=e
				si matriz(i,i)=0
					contadorCeros=contadorCeros+1
				FinSi
			fin si	
		FinPara
	FinPara
	
	
		
	Escribir "La cantidad de elementos negativos en la matriz es: " contadorNegativos
	Escribir "La cantidad de ceros en la diagonal principal de la matriz es: " contadorCeros  
	
FinAlgoritmo
