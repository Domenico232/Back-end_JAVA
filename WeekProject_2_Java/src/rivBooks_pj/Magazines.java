package rivBooks_pj;

import java.time.LocalDate;

public class Magazines extends MagBooks {
	String period;
	public Magazines(Long ISBN, String title, LocalDate year, int numPages, String period) {
		super(ISBN,title,year,numPages);
		this.period = period;
		
	}
	public String getPeriod() {
		return period;
	}
	public void setPeriod(String period) {
		this.period = period;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "ID:"+this.ISBN+" "+"Titolo:"+this.title+" "+this.year+" "+this.numPages+"pg"+" "+"Rilascio:"+this.period;
	}
	
}
