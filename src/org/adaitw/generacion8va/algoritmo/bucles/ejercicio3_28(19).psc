Algoritmo Ej3_28_19
	
	//19. Realice un algoritmo que calcule el valor que se obtiene al multiplicar entre sí los elementos de la diagonal principal de una matriz
	//de 5 por 5 elementos, represéntelo mediante diagrama y pseudocódigo.
	
	Definir producto Como entero
	
	Dimension matriz(5,5)
	matriz[0,0] = 19
	matriz[0,1] = 7
	matriz[0,2] = 8
	matriz[0,3] = 7
	matriz[0,4] = 7
		
	matriz[1,0] = 2
	matriz[1,1] = 4
	matriz[1,2] = 8
	matriz[1,3] = 7
	matriz[1,4] = 7
	
	matriz[2,0] = 2
	matriz[2,1] = 7
	matriz[2,2] = 4
	matriz[2,3] = 7
	matriz[2,4] = 7
	
	matriz[3,0] = 2
	matriz[3,1] = 7
	matriz[3,2] = 8
	matriz[3,3] = 1
	matriz[3,4] = 7
	
	matriz[4,0] = 2
	matriz[4,1] = 7
	matriz[4,2] = 8
	matriz[4,3] = 9
	matriz[4,4] = 3
	
	producto=1
	
	para i=0 hasta 4 //no me queda claro porque solo pasa por i y no por e 
		producto=producto*matriz(i,i) 
	finPara
	
	
	Escribir "El resultado de la multiplicación de los elementos de la diagonal principal es: " producto
	
FinAlgoritmo
