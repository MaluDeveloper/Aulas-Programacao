import java.util.Scanner;

public class Atividadecasal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a idade de João:");
		int joao = sc.nextInt();

		System.out.println("Digite a idade de José:");
		int jose = sc.nextInt();

		System.out.println("Digite a idade de Maria:");
		int maria = sc.nextInt();

		if ((joao < jose) && (joao < maria)) {
			System.out.println("João é o caçula!");
		} else {
			if ((jose < joao) && (jose < maria)) {
				System.out.println("João é o caçula!");
			} else {
				System.out.println("Maria é a caçula!");
			}
			sc.close();
		}

	}

}
