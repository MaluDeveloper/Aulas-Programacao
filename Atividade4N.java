import java.util.Scanner;

public class Atividade4N {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] num = new int[4];
		int soma = 0;

		for (int i = 0; i <= 3; i++) {
			System.out.println("Informe uma nota:");
			num[i] = sc.nextInt();
			soma = soma + num[i];
		}

		double media = soma / 4;
		System.out.println("Informe uma nota:" + media);

		sc.close();
	}

}
