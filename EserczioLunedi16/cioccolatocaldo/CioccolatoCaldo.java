package esercizio.lunedi16;
public class CioccolatoCaldo extends Cioccolato {
private double temperatura; 
private String densita; 
private int quantitaImpiegata; 

public CioccolatoCaldo(String tipoCioccolato, double percentualeCacao, double temperatura, String densita, int quantitaImpiegata) {
super(tipoCioccolato, percentualeCacao);
this.temperatura = temperatura;
this.densita = densita;

this.quantitaImpiegata = Math.max(quantitaImpiegata, 20);
}

@Override
public void produce() {
super.produce();
System.out.println("--- Dettagli Cioccolata Calda ---");
System.out.println("Temperatura: " + temperatura + "°C");
System.out.println("Densità: " + densita);
System.out.println("Cioccolato impiegato per la preparazione: " + quantitaImpiegata + " (Minimo richiesto: 20)");
}
}