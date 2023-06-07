package test;

public class Receta {
	/**
	 * atributos
	 */
	private int num;
	/**
	 * Constructor por defecto
	 */
	Receta(){}
	/**
	 * Metodo set que cambia el numero del objeto por el numero que se pasa como parametro
	 * @param n = nuevo valor del numero
	 */
	public void setNumero(int n) {
		this.num=n;
	}
	/**
	 * Rellena un switch con diferente informacion por cada caso
	 */
	public void infoReceta() {
		switch(num) {
		case 0: System.out.println("");break;
		case 1: System.out.println("Gofres de pandan:"
				+ "Adem�s de un delicioso dulce, los gofres de pandan llenar�n tu cocina de un aroma encantador."
				+ "El punto extra se lo lleva el centro masticable de estos gofres."
				+ "El exterior crujiente contrasta con el interior blando."
				+ "Cada bocado tambi�n aporta un sabor a coco, gracias a la adici�n de crema de coco.");break;
		case 2: System.out.println("Ensalada vietnamita de mango:"
				+ "No todos los di�s se consigue una ensalada de mango con el mismmo equilibrio de sabores dulces y �cidos."
				+ "Pero gracias a esta receta, �ahora puedes hacerlo! Adem�s, esta comida callejera de Han�i es muy f�cil de preparar."
				+ "Adem�s de mangos maduros, la ensalada lleva cilantro, chalotas y cacahuetes."
				+ "Todo se mezcla con un ali�o a base de salsa de pescado con notas brillantes de zumo de lima y vinagre de vino de arroz.");break;
		case 3: System.out.println("Rollitos de primavera vietnamitas:"
				+ "Los coloridos rollitos de primavera vietnamitas demuestran que la comida sana tambi�n puede ser satisfactoria y absolutamente deliciosa."
				+ "Verduras, frutas y prote�nas van juntas en envoltorios de papel de arroz."
				+ "Hay zanahorias, pepinos, aguacate, gambas y mucho m�s."
				+ "La idea es enrollarlos como un burrito, cortarlos por la mitad y servirlos con una sencilla pero sabrosa salsa de cacahuete para mojar.");break;
		case 4: System.out.println("Ensalada vietnamita de fideos con arroz:"
				+ "Esta ensalada de fideos de arroz es otro plato sano y sabroso de Vietnam."
				+ "Los ingredientes crudos se mezclan con un condimento vietnamita cl�sico, el nuoc cham, que acta como ali�o de ensaladas y contiene casi todos los sabores: dulce, picante, �cido y salado."
				+ "La belleza de esta receta radica en que apenas requiere horno, lo que la convierte en un plato estupendo para preparar incluso en verano.");break;
		case 5: System.out.println("Banh Mi:"
				+ "E banh mi es una de las comidas callejeras m�s apreciadas de Vietnam."
				+ "Es una baguette blanda y aireada rellena de carne, verduras encurtidas, hierbas y condimentos.cCon tantos restaurantes de banh mi en Vietnam y otros pa�ses, hay innumerables variaciones de este plato. Esta receta utiliza tofu marinado en lugar de pollo o cerdo para darle m�s sabor y picante.");break;
		case 6: System.out.println("Pho: El pho est� literalmente en todas partes en Vietnam: restaurantes, calles y hogares.Si no sabe lo que es el pho, es una sopa de fideos hecha con caldo de ternera, jengibre, salsa de pescado, cebolla y un par de especias arom�ticas. La clave del mejor caldo pho es hacerlo desde cero. La cocci�n a fuego lento de la ternera y los huesos puede llevar horas, pero produce un sabor a carne que hace caer la baba. Las especias deben estar tostadas, y la cebolla y el jengibre carbonizados. As� se consigue el aut�ntico sabor del pho.  ");break;
		case 7: System.out.println("Arroz pegajoso con cacahuetes: �Arroz con cacahuetes? Este plato de arroz es �nico. Los sutiles sabores dulce y salado son sencillamente deliciosos. Es una gran combinaci�n para el desayuno o la merienda. Se elabora con arroz glutinoso, de ah� su textura pegajosa. Los ingredientes son cacahuetes tostados picados y semillas de s�samo, mezclados con az�car y sal para darle m�s sabor. �Qu� rico!\"");break;
		case 8: System.out.println("Fideos vietnamitas con mantequilla y ajo: Con ajo y mantequilla al mismo tiempo, este plato de fideos de 20 minutos es una comida reconfortante para las noches de semana ocupadas. Los fideos de huevo al dente se mezclan con la salsa de mantequilla y ajo, aderezada con un poco de salsa de pescado, salsa de soja, az�car y salsa de ostras. A�adir queso parmesano como cobertura no es lo tradicional, pero hace que el plato sea m�s elegante.");break;
		case 9: System.out.println("Pollo a la hierba lim�n: El pollo al lemongrass vietnamita es sin duda uno de los platos de pollo m�s sabrosos que existen. Su adobo incluye lemongrass, salsa de pescado, salsa de chile dulce y pasta de curry rojo, entre muchos otros ingredientes. Es tan jugosa que te obsesionar�. Me encanta comerlos con arroz jazm�n infusionado con coco para una comida completa al estilo asi�tico.");break;
		case 10: System.out.println("Crepes vietnamitas. Estas crujientes crepes est�n rellenas de carne de cerdo, gambas y brotes de soja, por lo que est�n repletas de sabores y son muy crujientes. Acomp��elos con una salsa de zumo de lima y salsa de pescado, �y llevar� estos sabrosos crepes fritos a otro nivel!");
		default: System.out.println("Opcion no valida");
		}
	}
}