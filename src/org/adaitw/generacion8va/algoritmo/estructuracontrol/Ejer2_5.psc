Algoritmo Ejer2_5
	//Se requiere determinar cuál de tres cantidades proporcionadas es la mayor.
	//Realizar su respectivo algoritmo y representarlo mediante un diagrama de flujo y
	//	pseudocódigo.

	Definir valor1, valor2, valor3, valorMayor Como real
			
	Escribir "Ingrese el primer valor"
	leer valor1
	Escribir "Ingrese el segundo valor"
	leer valor2
	Escribir "Ingrese el tercer valor"
	leer valor3
	Si valor1>valor2 Y valor1>valor3 Entonces
			valorMayor=valor1
	SiNo
		Si valor2>valor3 Entonces
			valorMayor=valor2
		SiNo
			valorMayor=valor3
		Fin Si
	Fin Si
	
	Escribir "El mayor valor es: " valorMayor
		
FinAlgoritmo
