package models;

import javax.persistence.Entity;

@Entity
public class Libro extends CatalogItem {

	private String autore;
    private String genere;
    
    public Libro() {
    	
    }
    public Libro(int isbn, String titolo, int annoPubblicazione, int numeroPagine,String autore,String genere) {
		super(isbn, titolo, annoPubblicazione, numeroPagine);
		this.autore = autore;
        this.genere = genere;
		
	}
	public String getAutore() {
		return autore;
	}
	public void setAutore(String autore) {
		this.autore = autore;
	}
	public String getGenere() {
		return genere;
	}
	public void setGenere(String genere) {
		this.genere = genere;
	}
	@Override
	public String toString() {
		return "Libro [Autore=" + getAutore() + ", Genere=" + getGenere() + ", ID=" + getIsbn()
				+ ", Titolo=" + getTitolo() + ", AnnoPubblicazione=" + getAnnoPubblicazione()
				+ ", NumeroPagine=" + getNumeroPagine() + super.toString() + "]";
	}
	
}
