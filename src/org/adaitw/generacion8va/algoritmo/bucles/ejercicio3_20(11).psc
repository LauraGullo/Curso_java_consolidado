Algoritmo Ej3_20_11
	//11. Se tiene una matriz de 12 filas por 19 columnas y se desea un algoritmo para encontrar todos sus elementos negativos y para que 
	//les cambie ese valor negativo por un cero. Realice un algoritmo para tal fin y repres�ntelo mediante diagrama de flujo y pseudoc�digo.
	
	dimension A(12,19)
	A[0,0] = 1
	A[0,1] = 7
	A[0,2] = 8
	A[0,3] = 7
	A[0,4] = 8
	A[0,5] = 6
	A[0,6] = 7
	A[0,7] = 8
	A[0,8] = 7
	A[0,9] = 8
	A[0,10] = 6
	A[0,11] = 7
	A[0,12] = 8
	A[0,13] = 7
	A[0,14] = 8
	A[0,15] = 6
	A[0,16] = 7
	A[0,17] = 8
	A[0,18] = 7
	
	A[1,0] = 6
	A[1,1] = 1
	A[1,2] = -7
	A[1,3] = 7
	A[1,4] = 8
	A[1,5] = 6
	A[1,6] = 7
	A[1,7] = 8
	A[1,8] = 7
	A[1,9] = 8
	A[1,10] = 16
	A[1,11] = 7
	A[1,12] = -7
	A[1,13] = 7
	A[1,14] = 8
	A[1,15] = 6
	A[1,16] = 7
	A[1,17] = 8
	A[1,18] = 7
	
	A[2,0] = 0
	A[2,1] = -9
	A[2,2] = 1
	A[2,3] = 7
	A[2,4] = 8
	A[2,5] = 6
	A[2,6] = 7
	A[2,7] = 8
	A[2,8] = 7
	A[2,9] = 8
	A[2,10] = 6
	A[2,11] = 7
	A[2,12] = 1
	A[2,13] = 7
	A[2,14] = 8
	A[2,15] = 6
	A[2,16] = 7
	A[2,17] = 8
	A[2,18] = 7
	
	A[3,0] = 0
	A[3,1] = -9
	A[3,2] = -7
	A[3,3] = 1
	A[3,4] = 8
	A[3,5] = 6
	A[3,6] = 7
	A[3,7] = 8
	A[3,8] = 7
	A[3,9] = 8
	A[3,10] = 6
	A[3,11] = 7
	A[3,12] = -7
	A[3,13] = 1
	A[3,14] = 8
	A[3,15] = 6
	A[3,16] = 7
	A[3,17] = 8
	A[3,18] = 7
	
	A[4,0] = 0
	A[4,1] = -19
	A[4,2] = 7
	A[4,3] = 7
	A[4,4] = 1
	A[4,5] = 6
	A[4,6] = 7
	A[4,7] = 8
	A[4,8] = 7
	A[4,9] = 8
	A[4,10] = 6
	A[4,11] = -7
	A[4,12] = 7
	A[4,13] = 7
	A[4,14] = 1
	A[4,15] = 6
	A[4,16] = 7
	A[4,17] = 8
	A[4,18] = 7
		
	A[5,0] = 7
	A[5,1] = 7
	A[5,2] = 8
	A[5,3] = 7
	A[5,4] = 8
	A[5,5] = 1
	A[5,6] = 7
	A[5,7] = 8
	A[5,8] = 7
	A[5,9] = 8
	A[5,10] = 6
	A[5,11] = 7
	A[5,12] = 8
	A[5,13] = 7
	A[5,14] = 8
	A[5,15] = 1
	A[5,16] = 7
	A[5,17] = 8
	A[5,18] = 7
	
	A[6,0] = 6
	A[6,1] = 9
	A[6,2] = -7
	A[6,3] = 7
	A[6,4] = 8
	A[6,5] = 6
	A[6,6] = 1
	A[6,7] = 8
	A[6,8] = 7
	A[6,9] = 8
	A[6,10] = 6
	A[6,11] = 7
	A[6,12] = -7
	A[6,13] = 7
	A[6,14] = 8
	A[6,15] = 6
	A[6,16] = 1
	A[6,17] = 8
	A[6,18] = 7
	
	A[7,0] = 0
	A[7,1] = -9
	A[7,2] = 7
	A[7,3] = 7
	A[7,4] = 8
	A[7,5] = 6
	A[7,6] = 7
	A[7,7] = 1
	A[7,8] = 7
	A[7,9] = 8
	A[7,10] = 6
	A[7,11] = 7
	A[7,12] = 7
	A[7,13] = 7
	A[7,14] = 8
	A[7,15] = 6
	A[7,16] = 7
	A[7,17] = 1
	A[7,18] = 7
		
	A[8,0] = 0
	A[8,1] = -9
	A[8,2] = -7
	A[8,3] = 7
	A[8,4] = 8
	A[8,5] = 6
	A[8,6] = 7
	A[8,7] = 8
	A[8,8] = 1
	A[8,9] = 8
	A[8,10] = 6
	A[8,11] = 7
	A[8,12] = -7
	A[8,13] = 7
	A[8,14] = 8
	A[8,15] = 6
	A[8,16] = 7
	A[8,17] = 8
	A[8,18] = 1
	
	A[9,0] = 0
	A[9,1] = -19
	A[9,2] = 7
	A[9,3] = 7
	A[9,4] = 8
	A[9,5] = 6
	A[9,6] = 7
	A[9,7] = 8
	A[9,8] = 7
	A[9,9] = 1
	A[9,10] = 6
	A[9,11] = 7
	A[9,12] = 7
	A[9,13] = 7
	A[9,14] = 8
	A[9,15] = 6
	A[9,16] = 7
	A[9,17] = 8
	A[9,18] = 7
	
	A[10,0] = 0
	A[10,1] = -19
	A[10,2] = 7
	A[10,3] = 7
	A[10,4] = 8
	A[10,5] = 6
	A[10,6] = 7
	A[10,7] = 8
	A[10,8] = 7
	A[10,9] = 8
	A[10,10] = 1
	A[10,11] = 7
	A[10,12] = 7
	A[10,13] = 7
	A[10,14] = 8
	A[10,15] = 6
	A[10,16] = 7
	A[10,17] = 8
	A[10,18] = 7
	
	A[11,0] = 0
	A[11,1] = -19
	A[11,2] = 7
	A[11,3] = 7
	A[11,4] = -8
	A[11,5] = 6
	A[11,6] = 7
	A[11,7] = -8
	A[11,8] = 7
	A[11,9] = 8
	A[11,10] = 6
	A[11,11] = 1
	A[11,12] = 7
	A[11,13] = 7
	A[11,14] = -8
	A[11,15] = 6
	A[11,16] = 7
	A[11,17] = 8
	A[11,18] = 7
		
	para i=0 hasta 11
		para e=0 hasta 18
			si A(i,e)<=0
				A(i,e)=0
				Escribir "Matriz A(" i "," e "): " A(i,e)
			FinSi
		FinPara
	FinPara
		
FinAlgoritmo