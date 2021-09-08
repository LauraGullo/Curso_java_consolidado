Algoritmo EJ3_27_18
	//18. Realice un algoritmo que lea una matriz de C columnas y R renglones. A partir de ella genere dos vectores que contengan la suma de sus
	//renglones y la suma de sus columnas. Represéntelo mediante diagrama, y pseudocódigo.
	
	definir sumaRenglones, sumaColumnas Como Entero
	
	dimension matriz(4,4) 
	matriz[0,0] = 2
	matriz[0,1] = 7
	matriz[0,2] = 8
	matriz[0,3] = 7
	
	matriz[1,0] = 2
	matriz[1,1] = 7
	matriz[1,2] = 8
	matriz[1,3] = 7
	
	matriz[2,0] = 2
	matriz[2,1] = 7
	matriz[2,2] = 8
	matriz[2,3] = 7
	
	matriz[3,0] = 2
	matriz[3,1] = 7
	matriz[3,2] = 8
	matriz[3,3] = 9
	
	para i=0 hasta 3 //renglones
		sumaRenglones=0
		para j=0 hasta 3 //columnas
			sumaRenglones=sumaRenglones+matriz(i,j)
		FinPara
		Escribir "Suma renglón " i+1 ": " sumaRenglones
	FinPara
	Escribir ""
	para i=0 hasta 3 //columnas
		sumaColumnas=0
		para j=0 hasta 3 //renglones
			sumaColumnas=sumaColumnas+matriz(j,i)
		FinPara
		Escribir "Suma columna " i+1 ": " sumaColumnas
	FinPara
	
FinAlgoritmo
