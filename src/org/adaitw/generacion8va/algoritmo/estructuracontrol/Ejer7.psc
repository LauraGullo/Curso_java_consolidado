Algoritmo Ejer7
	//El presidente de la rep�blica ha decidido estimular a todos los estudiantes de una
	//universidad mediante la asignaci�n de becas mensuales, para esto se tomar�n en
	//consideraci�n los siguientes criterios:
	//	Para alumnos mayores de 18 a�os con promedio mayor o igual a 9, la beca ser� de
	//		$2000.00; con promedio mayor o igual a 7.5, de $1000.00; para los promedios menores
	//			de 7.5 pero mayores o iguales a 6.0, de $500.00; a los dem�s se les enviar� una carta de
	//			invitaci�n incit�ndolos a que estudien m�s en el pr�ximo ciclo escolar.
	//			A los alumnos de 18 a�os o menores de esta edad, con promedios mayores o iguales a
	//			9, se les dar� $3000; con promedios menores a 9 pero mayores o iguales a 8, $2000;
	//			para los alumnos con promedios menores a 8 pero mayores o iguales a 6, se les dar�
	//				$100, y a los alumnos que tengan promedios menores a 6 se les enviar� carta deinvitaci�n
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
					Escribir "Lo invitamos a estudiar mas en el pr�ximo ciclo escolar"
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
					Escribir "Lo invitamos a estudiar mas el pr�ximo ciclo escolar"
				Fin Si
			Fin Si
		Fin Si
		
	Fin Si
	
		
		Escribir "El bono correspondiente es: " bono
	
	
	
FinAlgoritmo
