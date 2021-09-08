Algoritmo Ejer19
	//La secretaria de salud requiere un diagrama de flujo que le represente el algoritmo que
	//permita determinar qué tipo de vacuna (A, B o C) debe aplicar a una persona,
	//considerando que si es mayor de 70 años, sin importar el sexo, se le aplica la tipo C; si
	//	tiene entre 16 y 69 años, y es mujer, se le aplica la B, y si es hombre, la A; si es menor de
	//	16 años, se le aplica la tipo A, sin importar el sexo
	Definir edad Como real
	definir sexo Como Entero
	definir  vacuna Como Caracter
	
	Escribir "Ingrese su edad"
	leer edad
	Escribir "Ingrese sexo: 1_Femenino o 2_Masculino" 
	
	Repetir
		leer sexo
		si sexo<1 o sexo>2
			escribir "Valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que sexo=1 o sexo=2
	
				 
	si edad>=70 Entonces
		vacuna="C" 
	SiNo
		Si edad>=16 y sexo=1 Entonces
			vacuna="B"
		SiNo
			vacuna="A"
		Fin Si
	Fin Si
			
	Escribir "La vacuna que debe aplicar es: " vacuna
		
FinAlgoritmo