package esercizio.lunedi16;

	public class Cioccolatino extends Cioccolato {
		private String forma;
		private String ripieno;
		private int quantitaProdotta;

		public Cioccolatino(String tipoCioccolato, double percentualeCacao, String forma, String ripieno, int quantitaProdotta) {
		super(tipoCioccolato, percentualeCacao);
		this.forma = forma;
		this.ripieno = ripieno;
		this.quantitaProdotta = quantitaProdotta;
		}

		@Override
		public void produce() {
		super.produce();
		System.out.println("Caratteristiche cioccolatino -> Forma: " + forma + ", Ripieno: " + ripieno);

		
		int cioccolatoConsumato = quantitaProdotta * 2;
		System.out.println("Cioccolatini prodotti: " + quantitaProdotta);
		System.out.println("Cioccolato totale impiegato: " + cioccolatoConsumato + " su un massimo di " + MAX_);
		}
		}


