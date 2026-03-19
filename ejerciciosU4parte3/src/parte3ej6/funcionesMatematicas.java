package parte3ej6;

public class funcionesMatematicas {

	static int sumatorio(int numero) {
		int sumaHasta = 0;
		for (int i = 1; i <= numero; i++) {
			sumaHasta += i;
		}
		return sumaHasta;
	}

	static double potencia(double n, int a) {
		return Math.pow(a, n);
	}

	static int serieFibonacci(int numero) {
		if (numero <= 1) {
			return numero;
		}

		int a = 0, b = 1, c = 0;
		for (int i = 2; i <= numero; i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

}
