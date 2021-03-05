package ex1eEx2;
import java.lang.Math;

public class Investimento {
	protected double valorInicial;
	protected double jurosMensais;
	protected double contaPotenciacao;

	public Investimento (double valorInicial, double jurosMensais) {
		this.valorInicial = valorInicial;
		this.jurosMensais = jurosMensais;
	}
	
	public double getValorInicial(){
		return valorInicial;
	}
	
	public double getJurosMensais(){
		return jurosMensais;
	}
	
	public double calcularLucro(int meses){
		contaPotenciacao = Math.pow(1+jurosMensais, meses);
		return (valorInicial*contaPotenciacao-valorInicial);
	}
}
