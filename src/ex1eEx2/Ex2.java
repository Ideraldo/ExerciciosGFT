package ex1eEx2;

import java.util.Scanner;

//Exercicio 2 - Imprimindo os valores do mes 1 ao 36
public class Ex2 {

	public static void main(String[] args) {
		
		int valorInicial;
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o valor inicial: ");
		valorInicial = leitor.nextInt();
		
		Investimento InvestimentoComIR = new InvestimentoComIR(valorInicial, 0.0035);
		Investimento InvestimentoSemIR = new InvestimentoSemIR(valorInicial, 0.003);
		
		for(int mes=1; mes<37; mes++) {
			
			System.out.println("Mês: " + mes + "Investimento sem IR: " + InvestimentoSemIR.calcularLucro(mes) + " | Investimento com IR: " + InvestimentoComIR.calcularLucro(mes));
			
		}
		
		leitor.close();
	}

}
