Algoritmo Ejer9
	//Una compa��a de seguros para autos ofrece dos tipos de p�liza: cobertura amplia (A) y
	//da�os a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
	//ambos planes se les carga 10% del costo si la persona que conduce tiene por h�bito
	//beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad ?como de- ficiencia
	//cardiaca o diabetes?, y si tiene m�s de 40 a�os, se le carga 20%, de lo contrario s�lo
	//10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
	//represente el algoritmo para determinar cu�nto le cuesta a una persona contratar una
     //p�liza.
	Definir cargoXBeber, cargoXEdad, cargoXEnfermedad, cargoXLentes, costoPoliza, poliza, edad, cuotaBase, bebe, lentes, enfermedad Como Entero
	
							
	Escribir "Ingrese su la p�liza que desea contratar: 1_Cobertura amplia o 2_Da�os a terceros"
	Repetir
		leer poliza
		Si poliza<1 o poliza>2 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que poliza=1 o poliza=2
		
	escribir "Ingrese su edad"
	leer edad
	
	escribir "Responda 1_si o 2_no seg�n corresponda:"
	Escribir "Bebe alcohol?"
	Repetir
		leer bebe
		Si bebe<1 o bebe>2 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que bebe=1 o bebe=2
	
	Escribir "Usa lentes?"
	Repetir
		leer lentes
		Si lentes<1 o lentes>2 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que lentes=1 o lentes=2
	Escribir "Padece alguna enfermedad?"
	Repetir
		leer enfermedad
		Si enfermedad<1 o enfermedad>2 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que enfermedad=1 o enfermedad=2
	Si poliza=1 Entonces
		cuotaBase=1200
		SiNo
		cuotaBase=950	
	Fin Si
	Si bebe=1 Entonces
		cargoXBeber=cuotaBase*0.1
	SiNo
		cargoXBeber=0
	Fin Si
	Si edad>40 Entonces
		cargoXEdad=cuotaBase*0.2
	SiNo
		cargoXEdad=cuotaBase*0.1
	Fin Si
	Si lentes=1 Entonces
		cargoXlentes=cuotaBase*0.05
	SiNo
		cargoXLentes=0
	Fin Si
	Si enfermedad=1 Entonces
		cargoXEnfermedad=cuotaBase*0.05
	SiNo
		cargoXEnfermedad=0
	Fin Si
	
	costoPoliza=cuotaBase+cargoXBeber+cargoXEdad+cargoXEnfermedad+cargoXLentes	
	
	Escribir "El costo de la p�liza es: " costoPoliza
	
	
	
FinAlgoritmo