package models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utente {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int numeroTessera;
    private String nome;
    private String cognome;
    private LocalDate dataNascita;
    
    @OneToMany(mappedBy = "elementoPrestato")
    private List<Prestito> prestiti;
    
	public Utente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Utente(String nome, String cognome, LocalDate dataNascita) {

		this.nome = nome;
		this.cognome = cognome;
		this.dataNascita = dataNascita;
		this.prestiti = new ArrayList<Prestito>();
	}
	
	public void addPrestiti(Prestito pre) {
        this.prestiti.add(pre);
    }
	
	public List<Prestito> getPrestiti() {
        return prestiti;
    }

	public int getNumeroTessera() {
		return numeroTessera;
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

	@Override
	public String toString() {
		return "Utente [nome=" + nome + ", cognome=" + cognome + ", dataNascita=" + dataNascita + "]";
	}

    
   
}