package ex1eEx2;
//Exercicio 1 - Imprimindo os valores pedidos.

public class ImprimindoValores {

	public static void main(String[] args) {
		Investimento investimentoComIR = new InvestimentoComIR(5000, 0.012);
		Investimento InvestimentoSemIR = new InvestimentoSemIR(3000, 0.007);
			
		System.out.println(InvestimentoSemIR.calcularLucro(17));
		System.out.println(investimentoComIR.calcularLucro(10));
	}

}
