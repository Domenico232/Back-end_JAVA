package controller;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import models.CatalogItem;
import models.Libro;
import models.Rivista;
import models.Rivista.Periodicita;

public class Main {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("WeekProject3");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		
		Libro n = new Libro();
		n.setTitolo("tre");
		n.setAutore("teyee");
		n.setAnnoPubblicazione(1995);
		n.setGenere("fant");
		n.setNumeroPagine(123);
		addBook(n);
		
		Rivista s = new Rivista();
		s.setTitolo("magaz");
		s.setAnnoPubblicazione(1998);
		s.setPeriodicità(Periodicita.SEMESTRALE);
		s.setNumeroPagine(123);
		addMagazine(s);
		
		Scanner input = new Scanner(System.in);
		boolean con = true;
		
		while (con) {
			
			TypedQuery<CatalogItem> query = em.createNamedQuery("CatalogItem.findAll", CatalogItem.class);
			List<CatalogItem> resultList = query.getResultList();
			resultList.forEach(e->System.out.println(e));
			System.out.println("");
			System.out.println("scegli numero da 1 a 5 (0 per chiudere l'applicazione): ");
			int ch = input.nextInt();

			switch (ch) {

			case 2:
				System.out.println("inserire ID da cancellare:");
				int id = input.nextInt();
				CatalogItem d = findItem(id);
				removeItem(d);
				break;

			case 3:
				System.out.println("inserire ID per la ricerca:");
				int idsearch = input.nextInt();
				System.out.println(findItem(idsearch));
				
				System.out.println("Premi 'invio' per continuare:");
				try {
					int read = System.in.read(new byte[2]);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			case 4:
				System.out.println("inserire anno per la ricerca:");
				int YearSearch = input.nextInt();
				findYearItem(YearSearch).forEach(e->System.out.println(e));
				
				
				System.out.println("Premi 'invio' per continuare:");
				try {
					int read = System.in.read(new byte[2]);
				} catch (IOException e1) {
					e1.printStackTrace();
				}

				break;

			case 5:
				input.nextLine();
				System.out.println("inserire nome Autore per la ricerca:");
				String authorSearch = input.nextLine();
				findAuthor(authorSearch).forEach(e->System.out.println(e));
				System.out.println("Premi 'invio' per continuare:");
				try {
					int read = System.in.read(new byte[2]);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
				
			case 6:
				input.nextLine();
				System.out.println("inserire Titolo per la ricerca:");
				String titleSearch = input.nextLine();
				findPartial(titleSearch).forEach(e->System.out.println(e));
				
				System.out.println("Premi 'invio' per continuare:");
				try {
					int read = System.in.read(new byte[2]);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;
			case 0:
				System.out.println("Player Chiuso");
				con = !con;
				break;

			default:
				System.out.println("Unexpected value: " + ch);
				System.out.println("Inserisci nuovo valore:");
				ch = input.nextInt();
				break;
			}
		}
		input.close();
		em.close();
		emf.close();

	}

	public static void addBook(Libro libro) {
		em.getTransaction().begin();
		em.persist(libro);
		em.getTransaction().commit();

	}

	public static void addMagazine(Rivista rivista) {

		em.getTransaction().begin();
		em.persist(rivista);
		em.getTransaction().commit();

	}
	public static void removeItem(CatalogItem it) {

		em.getTransaction().begin();
		em.remove(it);
		em.getTransaction().commit();

	}

	public static void editBook(Libro libro) {

		em.getTransaction().begin();
		em.merge(libro);
		em.getTransaction().commit();

	}

	public static CatalogItem findItem(int primarykey) {

		em.getTransaction().begin();
		CatalogItem entity = em.find(CatalogItem.class, primarykey);
		em.getTransaction().commit();

		return entity;
	}

	public static List<CatalogItem> findYearItem(int annoPubblicazione) {
		Query q = em.createNamedQuery("CatalogItemByYear.findAll");
		q.setParameter("annopubblicazione_item", annoPubblicazione);
		return q.getResultList();

	}

	public static List<CatalogItem> findPartial(String part) {
		Query q = em.createNamedQuery("CatalogItemByTitle.findAll");
		q.setParameter("pattern", "%" + part + "%");
		return q.getResultList();

	}

	public static List<CatalogItem> findAuthor(String part) {
		Query q = em.createNamedQuery("CatalogItemByAuthor.findAll");
		q.setParameter("pattern", "%" + part + "%");
		return q.getResultList();

	}

}
