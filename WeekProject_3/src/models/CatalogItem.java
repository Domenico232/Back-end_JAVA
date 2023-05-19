package models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

@Entity
@NamedQuery(name = "CatalogItem.findAll", query = "SELECT e FROM CatalogItem e")
@NamedQuery(name = "CatalogItemByYear.findAll", query = "SELECT e FROM CatalogItem e WHERE e.annoPubblicazione = :annopubblicazione_item")
@NamedQuery(name = "CatalogItemByTitle.findAll", query = "SELECT e FROM CatalogItem e WHERE e.titolo LIKE :pattern")
@NamedQuery(name = "CatalogItemByAuthor.findAll", query = "SELECT e FROM CatalogItem e WHERE e.autore LIKE :pattern")
//@Inheritance(strategy = InheritanceType.JOINED)
public abstract class CatalogItem {
	 	@Id
	 	@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int isbn;
	    private String titolo;
	    private int annoPubblicazione;
	    private int numeroPagine;
	    
	    @OneToOne
	    private Prestito prestiti;
	    public CatalogItem() {
			
		}
		public CatalogItem(int isbn,String titolo, int annoPubblicazione, int numeroPagine) {
			this.isbn=isbn;
			this.titolo = titolo;
			this.annoPubblicazione = annoPubblicazione;
			this.numeroPagine = numeroPagine;
		}
		public int getIsbn() {
			return isbn;
		}
		public void setIsbn(int isbn) {
			this.isbn = isbn;
		}
		public String getTitolo() {
			return titolo;
		}
		public void setTitolo(String titolo) {
			this.titolo = titolo;
		}
		public int getAnnoPubblicazione() {
			return annoPubblicazione;
		}
		public void setAnnoPubblicazione(int annoPubblicazione) {
			this.annoPubblicazione = annoPubblicazione;
		}
		public int getNumeroPagine() {
			return numeroPagine;
		}
		public void setNumeroPagine(int numeroPagine) {
			this.numeroPagine = numeroPagine;
		}
	    
}
