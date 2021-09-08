Algoritmo Ejer2_4
	//Almacenes "El harapiento distinguido" tiene una promoción: a todos los trajes
	//que tienen un precio superior a $2500.00 se les aplicará un descuento de 15 %, a todos
	//los demás se les aplicará sólo 8%. Realice un algoritmo para determinar el precio final
	//		que debe pagar una persona por comprar un traje y de cuánto es el descuento que obtendrá
	
	Definir precio, descuento Como real
			
	Escribir "Ingrese el precio del traje"
	leer precio
	Si precio<2500 Entonces
		descuento=precio*0.08
	SiNo
		descuento=precio*0.15
	Fin Si
	Escribir "El descuento obtenido es de: " descuento	
	Escribir "El total a abonar es: " precio-descuento
		
FinAlgoritmo
