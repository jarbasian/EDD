import java.util.Scanner;
import java.util.Random;
/*
 * La clase main, desde aqui se llaman a todos los métodos usados en el programa.
 * */
public class Main {
	/**
	 * Con el main controlamos los otros métodos.
	 * @param args Simplemente se necesita para el main.
	 * @author Vietnam
	 * */
	public static void main(String[] args) {
		/**
		 * @seleccion Variable de Integer para seleccionar y ejecutar la opción que quieres
		 * */
	int seleccion;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("1.Información sobre la guerra entre Estados Unidos y Vietnam");
	System.out.println("2.Test sobre la guerra entre Estados Unidos y Vietnam");
	System.out.println("3.Recetas típicas de Vietnam");
	System.out.println("4.Información sobre sitios turísticos de Vietnam");
	System.out.println("5.Salir");

	System.out.println("Introduce un número.");
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
	 * El método Guerra nos permite ver información sobre la guerra de Vietnam y Estados Unidos.
	 */
	public static void Guerra() {
		/**
		 * Variables:
		 * <ul>
		 * 	<li>numero:un número que introducira el usuario</li>
		 * </ul>
		 */
		int numero;
		Scanner sc = new Scanner(System.in);
		/**
		 * Explicación del metodo
		 */
		System.out.println("Elige una opcion para elegir que informacion quieres que se muestre en el programa.");
		/**
		 * Las opciones a elegir para el usuario, cada uno con su respectivo número
		 */
		System.out.println("Las opciones son: [1] Nombre por lo que lo conocen; [2] ¿Por qué paso?; [3] ¿Quienes participaron?; [4] ¿Cuántas bajas?; [5] Origen de la guerra; [6] Los objetivos de la intervencion; [7] Los primeros enfrentamientos de los estadounidenses a gran escala; [8] ¿Por qué Estados Unidos perdió la guerra?");
		numero = sc.nextInt();
		/**
		 *Bucle que terminara cuando el úsuario presione el número 0
		 */
		do {
			/**
			 * dependiendo del número elegído aparecerán en pantalla diferéntes téxtos
			 */
			switch(numero) {
			case 1: System.out.println("Nombre que se le atribuye: Guerra de Vietnam, Segunda Guerra de Indochina  y Guerra de Resistencia contra Estados Unidos (en Vietnam). ");break;
			case 2: System.out.println("Para reunificar Vietnam bajo un gobierno comunista.");break;
			case 3: System.out.println("El gobierno comunista de Vietnam del Norte y sus aliados en Vietnam del Sur, conocidos como el Viet Cong, respaldados por China y la Unión Soviética, contra el gobierno de Vietnam del Sur y su principal aliado, Estados Unidos y otras naciones aliadas.");break;
			case 4: System.out.println("Vietnam: Entre 966 000 y 3 010 000 vietnamitas.\r\n"
					+ "Estados Unidos: Estados Unidos contabilizó 58 159 bajas y más de 1700 desaparecidos.\r\n"
					+ "\r\n");break;
			case 5: System.out.println("Después de la segunda guerra mundial un grupo comunista llamado Viet Minh \n"
					+ " que reclamaba la independencia indochina francesa inició una guerra contra Francia y ganaron. \n"
					+ " Tras esa victoria Laos, Cambodia, y Vietnam se convirtieron en países independientes. \n"
					+ "Sin embargo, Vietnam estaba dividido en dos partes, una parte del pueblo quería comunismo y \n"
					+ " el otro capitalismo. Hubo tanta tensión entre estas partes que el país se dividió en dos. \n"
					+ " Vietnam del Norte de corte comunista y Vietnam del Sur de corte capitalista. La origen de de esta división \n"
					+ " estaba condicionada por un referéndum que se celebraría un año después dondé los vietnamitas decidirian \n"
					+ " su reunificación o su separación definitiva. Pero, Estados Unidos y los sectores más anticomunistas de Vietnam dieron un golpe de estado en Vietnam del Sur \n"
					+ " creando una dictadura y evitando el referéndum. Por ésto Vietnam del Norte empezó la guerra en 1955.\n");break;
			case 6: System.out.println("Largo Alonso (2002, pp. 56 y 57) indica que la Casa Blanca marcó una meta propagandística y otra militar desde un principio.\r\n"
					+ "objetivo político \r\n"
					+ "El objetivo político pretendía dar a conocer las acciones del Norte y del FNLV tanto a los miembros del Congreso como a la opinión pública estadounidense y mundial, con el fin último de aislar internacionalmente a Vietnam del Norte y marginar al FNLV como interlocutor, en caso de llegar a una negociación. Para ello se utilizarían los medios de comunicación y las acciones diplomáticas.\r\n"
					+ "El presidente Johnson trató de atraer a tantos países como pudo con la Campaña Más banderas, para dar una idea de que el «Mundo Libre» estaba luchando contra el comunismo, pese a que el adjetivo «Libre» es más un eufemismo que una realidad debido a la presencia de países como Corea del Sur o Filipinas. Muchas naciones enviaron ayuda, principalmente en forma de suministros médicos, algo bien visto por la población del país emisor y receptor; pero solo 7 destinaron soldados a la Península: la dictadura surcoreana envió en 1965, 200 hombres y fue aumentando el contingente hasta 47 829 soldados en 1967;​ Tailandia contribuyó con un total de 11 568 soldados, además permitió a Estados Unidos emplear su territorio para operar bombarderos B-52, cazas, aviones de reconocimiento y el Centro de Vigilancia de la Infiltración​ Australia terminó destinando una división, primero con asesores en 1962, después con 1400 soldados, algunos veteranos de la lucha en las junglas malayas, y finalmente con un número máximo de 7672 soldados y oficiales en 1967, por lo que se convirtieron en un importante aliado estadounidense y experimentado en un territorio muy hostil como es la selva,se retirarían en diciembre de 1972.​ Participaciones más pequeñas fueron la de Filipinas (2000 soldados), Taiwán (31 hombres) y España con varios grupos de 13 médicos militares.\r\n"
					+ "campo militar \r\n"
					+ "En el campo militar el objetivo marcado era demostrar al FNLV y a Hanói que no podrían ganar la guerra debido a las numerosas bajas y derrotas que les infligieron.​ Por tanto, como indicó el propio presidente de los Estados Unidos, sería una guerra diferente, donde no existiría una capital que tomar o unas líneas de frente que romper. Para infligir esas derrotas y esas pérdidas, el presidente Johnson deseaba utilizar más los bombardeos que las acciones de infantería, pero para esto sería necesario levantar una serie de bases navales y aéreas que cubrieran todo el país. A su vez, dichas bases necesitaban tener garantizada su seguridad, por lo que se consideró necesario:\r\n"
					+ "Cortar la entrada marítima de ayuda para el FNLV proveniente del Norte.\r\n"
					+ "Reforzar las guarniciones existentes, dado que los hombres del ERVN habían demostrado su incapacidad para defender el territorio.\r\n"
					+ "Emprender más y mejores patrullas de búsqueda en la jungla para localizar las partidas del FNLV y los infiltrados norvietnamitas, destruyéndolas después empleando su potencia de fuego.\r\n"
					+ "La primera misión podía seguir en manos de la flota de «aguas azules» destinada en el sureste asiático que habían realizado un buen trabajo hasta entonces.​ Para la segunda y la tercera se necesitan envíos masivos de hombres y material. Así, a finales de 1965, ya eran más de 100 000 los efectivos desplazados a Vietnam y se habían destinado 1000 millones de dólares para el envío de casi diez millones de toneladas mensuales en suministros y equipo.  Toda esta ingente cantidad de materiales requería una enorme cadena logística que lastró mucho al Ejército. Por ejemplo, solo uno de cada siete soldados estadounidenses se vio realmente envuelto en combate, los demás pertenecían a cuerpos logísticos, administrativos, médicos, mecánicos, etc.\r\n"
					+ "Para cumplir la tercera meta militar, el despliegue de potencia de fuego con la que cubrir a la infantería en misiones de búsqueda y destrucción, Estados Unidos haría uso de todo su poder aéreo. Por ejemplo, si las piezas artilleras aerotransportadas no podían descargarse por lo espeso de la selva, aviones de distintos tipos lanzarían bombas de cientos de kilos que abrían un cráter y permitir el aterrizaje.\r\n"
					+ "");break;
			case 7: System.out.println("En batallas más o menos convencionales, los guerrilleros vietnamitas aún tenían cartas que jugar frente a los soldados del Sur y lo demostraron en el mes de junio. El 51.º Batallón del ERVN cayó en un ataque sorpresa cerca del golfo de Tonkín y fue desintegrado por completo. Pero el resultado fue diferente cuando los estadounidenses entraron en acción:\r\n"
					+ "El 1 de julio de 1965 los marines emprendieron la Operación Starlite, primera prueba de fuego para ellos después de meses inactivos. Lograron sorprender primero y arrinconar después al FNLV en la península de Noh Nang. Una vez allí acabaron con los guerrilleros utilizando toda su potencia de fuego: armas portátiles, artillería, aviación y artillería naval de los cruceros fondeados en el Golfo.\r\n"
					+ "Por su parte, el Ejército estadounidense combatiría por primera vez contra los soldados del Norte en el valle de Ia Drang. Durante varios días de noviembre los soldados del 7. de Caballería y otras unidades de la 1.ª División de Caballería Aérea se enfrentaron a tres regimientos del EVN. Los norvietnamitas habían sido enviados para destruir el campamento de Boinas Verdes y montañeses de Plei Me, acabar con las columnas de refuerzo y tomar después la ciudad de Pleiku, dejando así el camino libre hacia Qui Nhon y el Mar de China Meridional, lo que hubiese partido el país por la mitad.​ Pero los estadounidenses truncaron ese plan. Los nuevos helicópteros movidos por turbo-transmisión resultaron un arma útil,​ realizando una fundamental misión para transportar a los hombres al centro de la batalla,aprovisionarlos y extraer a los heridos.​ La batalla de Ia Drang estuvo a punto de volverse una catástrofe para Estados Unidos, pero esos helicópteros y la potencia de fuego desplegada invirtieron la situación. Unos 1500 soldados norvietnamitas perdieron la vida, frente a 234 estadounidenses,​ pese a ello el ejército norvietnamita se autoproclamó vencedor.\r\n"
					+ "Los éxitos en la Operación Starlight y en Ia Drang llevaron al jefe de las fuerzas estadounidenses en Vietnam, general William Westmoreland, a solicitar y conseguir los medios para realizar las acciones que pensaba que le llevarían a la victoria, entre las que destacaron:\r\n"
					+ "Hacer un uso extensivo del helicóptero como nuevo medio de transporte y también de guerra.\r\n"
					+ "Continuar la Operación Rolling Thunder de bombardeo sobre Vietnam del Norte.\r\n"
					+ "Cortar la llegada de suministros desde el Norte. Para ello la flota estadounidense continuaría bloqueando las rutas marítimas y se intensificaron las acciones de los Boinas Verdes en las Tierras Altas Centrales de Vietnam contra la Ruta Ho Chi Minh.\r\n"
					+ "Atacar al enemigo en su propio terreno. Se intensificarían las operaciones de búsqueda y destrucción, patrullas en lancha por el delta del Mekong, formación y envío de más SEAL para realizar acciones de contrainsurgencia…\r\n"
					+ "Potenciar la campaña «Corazones y Mentes», que tanto éxito les reportó a los ingleses en Malasia.​ Se debía continuar con la reconstrucción de poblados, el servicio sanitario, la entrega de maquinaria agrícola, etc.\r\n"
					+ "Asimismo en diciembre de 1965, la Fuerza Aérea puso en marcha el Programa Big Belly, para permitir que los B-52 transportaran casi 10 000 kg de bombas y en abril del año siguiente fueron desplazados a la isla de Guam para poder alcanzar Vietnam del Sur. Desde allí se realizaron una media de 300 salidas al mes.\r\n"
					+ "El primer año de la guerra, Estados Unidos venció en la práctica en la totalidad de las batallas, gracias a su potencia de fuego y a poder abastecer a sus hombre por aire sin sufrir los numerosas ataques que tantas pérdidas les costaron a los franceses ​. Esto les hizo pensar en una victoria rápida; pero de la que podían obtener experiencia en combate para sus oficiales, por lo que decidieron enviar allí a todos los posibles, rotando cada seis meses en lugar de cada doce. Esto causó un primer problema. Las estadísticas informaban de que un militar comenzaba a desenvolverse bien a los noventa días de servir en Vietnam y alcanzaba su óptimo operativo a los diez meses. La continua rotación fue imprimiendo un sentimiento en las unidades de ser mandadas por novatos ineptos, lo que les hacía candidatos a las temidas emboscadas, por tanto, no dudaban en eliminar a sus jefes y a cualquier recluta no demasiado hábil.\r\n"
					+ "");break;
			case 8: System.out.println("Al reconstruir el escenario los historiadores se siguen haciendo la pregunta ¿el presidente Johnson arrastró a Vietnam a la guerra o se vio arrastrado por sus consejeros?​ El primer punto de vista es defendido por Schell (1988, p. 28), para quien Vietnam del Sur no quería la guerra, sino la reunificación. Fueron los temores estadounidenses quienes le llevaron a continuar un enfrentamiento hasta la derrota total. La otra línea de pensamiento la apoyan autores como el exconsejero presidencial John Kenneth Galbraith, para quien Johnson no deseaba inmiscuirse tanto en Vietnam, pero el peso de sus consejeros para que interviniese fue demasiado grande.\r\n"
					+ "Para Largo Alonso (2002, p. 69) entre otros, los Estados Unidos en general, y su Ejército en particular, tuvieron buena parte de culpa. Pese al extraordinario esfuerzo realizado y a la sensación inicial de triunfo, los Estados Unidos no comprendieron del todo el tipo de guerra y el tipo de pueblo contra quien luchaba. Así aquel atacaba donde su enemigo podía encajar mejor los golpes, en las bajas humanas, mientras se desgastaba un poco más cada vez. Una línea de pensamiento similar la defendió Robert McNamara quien, pese a ser uno de los primeros y más fervientes defensores de la intervención, comenzó a tener dudas en 1966 y a plantearse abiertamente la imposibilidad de ganar ya en 1967. Según él, la iniciativa de los combates la llevaban los comunistas; ellos podían elegir cuantas bajas sufrir y cuantas infligir a sus oponentes, de esta forma:\r\n"
					+ "Mantendrán sus pérdidas a un nivel lo suficientemente bajo como para poder aguantar indefinidamente; pero lo suficientemente alto para tentarnos a aumentar nuestras fuerzas hasta el extremo de que la opinión pública estadounidense rechace la guerra.\r\n"
					+ "Robert McNamara\r\n"
					+ "La CIA mantuvo una opinión similar al postular la imposibilidad de ganar el conflicto por medios únicamente militares.\r\n"
					+ "Esta incomprensión se palpa en las continuas estadísticas e informes cuantitativos solicitados y manejados por los mandos, en varios casos exagerando los resultados, pero sin prestar excesiva atención a los discursos de los dirigentes comunistas,​ ni ganándose la confianza de los aldeanos, quienes podían proporcionarles buena información. Así, los militares estadounidenses se comportaban como en cualquier guerra convencional, donde lo importante son los datos del potencial enemigo, en lugar de una guerra de guerrillas, donde lo vital es separar a los guerrilleros del apoyo popular. Al abandonar este aspecto, algunos problemas no disminuyeron sino lo contrario:\r\n"
					+ "La zona desmilitarizada fue un foco de infiltración comunista, pese a los duros combates librados allí, pese a la Línea McNamara con su avanzada tecnología y a las baterías instaladas.\r\n"
					+ "El Triángulo de Hierro, una zona a 50 km de Saigón repleta de túneles llenos de guerrilleros y soldados del EVN, nunca fue conocida del todo ni desmantelada, constituyendo una daga sobre la capital de Vietnam del Sur, a medio camino entre los refugios seguros en Camboya y las poblaciones sureñas más ricas.\r\n"
					+ "La Operación Attleboro, en agosto de 1966, resultó el ejemplo de una gran operación montada para localizar y destruir refugios y unidades enemigas; pero un fracaso por no contar con buena información. Los soldados de la 196.ª División de Infantería Ligera no lograron cercar a los comunistas, que huyeron a Camboya.\r\n"
					+ "La Operación Cedar Falls, en enero de 1967, consiguió librar algunos combates; pero el FNLV logró desaparecer. Se capturó gran cantidad de material y se destruyeron muchos túneles, pero el grueso de las fuerzas guerrilleras se libró del ataque.\r\n"
					+ "El Ejército de los Estados Unidos defendió su actuación alegando que había luchado bien. Según ellos, fueron otros factores como las restricciones impuestas por los políticos o la creación de una larga cadena logística las que contribuyeron decididamente a la derrota. Por su parte, Harry G. Summers (1995) lo culpa de la derrota, no tanto por combatir bien o mal, sino por no haber suministrado al ejecutivo estadounidense información precisa de cómo ganar la guerra, además de no haber plasmado correctamente la situación vivida. En este caso, Guerrero et al. (1988b, p. 318) hacen ver que muchas veces ni el propio Ejército conocía dicha situación. Pese a las toneladas de documentos incautados al enemigo en las distintas operaciones, a la dispersión de miles de sensores por la selva, al empleo de los muy sofisticados, para la época, ordenadores de tercera generación, el uso masivo de fotografía aérea y por satélite; no se llegó a conocer la situación real. Las distintas agencias de inteligencia, hasta quince a veces,190​ no fueron conscientes de los preparativos para la ofensiva del Tet, ni la magnitud de los complejos de túneles que tanto ayudaron a ella, ni la existencia o no de un cuartel general del EVN en territorio survietnamita... Así se llegaba en muchas ocasiones a situaciones donde los agentes marcaban como blancos importantes lugares que no sabían realmente si lo eran o no; pero que en caso de serlo les haría subir puntos. Naturalmente esos lugares debían ser inspeccionados por la infantería, que se jugaba la vida por los agentes, en lugar de trabajar estos para evitar esos riesgos.\r\n"
					+ "También se ha indicado la diferencia económica entre los combatientes. Para los hombres provenientes de regiones templadas, la jungla les puede resultar un lugar hostil, amiga de sus enemigos y enemiga suya, como creían los británicos en Birmania durante la Segunda Guerra Mundial.111​ Los vietnamitas debían alimentarse de serpientes, ratas, lagartos y, cuando había suerte, arroz; por esta razón, podían sobrevivir de la selva cuando los alimentos faltaban sin que se resintiera su moral y cuando aquellos llegaban, se vivían momentos de euforia y satisfacción. Mientras, veían a los estadounidenses disfrutar de todo tipo de manjares, disponer de abundante dinero y recibir incluso cervezas frías en pleno campo, lo cual aumentaba la distancia con sus aliados y el odio de sus enemigos.\r\n"
					+ "Otro factor apuntado en varias ocasiones fue la presencia de la prensa y su influencia negativa en la opinión pública.​ En 1965 la mayoría de los estadounidenses estaban a favor de la intervención,​ no fue hasta 1968 cuando los porcentajes comenzaron a invertirse. La publicación de las matanzas como la de My Lay, la presencia casi constante de la guerra en los informativos nocturnos, la revelación de los bombardeos secretos, las acciones del movimiento pacifista hablando con conocimiento de causa por tener a veteranos en sus filas o las declaraciones de algunos políticos cambiando de actitud, caso del propio McNamara, fueron presentando a la Guerra como algo injusto; siendo la subsiguiente falta de apoyo popular decisiva para la derrota.​ Por su parte, Summers (1995) indica que no se puede perder lo que nunca se tuvo. Según él, las operaciones en Vietnam comenzaron sin consultar al pueblo estadounidense, pues la autorización del Congreso era para intervenir en los «alrededores de las bases», y cuando se solicitó el apoyo de la opinión pública esta se negó a concederlo, sorprendiendo a unos dirigentes convencidos de pisar la antesala de la Tercera Guerra Mundial.\r\n"
					+ "Schell (1988, p. 21) y otros autores indican que lo determinante fue la voluntad o falta de voluntad de Vietnam del Sur para existir como país. Los soldados de Vietnam del Sur estaban muy poco motivados,​ mientras la moral en el FNLV y el EVN era muy alta, pese a ser confundida en ocasiones por los estadounidenses con fanatismo o ejemplos del desprecio de los líderes comunistas hacia su pueblo.​ Aunque es cierto que ambos Vietnam eran dictaduras y que fueron muy comunes los casos de atrocidades por parte del EVN y el FNLV,​ tenían un gran deseo de vencer y una fe de hierro en sus sacrificios. Como ejemplo puede servir un testimonio dado al cruzar la Autopista 9, al final de la Ruta Ho Chi Minh:\r\n"
					+ "Mi piel se está despellejando y estoy extenuada... Llegué cojeando y eran las seis en punto cuando crucé la Autopista 9. La carretera no era ancha, pero tuvimos que aligerar el paso para no llamar la atención de los aviones enemigos. Apareció de repente ante mí, una curva difuminada por el sol de verano y sembrada de guijarros. No obstante parecía lo suficientemente intacta. Así crucé la Autopista 9, una vía cuyo recuerdo se perpetuará en la historia de nuestro heroico pueblo.\r\n"
					+ "Duong Thi Xuan Quy\r\n"
					+ "Otro caso de laboriosidad sin desesperanza lo dieron los habitantes de Vietnam del Norte tras los bombardeos. Un miembro de la comunidad lo relataba de la siguiente manera:\r\n"
					+ "Desde que empezaron los bombardeos de la Operación Rolling Thunder, todo el Norte, excepto Hanoi y Haiphong, habían sufrido ataques aéreos de todo tipo: napalm, fósforo blanco, minas antipersona, explosivo de alto poder, defoliantes. Cada puente, cada encrucijada, cada estación de ferrocarril, cada fábrica habían sido atacados, reconstruidos, camuflados, atacados nuevamente, trasladados y reconstruidos nuevamente.\r\n"
					+ "En el aspecto político, el Norte fue más o menos estable, mientras en Saigón se sucedían los golpes militares y los deseos de terminar la guerra cuanto antes, mientras los atentados y ataques se repetían sin que los sudvietnamitas pareciesen querer arriesgarse.​ Por supuesto había excepciones entre los soldados y los oficiales, pero constituían una minoría. Para testigos y escritores como Jonathan Schell (1988, p. 33) en este conflicto no es que la voluntad general fuese un factor de gran importancia, es que resultó el factor decisivo. Por tanto, quebrarla debió haber sido el objetivo perseguido por los Estados Unidos y no lo consiguieron.​\r\n"
					+ "\r\n"
					+ "");break;
			default: System.out.println("Opcion no valida");
			}
			/**
			 * Vuelve a introducír en pantalla las opciones y la opcion para salir del buclé  
			 */
			System.out.println("Vuelva a elegir una de las opciones: [1] Nombre por lo que lo conocen; [2] ¿Por qué paso?; [3] ¿Quienes participaron?; [4] ¿Cuántas bajas?; [5] Origen de la guerra; [6] Los objetivos de la intervencion; [7] Los primeros enfrentamientos de los estadounidenses a gran escala; [8] ¿Por qué Estados Unidos perdió la guerra?");
			System.out.println("Si quiere salir pulse el numero 0:");
			numero=sc.nextInt();
			sc.close();
		}while(numero!=0);
	}

	/**
	 * Crea un String bidimensional llamado test en el que se generan unas preguntas con respuestas.
	 * Las respuestas aparecen en un orden aleatotio, y sus respuestas también.
	 * Después, si el numero de la respuestas es igual a la posicion 1 de la pregunta original, se suma uno al contador
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
		sc.close();
	}


	/**
	 * rellenarBoolean sirve para rellenar los dos booleans en false
	 * @param e, el parámetro de array booleano
	 */
	public static void rellenarBoolean(boolean [] e) {		
		for(int i=0;i<e.length;i++) {
			e[i]=false;
		}
	}
	

	/**
	 * rellenaTest sirve para rellenar el array bidimensional de test con las preguntas y las respuestas.
	 * @param test, el parámetro de array bidimensional con las preguntas y respuestas
	 */
	public static void rellenaTest(String[][] test) {
		test[0][0] = "¿Por qué pasó la guerra?";
		test[0][1] = "Para reunificar Vietnam bajo un gobierno comunista";
		test[0][2] = "Porque EEUU son racistas";
		test[0][3] = "Porque en Vietnam no venden buena comida";
		test[0][4] = "Porque EEUU no habla Vietnamita";

		test[1][0] = "¿Quienes participaron?";
		test[1][1] = "Vietnam del norte y Vietnam del sur junto a sus respectivos aliados";
		test[1][2] = "China y Corea";
		test[1][3] = "Estados unidos y Japón";
		test[1][4] = "Rusia y Ucrania";

		test[2][0] = "¿Cuantas bajas hubo?";
		test[2][1] = "Entre 966.000 y 3.010.000";
		test[2][2] = "3";
		test[2][3] = "No sabe no contesta";
		test[2][4] = "Entre 1.000.000 y 3.023.000";

		test[3][0] = "¿Cual fue el origen?";
		test[3][1] = "Porque estados unidos dio un golpe de estado en Vietnam del sur";
		test[3][2] = "Por culpa de los comunistas";
		test[3][3] = "Por culpa de china";
		test[3][4] = "Gracias a Vietnam del norte";

		test[4][0] = "¿Por qué Estados Unidos perdió la guerra de Vietnam?";
		test[4][1] = "No comprendieron del todo el tipo de guerra y el tipo de pueblo contra quien luchaba.";
		test[4][2] = "Fueron los temores estadounidenses quienes le llevaron a continuar un enfrentamiento hasta la derrota total.";
		test[4][3] = "Las restricciones impuestas por los políticos.";
		test[4][4] = "El Ejército de los Estados Unidos no luchó bien.";

		test[5][0] = "¿Qué postura tenía la CIA sobre la posibilidad de ganar el conflicto en Vietnam?";
		test[5][1] = "Mantuvo una opinión similar al postular la imposibilidad de ganar el conflicto por medios únicamente militares.";
		test[5][2] = "Defendió que el Ejército de los Estados Unidos no luchó bien.";
		test[5][3] = "Consideró que las restricciones impuestas por los políticos fueron las causantes de la derrota.";
		test[5][4] = "Creía que el Ejército de los Estados Unidos no tenía información precisa de cómo ganar la guerra.";

		test[6][0] = "¿Por qué el Triángulo de Hierro nunca fue conocido del todo ni desmantelado?";
		test[6][1] = "Porque estaba repleto de túneles llenos de guerrilleros y soldados del EVN, constituyendo una daga sobre la capital de Vietnam del Sur.";
		test[6][2] = "Porque los militares estadounidenses no tenían buena información sobre la zona.";
		test[6][3] = "Porque los guerrilleros se infiltraron en la zona desmilitarizada.";
		test[6][4] = "Porque la Operación Cedar Falls fracasó.";

		test[7][0] = "¿Qué problema tuvieron los militares estadounidenses al manejar la información en la guerra de Vietnam?";
		test[7][1] = "No prestaron excesiva atención a los discursos de los dirigentes comunistas ni ganaron la confianza de los aldeanos.";
		test[7][2] = "No tuvieron suficientes recursos económicos para financiar la guerra.";
		test[7][3] = "No comprendieron del todo el tipo de guerra y el tipo de pueblo contra quien luchaba.";
		test[7][4] = "No recibieron información precisa de cómo ganar la guerra.";

		test[8][0] = "¿Por qué algunos autores defienden que el presidente Johnson se vio arrastrado por sus consejeros a la guerra de Vietnam?";
		test[8][1] = "Porque Johnson no deseaba inmiscuirse tanto en Vietnam, pero el peso de sus consejeros para que interviniese fue demasiado grande.";
		test[8][2] = "Porque Vietnam del Sur no quería la guerra, sino la reunificación.";
		test[8][3] = "Porque la iniciativa de los combates la llevaban los comunistas.";
		test[8][4] = "Porque los Estados Unidos no comprendieron del todo el tipo de guerra y el tipo de pueblo contra quien luchaba.";

		test[9][0] = "¿Por qué la Operación Attleboro resultó un fracaso?";
		test[9][1] = "Por no contar con buena información.";
		test[9][2] = "Porque el FNLV logró desaparecer.";
		test[9][3] = "Porque el Ejército de los Estados Unidos no luchó bien.";
		test[9][4] = "Porque no había recursos suficientes para financiar la operación.";
	}

	/**
	 * Recetas Método con el cual podemos elegir una receta y la muestra en pantalla.
	 */
	public static void Recetas() {
		/** 
		 * @numReceta Una variable tipo Integer para seleccionar la receta que queremos ver.
		 * @receta Es un array de strings en el que guardamos la innformacion de las recetas.
		 * 
		 */
		int numReceta;
		String [] receta = new String [10];
		receta[0]= "Gofres de pandan: Además de un delicioso dulce, los gofres de pandan llenarán tu cocina de un aroma encantador. El punto extra se lo lleva el centro masticable de estos gofres. El exterior crujiente contrasta con el interior blando. Cada bocado también aporta un sabor a coco, gracias a la adición de crema de coco. ";
		receta[1]= "Ensalada vietnamita de mango: No todos los días se consigue una ensalada de mango con el mismo equilibrio de sabores dulces y ácidos. Pero gracias a esta receta, ¡ahora puedes hacerlo! Además, esta comida callejera de Hanói es muy fácil de preparar. Además de mangos maduros, la ensalada lleva cilantro, chalotas y cacahuetes. Todo se mezcla con un aliño a base de salsa de pescado con notas brillantes de zumo de lima y vinagre de vino de arroz.";
		receta[2]= "Rollitos de primavera vietnamitas: Los coloridos rollitos de primavera vietnamitas demuestran que la comida sana también puede ser satisfactoria y absolutamente deliciosa. Verduras, frutas y proteínas van juntas en envoltorios de papel de arroz. Hay zanahorias, pepinos, aguacate, gambas y mucho más. La idea es enrollarlos como un burrito, cortarlos por la mitad y servirlos con una sencilla pero sabrosa salsa de cacahuete para mojar.";
		receta[3]= "Ensalada vietnamita de fideos con arroz: Esta ensalada de fideos de arroz es otro plato sano y sabroso de Vietnam. Los ingredientes crudos se mezclan con un condimento vietnamita clásico llamado nuoc cham. Los ingredientes crudos se mezclan con un condimento vietnamita clásico, el nuoc cham, que actúa como aliño de ensaladas y contiene casi todos los sabores: dulce, picante, ácido y salado. La belleza de esta receta radica en que apenas requiere horno, lo que la convierte en un plato estupendo para preparar incluso en verano.";
		receta[4]= "Banh Mi: El banh mi es una de las comidas callejeras más apreciadas de Vietnam. Es una baguette blanda y aireada rellena de carne, verduras encurtidas, hierbas y condimentos. Con tantos restaurantes de banh mi en Vietnam y otros países, hay innumerables variaciones de este plato. Esta receta utiliza tofu marinado en lugar de pollo o cerdo para que sea vegetariana. Se añade mayonesa y sriracha para darle más sabor y picante.";
		receta[5]= "Pho: El pho está literalmente en todas partes en Vietnam: restaurantes, calles y hogares.Si no sabe lo que es el pho, es una sopa de fideos hecha con caldo de ternera, jengibre, salsa de pescado, cebolla y un par de especias aromáticas. La clave del mejor caldo pho es hacerlo desde cero. La cocción a fuego lento de la ternera y los huesos puede llevar horas, pero produce un sabor a carne que hace caer la baba. Las especias deben estar tostadas, y la cebolla y el jengibre carbonizados. Así se consigue el auténtico sabor del pho.  ";
		receta[6]= "Crepes vietnamitas. Estas crujientes crepes están rellenas de carne de cerdo, gambas y brotes de soja, por lo que están repletas de sabores y son muy crujientes. Acompáñelos con una salsa de zumo de lima y salsa de pescado, ¡y llevará estos sabrosos crepes fritos a otro nivel!";
		receta[7]= "Pollo a la hierba limón: El pollo al lemongrass vietnamita es sin duda uno de los platos de pollo más sabrosos que existen. Su adobo incluye lemongrass, salsa de pescado, salsa de chile dulce y pasta de curry rojo, entre muchos otros ingredientes. Es tan jugosa que te obsesionará. Me encanta comerlos con arroz jazmín infusionado con coco para una comida completa al estilo asiático.";
		receta[8]= "Fideos vietnamitas con mantequilla y ajo: Con ajo y mantequilla al mismo tiempo, este plato de fideos de 20 minutos es una comida reconfortante para las noches de semana ocupadas. Los fideos de huevo al dente se mezclan con la salsa de mantequilla y ajo, aderezada con un poco de salsa de pescado, salsa de soja, azúcar y salsa de ostras. Añadir queso parmesano como cobertura no es lo tradicional, pero hace que el plato sea más elegante.";
		receta[9]= "Arroz pegajoso con cacahuetes: ¿Arroz con cacahuetes? Este plato de arroz es único. Los sutiles sabores dulce y salado son sencillamente deliciosos. Es una gran combinación para el desayuno o la merienda. Se elabora con arroz glutinoso, de ahí su textura pegajosa. Los ingredientes son cacahuetes tostados picados y semillas de sésamo, mezclados con azúcar y sal para darle más sabor. ¡Qué rico!";
		Scanner input = new Scanner(System.in);
	       do {
	            System.out.println("Ingrese un número entre 1 y " + receta.length + " (o 0 para salir): ");
	            System.out.println("[1]:Gofres de Pandan;[2]:Ensalada vietnamita de mango;[3]:Rollitos de primavera vietnamitas;"
	            		+ "[4]:Ensalada vietnamita de fideos con arroz;[5]:Banh Mi;[6]:Pho;[7]:Crepes vietnamitas;"
	            		+ "[8]:Pollo a la hierba limón;[9]:Fideos vietnamitas con mantequilla y ajo;[10]:Arroz pegajoso con cacahuetes");
	            numReceta = input.nextInt();/*Usamos el scanner para recoger un número*/
	            
	            if (numReceta >= 1 && numReceta <= receta.length) {/*Comprobamos que el número este entre las opciones del array, si es válido, saca del array la receta y la muestra*/
	                System.out.println(receta[numReceta-1] + ": " + receta[numReceta-1]);
	            } else if (numReceta != 0) {/*Si no es válido, informa y deja introducir otro.*/
	                System.out.println("Número inválido. Inténtelo de nuevo.");
	            }
	        } while (numReceta != 0);
	        input.close();
	        System.out.println("Aquí se termina el programa");
	        }
	
		
	/**

	La clase Turismo permite conocer información sobre los sitios turísticos más populares de Vietnam.
	Permite ingresar un número entre 1 y el número de sitios turísticos y se muestra la información del sitio correspondiente.
	Si se ingresa 0, se termina el programa.
	*/
	public static void Turismo() {


		/**
		 * El método main es el punto de entrada del programa.
		 * @param args los argumentos de la línea de comandos
		 */

		    String[] nombresSitios = {
		        "La bahía de Ha Long",
		        "Hoi An",
		        "Ciudad Ho Chi Minh",
		        "Hue",
		        "Sapa",
		        "Nha Trang",
		        "Dalat"
		    };
		    String[] infoSitios = {
		        "Es una bahía costera en el norte de Vietnam que cuenta con más de 1.600 islas e islotes rocosos y es famosa por sus impresionantes paisajes y su rica biodiversidad.",
		        "Es una hermosa ciudad antigua en la costa central de Vietnam, conocida por su arquitectura histórica y su ambiente relajado. Es un destino popular entre los turistas para comprar ropa hecha a medida y para probar la deliciosa cocina local.",
		        "Anteriormente conocida como Saigón, es la ciudad más grande de Vietnam y es un centro cultural y económico importante. Hay muchos lugares para visitar en la ciudad, incluyendo el Palacio de la Reunificación, el Museo de la Guerra de Vietnam y el mercado de Ben Thanh.",
		        "Es una ciudad antigua ubicada en el centro de Vietnam, conocida por su patrimonio cultural y arquitectónico, especialmente la Ciudadela Imperial y la Tumba del Emperador Khai Dinh.",
		        "Es un destino turístico popular en el norte de Vietnam, famoso por sus paisajes montañosos espectaculares, los campos de arroz en terrazas y las numerosas tribus étnicas que habitan en la zona.",
		        "Es una ciudad costera en el centro de Vietnam, conocida por sus playas de arena blanca, sus aguas cristalinas y su animada vida nocturna.",
		        "Es una ciudad montañosa en el centro de Vietnam, famosa por su clima fresco y su paisaje romántico. Es un lugar popular para practicar deportes al aire libre y para explorar las plantaciones de té y café."
		    };
		    
		    Scanner input = new Scanner(System.in);
		    int numSitio;
		    
		    do {
		        System.out.print("Ingrese un número entre 1 y " + nombresSitios.length + " (o 0 para salir): ");
		        numSitio = input.nextInt();
		        
		        if (numSitio >= 1 && numSitio <= nombresSitios.length) {
		            System.out.println(nombresSitios[numSitio-1] + ": " + infoSitios[numSitio-1]);
		        } else if (numSitio != 0) {
		            System.out.println("Número inválido. Inténtelo de nuevo.");
		        }
		    } while (numSitio != 0);
		    
		    System.out.println("Aquí se termina el programa");
		    input.close();		
		    }
	
	}
	    

	
