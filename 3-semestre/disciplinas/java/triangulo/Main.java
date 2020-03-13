import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		/* declare variables */
		Scanner scan = new Scanner(System.in);
		float lado1;
		float lado2;
		float lado3;

		/* read variables */
		System.out.println("Digite o lado 1 do triângulo:");
		lado1 = scan.nextFloat();
		System.out.println("Digite o lado 2 do triângulo:");
		lado2 = scan.nextFloat();
		System.out.println("Digite o lado 3 do triângulo:");
		lado3 = scan.nextFloat();

		Triangulo triangulo1 = new Triangulo(lado1, lado2, lado3);

		boolean eh_triangulo = triangulo1.ehTriangulo();
		byte tipo_triangulo = triangulo1.tipoTriangulo();

		String output;

		if(eh_triangulo) {
			output = "Seus dados formam um triângulo.\n";
		} else {
			output = "Seus dados NÃO formam um triângulo.\n";
		}

		if(tipo_triangulo == 0) {
			output += "Seu triângulo é equilátero.";
		} else if(tipo_triangulo == 1) {
			output += "Seu triângulo é isóceles.";
		} else if(tipo_triangulo == 2) {
			output += "Seu triângulo é escaleno.";
		}

		System.out.println(output);

	}
}
