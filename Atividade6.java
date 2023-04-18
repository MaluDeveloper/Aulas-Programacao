import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] A = new int[5];
		int[] B = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Informe uma nota:");
			A[i] = sc.nextInt();
			B[i] = A[i];
		}
		
		System.out.println();
		System.out.println("Valores do vetor A");
		for(int i = 0; i < A.length; i++) {
		System.out.println("valor:"+ A[i]);
		
		}
		
		System.out.println();
		System.out.println("Valores do vetor B");
		for(int i = 0; i < B.length; i++) {
		System.out.println("valor:"+ B[i]);
		
	}
		sc.close();

}
}
