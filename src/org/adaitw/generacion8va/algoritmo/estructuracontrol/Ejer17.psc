Algoritmo Ejer17
	//Realice un algoritmo y represéntelo mediante el diagrama de flujo, el pseudocódigo y el
	//diagrama N/S que permitan determinar qué paquete se puede comprar una persona con
//el dinero que recibirá en diciembre, considerando lo siguiente:
//	a. Paquete A. Si recibe $50,000 o más se comprará una televisión, un modular, tres
	//	pares de zapatos, cinco camisas y cinco pantalones.
	//	b. Paquete B. Si recibe menos de $50,000 pero más (o igual) de $20,000, se
	//		comprará una grabadora, tres pares de zapatos, cinco camisas y cinco
	//		pantalones.
	//		c. Paquete C. Si recibe menos de $20,000 pero más (o igual) de $10,000, se
	//			comprará dos pares de zapatos, tres camisas y tres pantalones.
	//			d. Paquete D. Si recibe menos de $10,000, se tendrá que conformar con un par de
	//				zapatos, dos camisas y dos pantalones
	Definir dinero Como entero
	Definir paquete, paqueteA, paqueteB, paqueteC, paqueteD Como caracter
									
	Escribir "Ingrese el dinero que recibió"
	leer dinero
			 
	si dinero>=50000 Entonces
		paquete= "paquete A: una televisión, un modular, tres pares de zapatos, cinco camisas y cinco pantalones"
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