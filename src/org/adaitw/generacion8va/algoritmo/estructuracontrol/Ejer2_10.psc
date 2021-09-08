Algoritmo Ejer2_10
	//Una compañía de viajes cuenta con tres tipos de autobuses (A, B y C), cada uno
	//tiene un precio por kilómetro recorrido por persona, los costos respectivos son $2.0,
	//$2.5 y $3.0. Se requiere determinar el costo total y por persona del viaje considerando
	//que cuando éste se presupuesta debe haber un mínimo de 20 personas, de lo contrario
	//el cobro se realiza con base en este número límite.

    Definir km, costoKm, costoPersona, costoTotal Como real
	Definir  personas Como entero
	definir tipoAutobus Como Caracter 
				
	Escribir "Ingrese los km del recorrido "
	leer km
	Escribir "Ingrese cantidad de personas "
	leer personas
		
	Escribir "Seleccione el tipo de autobus: A, B o C"
	leer tipoAutobus 
				
		Si tipoAutobus="a" Entonces
			costoKm=2
		SiNo
			Si tipoAutobus="b" Entonces
				costoKm=2.5
			SiNo
				si tipoAutobus="c" Entonces
					costoKm=3 
				sino 
					Escribir "El tipo de autobus es incorrecto"
				finsi	
			Fin Si
		Fin Si
		
		si personas<20 Entonces
			costoTotal=costoKm*20*km
		SiNo
			costoTotal=costoKm*personas*km
						
		FinSi
	costoPersona=costoTotal/personas
	
	Escribir "El costo por persona es: " costoPersona
	Escribir "El costo total es: " costoTotal
	
FinAlgoritmo
