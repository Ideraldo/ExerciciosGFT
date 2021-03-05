package ex1eEx2;

public class InvestimentoComIR extends Investimento {
	public InvestimentoComIR(double valorInicial, double jurosMensais) {
		super(valorInicial, jurosMensais);
	}

	public double calcularLucro(int meses){
		if(meses < 6) {
			contaPotenciacao = Math.pow(1+jurosMensais, meses);
			return (valorInicial*contaPotenciacao-valorInicial) - (valorInicial*contaPotenciacao-valorInicial)*0.225; // DESCONTAR 22,5%
		} else if(meses >= 6 && meses < 12) {
			contaPotenciacao = Math.pow(1+jurosMensais, meses);
			return (valorInicial*contaPotenciacao-valorInicial) - (valorInicial*contaPotenciacao-valorInicial) * 0.2;// DESCONTAR 20%
		} else if(meses >= 12 && meses <24) {
			contaPotenciacao = Math.pow(1+jurosMensais, meses);
			return (valorInicial*contaPotenciacao-valorInicial) - (valorInicial*contaPotenciacao-valorInicial) * 0.175; // DESCONTAR 17.5%
		} else {
			contaPotenciacao = Math.pow(1+jurosMensais, meses);
			return (valorInicial*contaPotenciacao-valorInicial) - (valorInicial*contaPotenciacao-valorInicial) * 0.15; // DESCONTAR 15%
		}
	}
	
}
