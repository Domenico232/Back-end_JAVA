package rivBooks_pj;

import java.time.LocalDate;

public class MagBooks {
	Long ISBN;
	String title;
	LocalDate year;
	int numPages;
	
	public MagBooks(Long ISBN, String title, LocalDate year, int numPages) {
		this.ISBN = ISBN;
		this.title=title;
		this.year = year;
		this.numPages = numPages;
	}
	
	
	public Long getISBN() {
		return ISBN;
	}
	public void setISBN(Long iSBN) {
		this.ISBN = iSBN;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public LocalDate getYear() {
		return year;
	}
	public void setYear(LocalDate year) {
		this.year = year;
	}
	
	public int getNumPages() {
		return numPages;
	}
	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}
}
