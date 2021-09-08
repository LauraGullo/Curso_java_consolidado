//Realice un algoritmo para determinar cuánto se debe pagar por equis cantidad de lápices considerando que si son 1000 o más el costo es de 85$; de lo contrario, el precio es de 90$.
Algoritmo ejercicio2_3
	Definir x Como Entero
	Definir pago Como Real
	Escribir "ingrese la cantidad de lapices"
	Leer x
	Si x>=1000 Entonces
		pago=x*85
	SiNo
		pago=x*90
	Fin Si
	Escribir "El pago total es de " pago
	
FinAlgoritmo
