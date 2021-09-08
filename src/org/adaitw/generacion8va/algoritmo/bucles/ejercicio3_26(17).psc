Algoritmo Ej3_26_17
	//17. Se tiene un arreglo de seis filas y ocho columnas y se sabe que se tiene un elemento negativo. Realice un algoritmo que indique la 
	//posición que ese elemento ocupa en el arreglo (en la fila y la columna en la que se encuentra ese elemento). 
	
	Definir temporalI, temporalE Como Entero
	temporalE=0
	temporalI=0
	
	Dimension matriz(6,8)
	matriz[0,0] = 2
	matriz[0,1] = 7
	matriz[0,2] = 8
	matriz[0,3] = 7
	matriz[0,4] = 2
	matriz[0,5] = 7
	matriz[0,6] = 8
	matriz[0,7] = 7
	
	matriz[1,0] = 1
	matriz[1,1] = 0
	matriz[1,2] = 8
	matriz[1,3] = 7
	matriz[1,4] = 2
	matriz[1,5] = 7
	matriz[1,6] = 8
	matriz[1,7] = 7
	
	matriz[2,0] = 1
	matriz[2,1] = -7
	matriz[2,2] = 2
	matriz[2,3] = 7
	matriz[2,4] = 1
	matriz[2,5] = 7
	matriz[2,6] = 2
	matriz[2,7] = 7
	
	matriz[3,0] = 1
	matriz[3,1] = 7
	matriz[3,2] = 8
	matriz[3,3] = 2
	matriz[3,4] = 1
	matriz[3,5] = 7
	matriz[3,6] = 8
	matriz[3,7] = 2
	
	matriz[4,0] = 1
	matriz[4,1] = 7
	matriz[4,2] = 8
	matriz[4,3] = 2
	matriz[4,4] = 1
	matriz[4,5] = 7
	matriz[4,6] = 8
	matriz[4,7] = 2
	
	matriz[5,0] = 1
	matriz[5,1] = 7
	matriz[5,2] = 8
	matriz[5,3] = 2
	matriz[5,4] = 1
	matriz[5,5] = 7
	matriz[5,6] = 8
	matriz[5,7] = 2
		
	para i=0 hasta 5
		para e=0 hasta 7
			si matriz(i,e) <0
				temporalI=i
				temporalE=e
			FinSi
		FinPara
	FinPara
	
	Escribir "La posición del elemento negativo en la matriz es: (" temporalI "," temporalE ")"
	
	
FinAlgoritmo
