package controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import models.CatalogItem;
import models.Libro;
import models.Prestito;
import models.Rivista;
import models.Rivista.Periodicita;
import models.Utente;

public class Main {
	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("WeekProject3");
	static EntityManager em = emf.createEntityManager();

	public static void main(String[] args) {
		// add items
		/*LocalDate dat = LocalDate.of(1999, 10, 14);
		Libro n = new Libro();
		n.setTitolo("tre");
		n.setAutore("teyee");
		n.setAnnoPubblicazione(1995);
		n.setGenere("fant");
		n.setNumeroPagine(123);
		Rivista s = new Rivista();
		s.setTitolo("magaz");
		s.setAnnoPubblicazione(1998);
		s.setPeriodicità(Periodicita.SEMESTRALE);
		s.setNumeroPagine(123);
		addMagazine(s);
		Utente i = new Utente("giorgio","vanni",LocalDate.of(1999, 10, 14));
		addUser(i);
		Prestito p = new Prestito(findUser(1),s,dat,dat.plusDays(30),dat.plusDays(42));
		addloan(p);
		Prestito pre = findLoan(4);
		Prestito pre2 = findLoan(3); */
		
		
		Utente lio = findUser(1);
		//lio.addPrestiti(pre);
		editUser(lio);
		
		// ricerca elementi prestati all utente
		lio.getPrestiti().forEach(e->System.out.println(e.getElementoPrestato()));
		
		Prestito p = new Prestito(findUser(1),findItem(3),LocalDate.of(2015, 10, 14),LocalDate.of(2015, 10, 14).plusDays(30),LocalDate.of(2015, 10, 20));
		addloan(p);
		//ricerca prestiti scaduti
		
		for(Prestito e : allLoans()) {
			if (e.getDataRestituzioneEffettiva().isAfter(e.getDataRestituzionePrevista()) || e.getDataRestituzioneEffettiva() == null ) {
				System.out.println(e);
			}
		}
		
		System.out.println("");
		System.out.println("");
		
		Scanner input = new Scanner(System.in);
		boolean con = true;
		
		while (con) {
			
			TypedQuery<CatalogItem> query = em.createNamedQuery("CatalogItem.findAll", CatalogItem.class);
			List<CatalogItem> resultList = query.getResultList();
			resultList.forEach(e->System.out.println(e));
			System.out.println("");
			System.out.println("scegli numero da 1 a 5 (0 per chiudere l'applicazione): ");
			System.out.println("1 per cancellare tramite ID");
			System.out.println("2 per ricerca tramite ID");
			System.out.println("3 per ricerca tramite anno");
			System.out.println("4 per ricerca tramite nome autore");
			System.out.println("5 per ricerca tramite Titolo");
			System.out.println("");
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
				System.out.println("App Chiusa");
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

	private static void addUser(Utente utente) {
		em.getTransaction().begin();
		em.persist(utente);
		em.getTransaction().commit();
		
	}

	public static void addloan(Prestito prestito) {
		em.getTransaction().begin();
		em.persist(prestito);
		em.getTransaction().commit();

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
	public static void editUser(Utente utente) {

		em.getTransaction().begin();
		em.merge(utente);
		em.getTransaction().commit();

	}
	public static void editLoan(Prestito prestito) {

		em.getTransaction().begin();
		em.merge(prestito);
		em.getTransaction().commit();

	}
	public static Prestito findLoan(int primarykey) {

		em.getTransaction().begin();
		Prestito entity = em.find(Prestito.class, primarykey);
		em.getTransaction().commit();

		return entity;
	}
	public static Utente findUser(int primarykey) {

		em.getTransaction().begin();
		Utente entity = em.find(Utente.class, primarykey);
		em.getTransaction().commit();

		return entity;
	}

	public static CatalogItem findItem(int primarykey) {

		em.getTransaction().begin();
		CatalogItem entity = em.find(CatalogItem.class, primarykey);
		em.getTransaction().commit();

		return entity;
	}
	
	public static List<Prestito> allLoans() {
		Query q = em.createNamedQuery("Prestito.findAll");
		
		return q.getResultList();

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
