package test;

import java.util.Scanner;
/*
 * La clase main, desde aqui se llaman a todos los m�todos usados en el programa.
 * */
public class Test {
	/**
	 * Con el main controlamos los otros m�todos.
	 * @param args Simplemente se necesita para el main.
	 * @author Vietnam
	 * */
	public static void main(String[] args) {
		/**
		 * @seleccion Variable de Integer para seleccionar y ejecutar la opci�n que quieres
		 * */
		int seleccion;
		Scanner sc=new Scanner(System.in);

		System.out.println("1.Informaci�n sobre la guerra entre Estados Unidos y Vietnam");
		System.out.println("2.Test sobre la guerra entre Estados Unidos y Vietnam");
		System.out.println("3.Recetas t�picas de Vietnam");
		System.out.println("4.Informaci�n sobre sitios tur�sticos de Vietnam");
		System.out.println("5.Salir");

		System.out.println("Introduce un n�mero.");
		seleccion = sc.nextInt();
		switch(seleccion) {
		case 1: Guerra();
		break;
		case 2: Test();
		break;
		case 3: Recetas();
		break;
		case 4: Turismo();
		break;
		case 5:	
			System.exit(0);
			break;
		}
		sc.close();


	}
	/**
	 * 
	 * 
	 * El m�todo Guerra nos permite ver informaci�n sobre la guerra de Vietnam y Estados Unidos.
	 */
	public static void Guerra() {
		pruebas s = new pruebas();
		/**
		 * Variables:
		 * <ul>
		 * 	<li>numero:un n�mero que introducira el usuario</li>
		 * </ul>
		 */
		int numero;
		Scanner sc = new Scanner(System.in);
		/**
		 * Explicaci�n del metodo
		 */
		System.out.println("Elige una opcion para elegir que informacion quieres que se muestre en el programa.");
		/**
		 * Las opciones a elegir para el usuario, cada uno con su respectivo n�mero
		 */
		System.out.println("Las opciones son: [1] Nombre por lo que lo conocen; [2] ¿Por qu� paso?; [3] ¿Quienes participaron?; [4] ¿Cu�ntas bajas?; [5] Origen de la guerra; [6] Los objetivos de la intervencion; [7] Los primeros enfrentamientos de los estadounidenses a gran escala; [8] ¿Por qu� Estados Unidos perdi� la guerra?");
		numero = sc.nextInt();
		/**
		 *Bucle que terminara cuando el �suario presione el n�mero 0
		 */
		do {
			/**
			 * dependiendo del n�mero eleg�do aparecer�n en pantalla difer�ntes t�xtos
			 */
			s.setNumero(numero);
			s.infoGuerra();
			/**
			 * Vuelve a introduc�r en pantalla las opciones y la opcion para salir del bucl�  
			 */
			System.out.println("Vuelva a elegir una de las opciones: [1] Nombre por lo que lo conocen; [2] ¿Por qu� paso?; [3] ¿Quienes participaron?; [4] ¿Cu�ntas bajas?; [5] Origen de la guerra; [6] Los objetivos de la intervencion; [7] Los primeros enfrentamientos de los estadounidenses a gran escala; [8] ¿Por qu� Estados Unidos perdi� la guerra?");
			System.out.println("Si quiere salir pulse el numero 0:");
			numero=sc.nextInt();

		}while(numero!=0);
		sc.close();
	}

