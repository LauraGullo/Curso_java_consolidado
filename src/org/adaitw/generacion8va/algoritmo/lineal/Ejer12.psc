Algoritmo Ejer12
	//Realice un diagrama de flujo y pseudoc�digo que representen el algoritmo para
	//determinar cu�nto pagar� finalmente una persona por un art�culo equis, considerando
	//que tiene un descuento de 20%, y debe pagar 15% de IVA (debe mostrar el precio con
	//descuento y el precio final).

	Definir costoArt�culo, IVA, descuento Como real
	
	Escribir "Ingrese el costo del art�culo"
	leer costoArt�culo
	IVA<-costoArt�culo*0.15
	descuento<-costoArt�culo*0.20
	precioDescuento<-costoArt�culo-descuento
	precioFinal<-precioDescuento+IVA
	Escribir "El precio con el descuento es de: " precioDescuento		
	Escribir "El pago total por el art�culo es de: " precioFinal
	
FinAlgoritmo
