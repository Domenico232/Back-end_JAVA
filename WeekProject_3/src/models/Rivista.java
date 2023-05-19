package models;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@Entity
public class Rivista extends CatalogItem {

	@Enumerated(EnumType.STRING)
    private Periodicita periodicità;
	public Rivista() {
        // Costruttore senza argomenti richiesto da JPA
    }




	public Rivista(int isbn, String titolo, int annoPubblicazione, int numeroPagine,Periodicita periodicita) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.periodicità = periodicita;
	}

	
	

	public Periodicita getPeriodicità() {
		return periodicità;
	}

	public void setPeriodicità(Periodicita periodicità) {
		this.periodicità = periodicità;
	}
	public enum Periodicita {
        SETTIMANALE,
        MENSILE,
        SEMESTRALE
    }
	@Override
	public String toString() {
		return "Rivista [Periodicità=" + getPeriodicità() + ", Isbn=" + getIsbn() + ", Titolo="
				+ getTitolo() + ", AnnoPubblicazione=" + getAnnoPubblicazione() + ", NumeroPagine="
				+ getNumeroPagine() + super.toString() + "]";
	}
    
}