	/**
	 * Crea un String bidimensional llamado test en el que se generan unas preguntas con respuestas.
	 * Las respuestas aparecen en un orden aleatotio, y sus respuestas tambi�n.
	 * Despu�s, si el numero de la respuestas es igual a la posicion 1 de la pregunta original, se suma uno al contador
	 * para luego mostrar la nota del test.
	 */
	public static void Test() {

		Scanner sc=new Scanner(System.in);
		String test[][] = new String [10][5];
		boolean esistenPre[] = new boolean [10];
		boolean esistenRes[] = new boolean [5];
		String respuestas[] = new String [5];
		int numPre,numRes,res,punt=0;

		rellenaTest(test);
		rellenarBoolean(esistenPre);

		for (int i=0; i<test.length; i++) {
			numPre = (int)(Math.random()*10+0);

			if(esistenPre[numPre]) {
				i-=1;
			}else {
				esistenPre[numPre]=true;

				System.out.println((i+1)+". "+test[numPre][0]);
				rellenarBoolean(esistenRes);

				for(int j=1; j<test[numPre].length;j++) {
					numRes = (int)(Math.random()*4+1);

					if(esistenRes[numRes]) {
						j-=1;
					}else {
						esistenRes[numRes]=true;

						System.out.println("    "+j+"- "+test[numPre][numRes]);
						respuestas[j]=test[numPre][numRes];
					}
				}

				do {
					System.out.println("Introduce la respuesta correcta (1-4):");
					res=sc.nextInt();
				}while(res<1 || res>4);

				if (respuestas[res].equalsIgnoreCase(test[numPre][1])) {
					punt++;
				}
			}
		}

		System.out.println("Tu puntuacion a sido "+punt+"/10");
		System.out.println("Pulse enter para salir");
		res=sc.nextInt();
	}


	/**
	 * rellenarBoolean sirve para rellenar los dos booleans en false
	 * @param e, el par�metro de array booleano
	 */
	public static void rellenarBoolean(boolean [] e) {		
		for(int i=0;i<e.length;i++) {
			e[i]=false;
		}
	}


	/**
	 * rellenaTest sirve para rellenar el array bidimensional de test con las preguntas y las respuestas.
	 * @param test, el par�metro de array bidimensional con las preguntas y respuestas
	 */
	public static void rellenaTest(String[][] test) {
		test[0][0] = "�Por qu� pas� la guerra?";
		test[0][1] = "Para reunificar Vietnam bajo un gobierno comunista";
		test[0][2] = "Porque EEUU son racistas";
		test[0][3] = "Porque en Vietnam no venden buena comida";
		test[0][4] = "Porque EEUU no habla Vietnamita";

		test[1][0] = "�Quienes participaron?";
		test[1][1] = "Vietnam del norte y Vietnam del sur junto a sus respectivos aliados";
		test[1][2] = "China y Corea";
		test[1][3] = "Estados unidos y Jap�n";
		test[1][4] = "Rusia y Ucrania";

		test[2][0] = "�Cuantas bajas hubo?";
		test[2][1] = "Entre 966.000 y 3.010.000";
		test[2][2] = "3";
		test[2][3] = "No sabe no contesta";
		test[2][4] = "Entre 1.000.000 y 3.023.000";

		test[3][0] = "�Cual fue el origen?";
		test[3][1] = "Porque estados unidos dio un golpe de estado en Vietnam del sur";
		test[3][2] = "Por culpa de los comunistas";
		test[3][3] = "Por culpa de china";
		test[3][4] = "Gracias a Vietnam del norte";

		test[4][0] = "�Por qu� Estados Unidos perdi� la guerra de Vietnam?";
		test[4][1] = "No comprendieron del todo el tipo de guerra y el tipo de pueblo contra quien luchaba.";
		test[4][2] = "Fueron los temores estadounidenses quienes le llevaron a continuar un enfrentamiento hasta la derrota total.";
		test[4][3] = "Las restricciones impuestas por los pol�ticos.";
		test[4][4] = "El Ej�rcito de los Estados Unidos no luch� bien.";

		test[5][0] = "�Qu� postura ten�a la CIA sobre la posibilidad de ganar el conflicto en Vietnam?";
		test[5][1] = "Mantuvo una opini�n similar al postular la imposibilidad de ganar el conflicto por medios �nicamente militares.";
		test[5][2] = "Defendi� que el Ej�rcito de los Estados Unidos no luch� bien.";
		test[5][3] = "Consider� que las restricciones impuestas por los pol�ticos fueron las causantes de la derrota.";
		test[5][4] = "Cre�a que el Ej�rcito de los Estados Unidos no ten�a informaci�n precisa de c�mo ganar la guerra.";

		test[6][0] = "�Por qu� el Tri�ngulo de Hierro nunca fue conocido del todo ni desmantelado?";
		test[6][1] = "Porque estaba repleto de t�neles llenos de guerrilleros y soldados del EVN, constituyendo una daga sobre la capital de Vietnam del Sur.";
		test[6][2] = "Porque los militares estadounidenses no ten�an buena informaci�n sobre la zona.";
		test[6][3] = "Porque los guerrilleros se infiltraron en la zona desmilitarizada.";
		test[6][4] = "Porque la Operaci�n Cedar Falls fracas�.";

		test[7][0] = "�Qu� problema tuvieron los militares estadounidenses al manejar la informaci�n en la guerra de Vietnam?";
		test[7][1] = "No prestaron excesiva atenci�n a los discursos de los dirigentes comunistas ni ganaron la confianza de los aldeanos.";
		test[7][2] = "No tuvieron suficientes recursos econ�micos para financiar la guerra.";
		test[7][3] = "No comprendieron del todo el tipo de guerra y el tipo de pueblo contra quien luchaba.";
		test[7][4] = "No recibieron informaci�n precisa de c�mo ganar la guerra.";

		test[8][0] = "�Por qu� algunos autores defienden que el presidente Johnson se vio arrastrado por sus consejeros a la guerra de Vietnam?";
		test[8][1] = "Porque Johnson no deseaba inmiscuirse tanto en Vietnam, pero el peso de sus consejeros para que interviniese fue demasiado grande.";
		test[8][2] = "Porque Vietnam del Sur no quer�a la guerra, sino la reunificaci�n.";
		test[8][3] = "Porque la iniciativa de los combates la llevaban los comunistas.";
		test[8][4] = "Porque los Estados Unidos no comprendieron del todo el tipo de guerra y el tipo de pueblo contra quien luchaba.";

		test[9][0] = "�Por qu� la Operaci�n Attleboro result� un fracaso?";
		test[9][1] = "Por no contar con buena informaci�n.";
		test[9][2] = "Porque el FNLV logr� desaparecer.";
		test[9][3] = "Porque el Ej�rcito de los Estados Unidos no luch� bien.";
		test[9][4] = "Porque no hab�a recursos suficientes para financiar la operaci�n.";
	}

