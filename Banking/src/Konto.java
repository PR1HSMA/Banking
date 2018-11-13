
public class Konto {
	private String kontonummer; 
	private double kontostand; 
	private String Kontoinhaber;
	
	
	public Konto(String kontonummer, double kontostand, String kontoinhaber) {
		super();
		this.kontonummer = kontonummer;
		this.kontostand = kontostand;
		Kontoinhaber = kontoinhaber;
	}


	public String getKontonummer() {
		return kontonummer;
	}


	public void setKontonummer(String kontonummer) {
		this.kontonummer = kontonummer;
	}


	public double getKontostand() {
		return kontostand;
	}


	public void setKontostand(double kontostand) {
		this.kontostand = kontostand;
	}


	public String getKontoinhaber() {
		return Kontoinhaber;
	}


	public void setKontoinhaber(String kontoinhaber) {
		Kontoinhaber = kontoinhaber;
	}
	
	public double einAusZahlen(String vorhaben, double aenderung ) {
		if(vorhaben.equalsIgnoreCase("einzahlen")){
		this.setKontostand(getKontostand() + aenderung); 
		}
		else if(vorhaben.equalsIgnoreCase("auszahlen")) {
			this.setKontostand(getKontostand() - aenderung);
		}
		
		
		return this.kontostand;
	}
	
}
