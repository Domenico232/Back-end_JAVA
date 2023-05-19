package controller;
import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;

public class Main {	
	
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("LessonJpa");
	static EntityManager em = emf.createEntityManager();
	public static void main(String[] args) {
		try {
			Cliente c = new Cliente();
			c.setNome("ciosal");
			c.setCognome("marrone");
			c.setData_nascita(LocalDate.of(1300, 10, 10));
			c.setRegione_residenza("puglia");
			Cliente f = readCliente(1);
			System.out.println(f.getNome());
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			em.close();
			emf.close();
		}
		
	}
	public static void insCliente(Cliente v) {
		em.getTransaction().begin();
		em.persist(v);
		em.getTransaction().commit();
	}
	public static void modCliente(Cliente v) {
		em.getTransaction().begin();
		em.merge(v);
		em.getTransaction().commit();
	}
	public static void removeCliente(Cliente v) {
		em.getTransaction().begin();
		em.remove(v);
		em.getTransaction().commit();
	}
	public static Cliente readCliente(int id) {
		em.getTransaction().begin();
		Cliente c = em.find(Cliente.class, id);
		em.getTransaction().commit();
		return c;
	}

}
