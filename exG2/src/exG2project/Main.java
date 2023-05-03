package exG2project;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rettangolo ret1 = new Rettangolo( 2, 4);
		Rettangolo ret2 = new Rettangolo( 5, 10);
		ret1.AreaPer();
		ret1.AreaPerdue(ret1, ret2);
		
		String[] call = new String[5];
		SimGene giacomo = new SimGene(235153434,43,call);

	}

}
