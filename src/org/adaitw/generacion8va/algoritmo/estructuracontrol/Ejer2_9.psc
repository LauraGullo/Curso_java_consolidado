Algoritmo Ejer2_9
//La política de la compañía telefónica "chimefón" es: "Chismea + x -". Cuando se
//	realiza una llamada, el cobro es por el tiempo que ésta dura, de tal forma que los
//	primeros cinco minutos cuestan $ 1.00 c/u, los siguientes tres, 80¢ c/u, los siguientes
//	dos minutos, 70¢ c/u, y a partir del décimo minuto, 50¢ c/u.
//	Además, se carga un impuesto de 5% cuando es domingo, y si es día hábil, en
//	turno matutino, 15%, y en turno vespertino, 10%. Realice un algoritmo para determinar
//			cuánto debe pagar por cada concepto una persona que realiza una llamada.

    Definir duracionLlamada, costoBase, impuesto, costoTotal Como real
	Definir dia, turno Como entero
				
	Escribir "Ingrese la duración de la llamada en minutos"
	leer duracionLlamada
	Si duracionLlamada<=5 Entonces
		costoBase=duracionLlamada
				
	SiNo
		Si duracionLlamada<=8 Entonces
			costoBase=(duracionLlamada-5)*0.8+5
			
		SiNo
			Si duracionLlamada<=10 Entonces
				costoBase=(duracionLlamada-8)*0.7+7.4			
			SiNo
				costoBase=(duracionLlamada-10)*0.5+8.8
			Fin Si
		Fin Si
	
	Fin Si
	
	Escribir "Indique el día: 1_Día hábil, 2_Domingo"
	Repetir
		Leer dia
		si dia<1 o dia>2 Entonces
			Escribir "Valor incorrecto. Ingrese un valor nuevamente."
		FinSi
	Hasta Que dia=1 o dia=2
	
	Si dia=2 Entonces
		impuesto=costoBase*0.05
	SiNo
		Escribir "Indique el turno de la llamada: 1_Matutino, 2_Vespertino"
		Repetir
			Leer turno
			si turno<1 o turno>2 Entonces
				Escribir "Valor incorrecto. Ingrese un valor nuevamente."
			FinSi
		Hasta Que turno=1 o turno=2
		
		Si turno=1 Entonces
			impuesto=costoBase*0.15
		SiNo
			impuesto=costoBase*0.10
		Fin Si
	Fin Si
	
	
	costoTotal=costoBase+impuesto	
	Escribir "El costo total de la llamada es: " costoTotal
FinAlgoritmo
