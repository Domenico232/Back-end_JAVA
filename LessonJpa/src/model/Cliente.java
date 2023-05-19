package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clienti")
public class Cliente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numero_cliente")
	private Integer numero_cliente;
	@Column(name="nome")
	private String nome;
	@Column(nullable = false, name="conome")
	private String cognome;
	@Column(nullable = false, name="data")
	private LocalDate data_nascita;
	@Column(nullable = false, name="residenza")
	private String regione_residenza;
	
	
	public Cliente() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cliente(Integer numero_cliente, String nome, String cognome, LocalDate data_nascita,
			String regione_residenza) {
		super();
		this.numero_cliente = numero_cliente;
		this.nome = nome;
		this.cognome = cognome;
		this.data_nascita = data_nascita;
		this.regione_residenza = regione_residenza;
	}

	public Integer getNumero_cliente() {
		return numero_cliente;
	}
	public void setNumero_cliente(Integer numero_cliente) {
		this.numero_cliente = numero_cliente;
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
	public LocalDate getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(LocalDate data_nascita) {
		this.data_nascita = data_nascita;
	}
	public String getRegione_residenza() {
		return regione_residenza;
	}
	public void setRegione_residenza(String regione_residenza) {
		this.regione_residenza = regione_residenza;
	}
	
	

}
