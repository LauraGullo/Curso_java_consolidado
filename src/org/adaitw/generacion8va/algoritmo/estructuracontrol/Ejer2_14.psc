Algoritmo Inicio
	//Una compa��a de paqueter�a internacional tiene servicio en algunos pa�ses de
	//Am�rica del Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo por el
	//servicio de paqueter�a se basa en el peso del paquete y la zona a la que va dirigido. Lo
//anterior se muestra en la siguiente tabla:
//	Zona Ubicaci�n Costo/gramo
//	1 Am�rica del Norte $11.00
	//	2 Am�rica Central $10.00
	//3 Am�rica del sur $12.00
//	4 Europa $24.00
//	5 Asia $27.00
//	Parte de su pol�tica implica que los paquetes con un peso superior a 5 kg no son
//	transportados, esto por cuestiones de log�stica y de seguridad. Realice un algoritmo
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
				Escribir "No es una zona v�lida"
		Fin Segun
		Si Co>0 Entonces
			Escribir "El costo es: $" Co
		SiNo
			Escribir "No es posible determinar el costo"
		Fin Si
		
	Fin Si
		
FinAlgoritmo
