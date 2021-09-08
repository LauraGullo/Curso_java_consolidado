Algoritmo Ejer7
	//El presidente de la república ha decidido estimular a todos los estudiantes de una
	//universidad mediante la asignación de becas mensuales, para esto se tomarán en
	//consideración los siguientes criterios:
	//	Para alumnos mayores de 18 años con promedio mayor o igual a 9, la beca será de
	//		$2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores
	//			de 7.5 pero mayores o iguales a 6.0, de $500.00; a los demás se les enviará una carta de
	//			invitación incitándolos a que estudien más en el próximo ciclo escolar.
	//			A los alumnos de 18 años o menores de esta edad, con promedios mayores o iguales a
	//			9, se les dará $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000;
	//			para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dará
	//				$100, y a los alumnos que tengan promedios menores a 6 se les enviará carta deinvitación
	Definir  promedio Como real
	definir bono, edad Como Entero
						
	Escribir "Ingrese su edad"
	leer edad
	escribir "Ingrese su promedio"
	leer promedio
	Si edad>18 Entonces
		Si promedio>=9 Entonces
			bono=2000
		SiNo
			Si promedio>=7.5 Entonces
				bono=1000
			SiNo
				Si promedio>=6 Entonces
					bono=500
				SiNo
					bono=0
					Escribir "Lo invitamos a estudiar mas en el próximo ciclo escolar"
				Fin Si
			Fin Si
		Fin Si
	SiNo
		Si promedio>=9 Entonces
			bono=3000
		SiNo
			Si promedio>=8 Entonces
				bono=2000
			SiNo
				Si promedio>=6
					Entonces
					bono=100
				SiNo
					bono=0
					Escribir "Lo invitamos a estudiar mas el próximo ciclo escolar"
				Fin Si
			Fin Si
		Fin Si
		
	Fin Si
	
		
		Escribir "El bono correspondiente es: " bono
	
	
	
FinAlgoritmo
