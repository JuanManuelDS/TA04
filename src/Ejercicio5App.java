
public class Ejercicio5App {

	public static void main(String[] args) {
		int A = 10, B = 3, C = 7, D=9;
		System.out.println("A = " + A + ", B = " + B + ", C = " + C + " y D = " + D);
		B=C;
		System.out.println("Ahora el valor de B es " + B);
		C=A;
		System.out.println("Ahora el valor de C es " + C);
		A=D;
		System.out.println("Ahora el valor de A es " + A);
		D=B;
		System.out.println("Ahora el valor de D es " + D);
		

	}

}
