package modulo1;

public class Vetores {

	public static void main(String[] args) {
		int [] numeros = {9, 10, 12, 22, 2};
		int maior = numeros[0];
		int menor = numeros[0];
		int media = 0;
		
		for(int i = 0; i<numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
//				System.out.println("MAior: " + maior);
			}
			if(numeros[i] < menor) {
				menor = numeros[i];
//				System.out.println("Menor" + menor);
			}
			
			media = media + numeros[i];
		}
		
		System.out.println("Número maior: " + maior);
		System.out.println("Número menor: "+ menor);
		System.out.println("Media: " + media/numeros.length);
	}

}
