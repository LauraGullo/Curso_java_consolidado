Algoritmo Ejer2_4
	//Almacenes "El harapiento distinguido" tiene una promoci�n: a todos los trajes
	//que tienen un precio superior a $2500.00 se les aplicar� un descuento de 15 %, a todos
	//los dem�s se les aplicar� s�lo 8%. Realice un algoritmo para determinar el precio final
	//		que debe pagar una persona por comprar un traje y de cu�nto es el descuento que obtendr�
	
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
