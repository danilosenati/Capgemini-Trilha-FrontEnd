package modulo1;

public class Funcoes {

	public static void main(String[] args) {
		int resultado = soma(2,4);
		System.out.println(resultado);
	}

	public static int soma(int num1, int num2) {
		System.out.println("Resultado de "+num1+" + "+num2);
		return num1 + num2;
	}
}
