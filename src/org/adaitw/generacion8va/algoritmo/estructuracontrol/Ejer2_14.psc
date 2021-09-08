Algoritmo Inicio
	//Una compañía de paquetería internacional tiene servicio en algunos países de
	//América del Norte, América Central, América del Sur, Europa y Asia. El costo por el
	//servicio de paquetería se basa en el peso del paquete y la zona a la que va dirigido. Lo
//anterior se muestra en la siguiente tabla:
//	Zona Ubicación Costo/gramo
//	1 América del Norte $11.00
	//	2 América Central $10.00
	//3 América del sur $12.00
//	4 Europa $24.00
//	5 Asia $27.00
//	Parte de su política implica que los paquetes con un peso superior a 5 kg no son
//	transportados, esto por cuestiones de logística y de seguridad. Realice un algoritmo
//		para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la
//entrega;
	Definir PE Como Entero
	Escribir "Escribir peso: "
	Leer PE
	Si PE>5000 Entonces
		Escribir "No es transportado"
	SiNo
		Escribir "Escribir zona de entrega: 1_America del Norte, 2_America Central, 3_America del Sur, 4_Europa, 5_Asia" 
		Leer NZ
		Segun NZ Hacer
			1:
				Co=PE*11
			2:
				Co=PE*10
			3:
				Co=PE*12
			4:
				Co=PE*24	
			5:
				Co=PE*27	
			De Otro Modo:
				Escribir "No es una zona válida"
		Fin Segun
		Si Co>0 Entonces
			Escribir "El costo es: $" Co
		SiNo
			Escribir "No es posible determinar el costo"
		Fin Si
		
	Fin Si
		
FinAlgoritmo