	/**
	 * Recetas M�todo con el cual podemos elegir una receta y la muestra en pantalla.
	 */
	public static void Recetas() {
		/** 
		 * @numReceta Una variable tipo Integer para seleccionar la receta que queremos ver.
		 * @receta Es un array de strings en el que guardamos la innformacion de las recetas.
		 * 
		 */
		int numReceta;
		Receta r = new Receta();
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Ingrese un n�mero entre 1 y 10 (o 0 para salir): ");
			System.out.println("[1]:Gofres de Pandan;[2]:Ensalada vietnamita de mango;[3]:Rollitos de primavera vietnamitas;"
					+ "[4]:Ensalada vietnamita de fideos con arroz;[5]:Banh Mi;[6]:Pho;[7]:Crepes vietnamitas;"
					+ "[8]:Pollo a la hierba lim�n;[9]:Fideos vietnamitas con mantequilla y ajo;[10]:Arroz pegajoso con cacahuetes");
			numReceta = input.nextInt();/*Usamos el scanner para recoger un n�mero*/
				/**
				 * dependiendo del n�mero eleg�do aparecer�n en pantalla difer�ntes t�xtos
				 */
				r.setNumero(numReceta);
				r.infoReceta();
				/**
				 * Vuelve a introduc�r en pantalla las opciones y la opcion para salir del bucl�  
				 */	
		} while (numReceta != 0);
		input.close();
		System.out.println("Aqu� se termina el programa");
	}


	/**

	La clase Turismo permite conocer informaci�n sobre los sitios tur�sticos m�s populares de Vietnam.
	Permite ingresar un n�mero entre 1 y el n�mero de sitios tur�sticos y se muestra la informaci�n del sitio correspondiente.
	Si se ingresa 0, se termina el programa.
	 */
	public static void Turismo() {
		Turismo t = new Turismo();
		Scanner input = new Scanner(System.in);
		int numSitio;

		do {
			System.out.print("Ingrese un n�mero entre 1 y 7 (o 0 para salir): ");
			numSitio = input.nextInt();

			t.setNumero(numSitio);
			t.infoTurismo();
		} while (numSitio != 0);

		System.out.println("Aqu� se termina el programa");
		input.close();		
	}

}



