import java.util.Scanner;

public class TesteOn1 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// ...
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("a = ");
		int a = entrada.nextInt();
		System.out.print("b = ");
		int b = entrada.nextInt();

		int soma = somaValoresEntreAeB(a, b);
		System.out.println("A soma dos valores entre " + a + " e " + b + " = " + soma);
		
		int [][] mat = {{1, 2, 3}, {-4, 8, 0}, {9, -5, 0}};
		int quantos = totalValoresNegativos(mat);
		System.out.println("Na matriz mat existem " + quantos + " valores negativos.");
		
		int meios = totalValoresEntreAeB(a, b, mat);
		System.out.println("Na matriz mat existem " + meios + " valores entre " + a + " e " + b);
	}

	
	private static int totalValoresEntreAeB(int a, int b, int[][] mat) {
		// TODO Auto-generated method stub
		return 0;
	}


	private static int totalValoresNegativos(int[][] mat) {
		// TODO Auto-generated method stub
		return 0;
	}




}
