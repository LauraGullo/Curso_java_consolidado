Algoritmo Ej3_24_15
	//15. Realice un algoritmo que calcule el producto de dos vectores. Uno de ellos es de una fila con diez elementos y el otro con una columna 
	//de diez elementos. Represéntelo mediante diagrama y pseudocódigo.

	Dimension vectorFila(10)
	Dimension vectorColumna(10)
	Dimension producto(10)
	
	vectorColumna[0] = 2
	vectorColumna[1] = 7
	vectorColumna[2] = 8
	vectorColumna[3] = 7
	vectorColumna[4] = 1
	vectorColumna[5] = 0
	vectorColumna[6] = 8
	vectorColumna[7] = 7
	vectorColumna[8] = 1
	vectorColumna[9] = 1
	
	vectorFila[0] = 2
	vectorFila[1] = 7
	vectorFila[2] = 8
	vectorFila[3] = 7
	vectorFila[4] = 1
	vectorFila[5] = 0
	vectorFila[6] = 8
	vectorFila[7] = 7
	vectorFila[8] = 1
	vectorFila[9] = 1
	
	para i=0 hasta 9
		producto(i)=vectorColumna(i)*vectorFila(i)
		Escribir "Producto (" i "): " producto(i)
	FinPara
	
	
FinAlgoritmo
