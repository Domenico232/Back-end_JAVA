package models;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utente {
    @Id
    private Long numeroTessera;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    @OneToMany(mappedBy = "elementoPrestato")
    private List<Prestito> prestiti;
	public Utente() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utente(Long numeroTessera, String nome, String cognome, LocalDate dataNascita) {
		super();
		this.numeroTessera = numeroTessera;
		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
	}

	public Long getNumeroTessera() {
		return numeroTessera;
	}

	public void setNumeroTessera(Long numeroTessera) {
		this.numeroTessera = numeroTessera;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public LocalDate getDataNascita() {
		return dataNascita;
	}

	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
	}
    
   
}