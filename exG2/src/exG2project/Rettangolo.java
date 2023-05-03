package exG2project;

public class Rettangolo {
	public int lato1;
	public int lato2;
	
	public Rettangolo(int lato1, int lato2) {
		this.lato1 = lato1;
		this.lato2 = lato2;
	}
	
	public void AreaPer() {
		System.out.println("perimetro rettangolo: " + (lato1+lato2)*2);
		System.out.println("area: " + lato1*lato2 );
	}
	
	public void AreaPerdue(Rettangolo n, Rettangolo b) {
		
		int per1 = (n.lato1+n.lato2)*2;
		int area1 = (n.lato1*n.lato2);
		int per2 = (b.lato1+b.lato2)*2;
		int area2 = (b.lato1*b.lato2);
		
		System.out.println("perimetro rettangolo1 : " + per1);
		System.out.println("area: " + area1 );
		
		System.out.println("perimetro rettangolo 2: " + per2);
		System.out.println("area: " + area2 );
	}
}
