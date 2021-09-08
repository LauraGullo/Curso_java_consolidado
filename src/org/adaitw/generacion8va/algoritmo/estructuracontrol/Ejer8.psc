Algoritmo Ejer8
	//Cierta empresa proporciona un bono mensual a sus trabajadores, el cual puede ser por
	//su antigüedad o bien por el monto de su sueldo (el que sea mayor), de la siguiente
//forma:
//	Cuando la antigüedad es mayor a 2 años pero menor a 5, se otorga 20 % de su sueldo;
//	cuando es de 5 años o más, 30 %. Ahora bien, el bono por concepto de sueldo, si éste es
//		menor a $1000, se da 25 % de éste, cuando éste es mayor a $1000, pero menor o igual a
//		$3500, se otorga 15% de su sueldo, para más de $3500. 10%. Realice el algoritmo
//				correspondiente para calcular los dos tipos de bono, asignando el mayor y represéntelo
//					con un diagrama de flujo y pseudocódigo
	Definir bonoAntiguedad, bonoSueldo, antiguedad, sueldo Como real
						
	Escribir "Ingrese su antiguedad en años"
	leer antiguedad
	escribir "Ingrese su sueldo"
	leer sueldo
	Si antiguedad>=5 Entonces
		bonoAntiguedad=sueldo*0.3
			
	SiNo
		Si antiguedad>2 Entonces
			bonoAntiguedad=sueldo*0.20
		SiNo
			bonoAntiguedad=0
		Fin Si
		
	Fin Si
	si sueldo<1000 entonces
		bonoSueldo=sueldo*0.25
	SiNo
		Si sueldo<3500 Entonces
			bonoSueldo=0.15*sueldo
		SiNo
			bonoSueldo=0.1*sueldo
		Fin Si
	FinSi
	Si bonoAntiguedad>bonoSueldo Entonces
		Escribir "El bono correspondiente es: " bonoAntiguedad 
	SiNo
		Escribir "El bono correspondiente es: " bonoSueldo
	Fin Si
	
	
FinAlgoritmo
