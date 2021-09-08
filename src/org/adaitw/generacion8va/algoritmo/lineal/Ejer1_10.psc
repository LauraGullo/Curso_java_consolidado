Algoritmo Ejer1_10
	//Una modista, para realizar sus prendas de vestir, encarga las telas al extranjero. Para
	//cada pedido, tiene que proporcionar las medidas de la tela en pulgadas, pero ella generalmente
	//las tiene en metros. Realice un algoritmo para ayudar a resolver el problema, determinando
	//		cuantas pulgadas debe pedir con base en los metros que requiere. Represéntelo mediante el
	//		diagrama de flujo y el pseudocódigo (1 pulgada = 0.0254 m).

	Definir  medidasPulgadas, medidasMetros Como Real
	Escribir "Ingrese la cantidad de metros a pedir"
	Leer medidasMetros
	medidasPulgadas<-medidasMetros/0.0254
	Escribir "El pedido en pulgadas es de: " medidasPulgadas	
	
FinAlgoritmo
