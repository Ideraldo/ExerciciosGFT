package ex1eEx2;

public class InvestimentoSemIR extends Investimento {

	public InvestimentoSemIR(double valorInicial, double jurosMensais) {
		super(valorInicial, jurosMensais);
	}
	
	public double calcularLucro(int meses){
		if(valorInicial >= 1000) {		
			contaPotenciacao = Math.pow(1+jurosMensais, meses);
			return (valorInicial*contaPotenciacao-valorInicial);
		} else {
			System.out.println("O valor inicial não pode ser menor que R$1000");
			return 0;
		}
	}
}
