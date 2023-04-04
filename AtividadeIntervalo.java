import java.util.Scanner;

public class Intervalo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor:");
		int valor1 = sc.nextInt();

		if (valor1 > 100) {
			if (valor1 < 200) {
				System.out.println("Está no Intervalo!");
			} else {
				System.out.println("Está fora do Intervalo!");
			}
		} else {
			System.out.println("Está fora do Intervalo!");

		}
		sc.close();
	}

}
