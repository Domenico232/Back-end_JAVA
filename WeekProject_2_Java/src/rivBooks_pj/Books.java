package rivBooks_pj;

import java.time.LocalDate;

public class Books extends MagBooks {
	String author;
	String type;

	public Books(Long ISBN, String title, LocalDate year, int numPages, String author, String type) {
		super(ISBN,title,year,numPages);
		this.author = author;
		this.type = type;
		
	}
	
	
	public String getAuthor() {
		return author;
	}
	public String getType() {
		return type;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "ID:"+this.ISBN+" "+"Titolo:"+this.title+" "+this.year+" "+this.numPages+"pg"+" "+"Autore:"+this.author+" "+"Genere:"+this.type;
	}

}
