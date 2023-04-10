
public class AulaContadorPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int valor = 1, contadorPar = 0, somaPar = 0;

		while (valor <= 5) {

			if (valor % 2 == 0) {
				contadorPar = contadorPar + 1;
				somaPar = somaPar + valor;
			}
			valor++;
		}
		System.out.println("Quantidade de Pares : " + contadorPar);
		System.out.println("Soma de Pares : " + somaPar);
	}

}
