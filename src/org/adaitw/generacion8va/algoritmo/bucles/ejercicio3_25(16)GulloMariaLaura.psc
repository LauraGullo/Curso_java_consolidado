Algoritmo Ej3_16GulloMariaLaura 
	//16. Una compañía de transporte cuenta con cinco choferes, de los cuales se conoce: nombre, horas trabajadas cada día de la semana (seis días) y sueldo por hora. Realice un algoritmo que: 
	//		a. Calcule el total de horas trabajadas a la semana para cada trabajador.
	//		b. Calcule el sueldo semanal para cada uno de ellos.
	//		c. Calcule el total que pagará la empresa.
	//		d. Indique el nombre del trabajador que labora más horas el día lunes.
	//		e. Imprima un reporte con todos los datos anteriores.
	definir sueldoXHora, pagoTotal Como Real
	pagoTotal=0
	
	Dimension dias(6)
	dias(0)= "Lunes"
 	dias(1)= "Martes"
	dias(2)="Miércoles"
	dias(3)="Jueves"
	dias(4)="Viernes"
	dias(5)="Sábado"
	
	Escribir "Ingrese el sueldo por hora $"
	leer sueldoXHora
	
	Dimension nombre(5)
	dimension horasTrabajadasDiarias(5,6)
	Dimension horasTrabajadasSemanal(5)
	Dimension sueldoSemanal(5)
	
		Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir "Ingrese el nombre del chofer ", i+1
		Leer nombre(i)
		
		Para e<-0 Hasta 5 Con Paso 1 Hacer
			Escribir "Ingrese la cantidad de horas trabajadas el " dias(e)
			Leer horasTrabajadasDiarias[i,e]
			horasTrabajadasSemanal(i)=HorasTrabajadasSemanal(i)+horasTrabajadasDiarias(i,e)
			sueldoSemanal(i)=HorasTrabajadasSemanal(i)*sueldoXHora
			
		Fin Para
	FinPara
		
	para i=0 hasta 4 Con Paso 1 hacer
		pagoTotal= pagoTotal+sueldoSemanal(i)
		
		Escribir "El total de las horas semanales trabajadas por " nombre(i) " es " HorasTrabajadasSemanal(i)
		Escribir "El sueldo semanal de " nombre(i) " es " sueldoSemanal(i)
		
		si horasTrabajadasDiarias(i,0)>horasTrabajadasDiarias(j,0) Entonces
			j=i
			
		FinSi
		
	FinPara
	
	Escribir "El pago total que debe hacer la empresa es: " pagoTotal
	Escribir "El trabajador que mas labora el lunes es: " nombre(j)
	
FinAlgoritmo
