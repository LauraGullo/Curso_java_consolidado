Algoritmo Ejer3
	//El 14 de febrero una persona desea comprarle un regalo al ser querido que m�s aprecia
	//en ese momento, su dilema radica en qu� regalo puede hacerle, las alternativas que
//tiene son las siguientes:
//	REGALO COSTO
//	Tarjeta $10.00 o menos
//	Chocolates $11.00 a $100.00
//	Flores $101.00 a $250.00
//	Anillo M�s de $251.00
//	Se requiere un diagrama de flujo con el algoritmo que ayude a determinar qu� regalo se le
//		puede comprar a ese ser tan especial por el d�a del amor y la amistad
	Definir dinero Como real
	Definir regalo Como Caracter
				
	Escribir "Ingrese el dinero disponible para el regalo "
	leer dinero
	
	Si dinero<=10 Entonces
		regalo="Tarjeta"
	SiNo
		Si dinero<=100 Entonces
			regalo="Chocolates"
		SiNo
			Si dinero<=250 Entonces
				regalo="Flores"
			SiNo
				regalo="Anillo"
			Fin Si
		Fin Si
	Fin Si
	Escribir "El regalo que puede comprar es: " regalo
	
FinAlgoritmo
