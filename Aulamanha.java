import java.util.Scanner;

public class Aulamanha {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite sua idade:");
		int idade = sc.nextInt();
		if (idade >= 18) {
			System.out.println("� maior de 18!");

		} else {
			System.out.println("N�o � maior de 18!");

		}

		sc.close();
	}
}
