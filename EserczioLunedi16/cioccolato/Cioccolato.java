package esercizio.lunedi16;

public class Cioccolato {
	protected String tipoCioccolato;
	protected double percentualeCacao;
	public static final int MAX_ = 100; 

	public Cioccolato(String tipoCioccolato, double percentualeCacao) {
	this.tipoCioccolato = tipoCioccolato;
	this.percentualeCacao = percentualeCacao;
	}

	public void produce() {
	System.out.println("Produzione cioccolato - Tipo: " + tipoCioccolato + ", Percentuale di cacao: " + percentualeCacao + "%");
	}

	public String getTipoCioccolato() {
	return tipoCioccolato;
	}

	public double getPercentualeCacao() {
	return percentualeCacao;
	}
	}

