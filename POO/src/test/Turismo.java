package test;

public class Turismo {
	/**
	 * atributos
	 */
	private int num;
	/**
	 * Constructor por defecto
	 */
	Turismo(){}
	
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
	public void infoTurismo() {
		switch(num) {
		case 1: System.out.println("La bahia de Ha Long");break;
		case 2: System.out.println("Hoi An");break;
		case 3: System.out.println("Ciudad Ho Chi Minh");break;
		case 4: System.out.println("Hue");break;
		case 5: System.out.println("Sapa");break;
		case 6: System.out.println("Nha Trang");break;
		case 7: System.out.println("Dalat");break;
		default: System.out.println("Opcion no valida");
		}
	}
}