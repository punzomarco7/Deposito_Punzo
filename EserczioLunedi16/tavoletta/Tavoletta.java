package esercizio.lunedi16;
public class Tavoletta extends Cioccolato {
private double peso; 
private boolean haAggiunte;
private String tipoAggiunte; 
private int grandezza;

public Tavoletta(String tipoCioccolato, double percentualeCacao, double peso, boolean haAggiunte, String tipoAggiunte, int grandezza) {
super(tipoCioccolato, percentualeCacao);
this.peso = peso;
this.haAggiunte = haAggiunte;
this.tipoAggiunte = tipoAggiunte;

if (grandezza >= 4 && grandezza <= 24) {
this.grandezza = grandezza;
} else {
this.grandezza = 12;
}
}

@Override
public void produce() {
super.produce();
System.out.println("--- Dettagli Tavoletta ---");
System.out.println("Peso: " + peso + "g");
System.out.println("Aggiunte: " + (haAggiunte ? tipoAggiunte : "Nessuna"));
System.out.println("Composta da " + grandezza + " pezzi/quadratini (Grandezza tavoletta)");
}
}