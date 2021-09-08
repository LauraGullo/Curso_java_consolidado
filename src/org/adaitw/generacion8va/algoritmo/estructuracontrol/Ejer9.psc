Algoritmo Ejer9
	//Una compañía de seguros para autos ofrece dos tipos de póliza: cobertura amplia (A) y
	//daños a terceros (B). Para el plan A, la cuota base es de $1,200, y para el B, de $950. A
	//ambos planes se les carga 10% del costo si la persona que conduce tiene por hábito
	//beber alcohol, 5% si utiliza lentes, 5% si padece alguna enfermedad ?como de- ficiencia
	//cardiaca o diabetes?, y si tiene más de 40 años, se le carga 20%, de lo contrario sólo
	//10%. Todos estos cargos se realizan sobre el costo base. Realice diagrama de flujo que
	//represente el algoritmo para determinar cuánto le cuesta a una persona contratar una
     //póliza.
	Definir cargoXBeber, cargoXEdad, cargoXEnfermedad, cargoXLentes, costoPoliza, poliza, edad, cuotaBase, bebe, lentes, enfermedad Como Entero
	
							
	Escribir "Ingrese su la póliza que desea contratar: 1_Cobertura amplia o 2_Daños a terceros"
	Repetir
		leer poliza
		Si poliza<1 o poliza>2 Entonces
			Escribir "valor incorrecto. Ingrese valor nuevamente"
		FinSi
	Hasta Que poliza=1 o poliza=2
		
	escribir "Ingrese su edad"
	leer edad
	
	escribir "Responda 1_si o 2_no según corresponda:"
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
	
	Escribir "El costo de la póliza es: " costoPoliza
	
	
	
FinAlgoritmo