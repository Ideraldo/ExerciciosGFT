package ex3;

import java.util.Scanner;

public class Ex3Main {

	public static void calcularMultiplicadores(int multiplicando,int inicio,int fim) {
		if(multiplicando < 0 && multiplicando > 5000 && inicio < 0 && inicio > 5000 && fim < 0 && fim > 5000) {
			System.out.println("O programa deu erro.\n--- Programa encerrado. ---"); 
		} else if(fim - inicio >= 10) {
			System.out.println("A diferença entre o fim e o início não pode ultrapassar 10.\n--- Programa encerrado. ---");
		} else if(inicio > fim) {
			System.out.println("O inicio não pode ser maior que o fim.\n--- Programa encerrado. ---");
		} else {
			while (fim >= inicio) {
				System.out.println(multiplicando + " X " + inicio + " = " + multiplicando*inicio);
				inicio ++;
			} System.out.println(" --- Programa encerrado ---");
			
		}
	}
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);		
		int multiplicando;
		int inicio;
		int fim;
		
		System.out.println("Digite um número que multiplicará os demais: ");
		multiplicando = leitor.nextInt();
		
		System.out.println("Agora digite o número inicial: ");
		inicio = leitor.nextInt();
		
		System.out.println("Agora digite o número final: ");
		fim = leitor.nextInt();
		
		calcularMultiplicadores(multiplicando, inicio, fim);
		
		leitor.close();
	}

}
