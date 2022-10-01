
public class Ejercicio4App {

	public static void main(String[] args) {
		int N = 23;
		System.out.println("El valor inicial de N es " + N);
		for(int i = 1; i<=77;i++) {
			N++;
		}
		System.out.println("N + 77 = " + N);
		for(int i=0; i<3; i++) {
			N--;
		}
		System.out.println("N - 3 = " + N);
		N = N*2;
		System.out.println("N*2 = " + N);
	}

}
