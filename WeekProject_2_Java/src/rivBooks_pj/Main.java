package rivBooks_pj;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;

public class Main {
	private static String ggs = "";
	private static String ggsMag = "";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<MagBooks> magBooksList = new ArrayList<>();

		try {
			bookreader().forEach(e -> magBooksList.add((Books) e));

		} catch (IOException e) {

			MagBooks it = new Books(12L, "IT", LocalDate.of(2015, 10, 10), 150, "Stephen", "Horror");
			magBooksList.add(it);

		}

		try {
			magreader().forEach(e -> magBooksList.add((Magazines) e));
		} catch (IOException e) {
			MagBooks foc = new Magazines(201L, "Focus", LocalDate.of(2010, 07, 8), 32, "SETTIMANALE");
			magBooksList.add(foc);
		}
		;

		boolean con = true;

		while (con) {
			System.out.println("");
			for (int i = 0; i < magBooksList.size(); i++) {
				System.out.println(magBooksList.get(i).toString());
			}
			System.out.println("");
			System.out.println("Scegli un opzione (1-6) e premi invio o 0 per terminare l'applicazione:");
			System.out.println("1-Aggiungi Libro o Rivista");
			System.out.println("2-Rimuovi elemento tramite codice ID");
			System.out.println("3-Ricerca tramite ID");
			System.out.println("4-Ricerca per anno di pubblicazione");
			System.out.println("5-Ricerca per Autore");
			System.out.println("6-Salva su disco");
			int r = sc.nextInt();
			switch (r) {
			case 1:
				System.out.println("");
				System.out.println("");
				System.out.println("1-Per aggiungere un Libro");
				System.out.println("2-Per aggiungere una rivista");
				int g = sc.nextInt();
				sc.nextLine(); // fix bug nextline();
				if (g == 1) {
					System.out.println("inserisci Titolo:");
					String title = sc.nextLine();

					System.out.println("inserisci anno:");
					int datey = sc.nextInt();

					System.out.println("inserisci mese:");
					int datem = sc.nextInt();

					System.out.println("inserisci giorno:");
					int dateg = sc.nextInt();

					System.out.println("inserisci numero di pagine:");
					int pagnum = sc.nextInt();
					sc.nextLine(); // fix bug nextline();
					System.out.println("inserisci Autore:");
					String author = sc.nextLine();

					System.out.println("inserisci Genere:");
					String type = sc.nextLine();

					magBooksList.add(
							generateBook((magBooksList.size() + 1L), title, datey, datem, dateg, pagnum, author, type));

				} else if (g == 2) {
					System.out.println("inserisci Titolo:");
					String title = sc.nextLine();

					System.out.println("inserisci anno:");
					int datey = sc.nextInt();

					System.out.println("inserisci mese:");
					int datem = sc.nextInt();

					System.out.println("inserisci giorno:");
					int dateg = sc.nextInt();

					System.out.println("inserisci numero di pagine:");
					int pagnum = sc.nextInt();
					sc.nextLine(); // fix bug nextline();
					System.out.println("inserisci Periodicità:");
					String type = sc.nextLine();

					magBooksList.add(
							generateMagazine((magBooksList.size() + 1L), title, datey, datem, dateg, pagnum, type));

				} else {
					System.out.println("input errato riprova:");
					break;
				}
				break;

			case 2:
				System.out.println("inserisci cod ID per rimuovere elemento:");
				Long ids = sc.nextLong();

				for (int i = 0; i < magBooksList.size(); i++) {
					if (magBooksList.get(i).ISBN == ids) {
						magBooksList.remove(i);
					}
				}

				break;

			case 3:
				System.out.println("inserisci cod ID per la ricerca:");
				Long id = sc.nextLong();
				System.out.println(id);
				magBooksList.stream().filter(e -> e.getISBN() == id).forEach(e -> System.out.println(e.toString()));

				System.out.println("Premi 'invio' per continuare:");
				try {
					int read = System.in.read(new byte[2]);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;

			case 4:
				System.out.println("inserisci anno (es 2015):");
				int datey = sc.nextInt();

				magBooksList.stream().filter((ele) -> ele.year.getYear() == datey)
						.forEach(ele -> System.out.println(ele.toString()));

				System.out.println("Premi 'invio' per continuare:");
				try {
					int read = System.in.read(new byte[2]);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				break;

			case 5:
				System.out.println("inserisci nome autore:");
				sc.nextLine(); // fix bug nextline();
				String str = sc.nextLine();

				magBooksList.stream().filter(e -> e instanceof Books).map(e -> (Books) e).filter(e -> e.type == str)
						.forEach(ele -> System.out.println(ele));

				System.out.println("Premi 'invio' per continuare:");
				try {
					int read = System.in.read(new byte[2]);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				break;
			case 6:

				System.out.println("Dati salvati");
				for (int i = 0; i < magBooksList.size(); i++) {
					if (magBooksList.get(i) instanceof Books) {
						Books s = (Books) magBooksList.get(i);

						String strs = s.getISBN() + "#" + s.getTitle() + "#" + s.getYear() + "#" + s.getNumPages() + "#"
								+ s.getAuthor() + "#" + s.getType() + "*";
						ggs += strs;
						File file = new File("./Data/datiBooks.txt");

						try {
							FileUtils.writeStringToFile(file, ggs, "UTF-8");
						} catch (Exception e) {
							e.printStackTrace();
						}
					} else {
						Magazines s = (Magazines) magBooksList.get(i);

						String strs = s.getISBN() + "#" + s.getTitle() + "#" + s.getYear() + "#" + s.getNumPages() + "#"
								+ s.getPeriod() + "*";
						ggsMag += strs;
						File file = new File("./Data/datiMagazines.txt");
						try {
							FileUtils.writeStringToFile(file, ggsMag, "UTF-8");
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				}

				System.out.println("Dati salvati in Data/datiBooks");
				break;
			case 0:
				con = !con;
				break;

			default:
				System.out.println("input errato riprova:");
				break;
			}

		}
		sc.close();
	}

	private static List<Magazines> magreader() throws IOException {
		List<Magazines> ggs = new ArrayList<>();
		File datimag = new File("./Data/datiMagazines.txt");
		String readFile = FileUtils.readFileToString(datimag, "UTF-8");
		String[] splitMag = readFile.split("\\*");

		for (int i = 0; i < splitMag.length; i++) {
			String[] ff = splitMag[i].split("#");
			String[] r = ff[2].split("-");
			LocalDate data = LocalDate.of(Integer.parseInt(r[0]), Integer.parseInt(r[1]), Integer.parseInt(r[2]));

			MagBooks init = new Magazines(Long.parseLong(ff[0]), ff[1], data, Integer.parseInt(ff[3]), ff[4]);
			ggs.add((Magazines) init);
		}

		return ggs;
	}

	private static MagBooks generateBook(Long id, String title, int year, int month, int day, int pag, String author,
			String type) {
		LocalDate s = LocalDate.of(year, month, day);
		MagBooks g = new Books(id, title, s, pag, author, type);
		return g;
	}

	private static MagBooks generateMagazine(Long id, String title, int year, int month, int day, int pag,
			String type) {

		LocalDate s = LocalDate.of(year, month, day);
		MagBooks g = new Magazines(id, title, s, pag, type);
		return g;
	}

	public static List<Books> bookreader() throws IOException {
		List<Books> ggs = new ArrayList<>();
		File datimag = new File("./Data/datiBooks.txt");
		String readFile = FileUtils.readFileToString(datimag, "UTF-8");
		String[] splitMag = readFile.split("\\*");

		for (int i = 0; i < splitMag.length; i++) {

			String[] ff = splitMag[i].split("#");
			String[] r = ff[2].split("-");
			LocalDate data = LocalDate.of(Integer.parseInt(r[0]), Integer.parseInt(r[1]), Integer.parseInt(r[2]));

			MagBooks init = new Books(Long.parseLong(ff[0]), ff[1], data, Integer.parseInt(ff[3]), ff[4], ff[5]);
			ggs.add((Books) init);
		}

		return ggs;
	}

}

//MagBooks it = new Books(12L,"IT",LocalDate.of(2015, 10, 10),150,"Stephen","Horror");
//MagBooks shi = new Books(13L,"Shining",LocalDate.of(1977, 01, 28),200,"Stephen","Horror");
//MagBooks hp = new Books(14L,"Harry Potter e la pietra filosofale",LocalDate.of(1997, 06, 26),304,"J.K. Rowling","Fantasy");
//MagBooks hp1 = new Books(15L,"Harry Potter e il prigioniero di Azkaban",LocalDate.of(1999, 07, 8),300,"J.K. Rowling","Fantasy");
//MagBooks foc = new Magazines(201L,"Focus",LocalDate.of(2010, 07, 8),32,"SETTIMANALE");
//MagBooks set = new Magazines(202L,"La Settimana Enigmistica",LocalDate.of(2011, 07, 8),25,"SETTIMANALE");
//MagBooks stu = new Magazines(203L,"Ciak Magazine",LocalDate.of(2015, 07, 8),45,"MENSILE");

//magBooksList.add(it);
//magBooksList.add(shi);
//magBooksList.add(hp);
//magBooksList.add(hp1);
//magBooksList.add(foc);
//magBooksList.add(set);
//magBooksList.add(stu);
