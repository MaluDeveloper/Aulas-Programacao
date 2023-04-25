import java.util.Scanner;

public class AtividadePoo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira os lados do triângulo X ");
		System.out.println();
		System.out.print("Informe o lado A: ");
		int xA = sc.nextInt();
		System.out.print("Informe o lado B: ");
		int xB = sc.nextInt();
		System.out.print("Informe o lado C: ");
		int xC = sc.nextInt();
		System.out.println();

		System.out.print("Insira os lados do triângulo Y ");
		System.out.println();
		System.out.print("Informe o lado A: ");
		int yA = sc.nextInt();
		System.out.print("Informe o lado B: ");
		int yB = sc.nextInt();
		System.out.print("Informe o lado C: ");
		int yC = sc.nextInt();

		double pX = (xA + xB + xC) / 2;
		double area1 = Math.sqrt(pX * (pX - xA) * (pX - xB) * (pX - xC));

		double pY = (yA + yB + yC) / 2;
		double area2 = Math.sqrt(pY * (pY - yA) * (pY - yB) * (pY - yC));

		System.out.println();
		if (area1 >= area2) {
			System.out.println("A área do primeiro triângulo é maior!");
			System.out.println();
		} else {
			System.out.println("A área do segundo triângulo é maior!");
		}

		System.out.println("Resultados - Área 1:" + area1 + " . Área 2: " + area2);
		
	}
	
}
