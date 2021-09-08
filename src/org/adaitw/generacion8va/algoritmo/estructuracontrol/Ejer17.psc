Algoritmo Ejer17
	//Realice un algoritmo y repres�ntelo mediante el diagrama de flujo, el pseudoc�digo y el
	//diagrama N/S que permitan determinar qu� paquete se puede comprar una persona con
//el dinero que recibir� en diciembre, considerando lo siguiente:
//	a. Paquete A. Si recibe $50,000 o m�s se comprar� una televisi�n, un modular, tres
	//	pares de zapatos, cinco camisas y cinco pantalones.
	//	b. Paquete B. Si recibe menos de $50,000 pero m�s (o igual) de $20,000, se
	//		comprar� una grabadora, tres pares de zapatos, cinco camisas y cinco
	//		pantalones.
	//		c. Paquete C. Si recibe menos de $20,000 pero m�s (o igual) de $10,000, se
	//			comprar� dos pares de zapatos, tres camisas y tres pantalones.
	//			d. Paquete D. Si recibe menos de $10,000, se tendr� que conformar con un par de
	//				zapatos, dos camisas y dos pantalones
	Definir dinero Como entero
	Definir paquete, paqueteA, paqueteB, paqueteC, paqueteD Como caracter
									
	Escribir "Ingrese el dinero que recibi�"
	leer dinero
			 
	si dinero>=50000 Entonces
		paquete= "paquete A: una televisi�n, un modular, tres pares de zapatos, cinco camisas y cinco pantalones"
	SiNo
		Si dinero>=20000 Entonces
			paquete="paquete B: una grabadora, tres pares de zapatos, cinco camisas y cinco pantalones"
		SiNo
			Si dinero>=10000 Entonces
				paquete="paquete C: dos pares de zapatos, tres camisas y tres pantalones"
			SiNo
				paquete="paquete D: Un par de zapatos, dos camisas y dos pantalones"
			Fin Si
		Fin Si
	Fin Si
			
	Escribir "EL paquete que se puede comprar es " paquete
	
		
FinAlgoritmo