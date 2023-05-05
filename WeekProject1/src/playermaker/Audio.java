package playermaker;

public class Audio extends MultimedialElement implements Reprodicible {

	private int durata;
	private int vol;
	String times="";

	public Audio(String title, int durata, int vol) {
		super(title);
		this.durata=(durata);
		this.vol=vol;
	}

	@Override
	public void play() {
		for (int i = 0; i < this.vol; i++) {
			this.times += "!";
		}
		for (int i = 0; i < this.durata; i++) {
			System.out.println(this.title + this.times);
		}
	}

	@Override
	public void aumentaVol() {
		vol++;
		
	}

	@Override
	public void riduciVol() {
		vol--;
		
	}

}
