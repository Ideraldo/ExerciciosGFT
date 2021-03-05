package ex4;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
		int numeroDigitado;
		int somatoria = 0;
		
		Scanner leitor = new Scanner(System.in);
		
		 while(somatoria <= 157) {
			System.out.println("Digite um numero: ");
			numeroDigitado = leitor.nextInt();
			if(numeroDigitado < 0) {
				System.out.println("Números negativos não são permitidos");
			} else {
				somatoria = somatoria + numeroDigitado;
			}			
		}
		 System.out.println("O somatorio foi de: " + somatoria);
		 
		 leitor.close();
	}

}
