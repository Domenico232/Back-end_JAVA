package playermaker;

public class Video extends MultimedialElement implements Visible, Reprodicible {

	private int durata;
	private int vol;
	private int lum;
	String times="";

	public Video(String title, int durata, int vol, int lum) {
		super(title);
		this.durata=(durata);
		this.vol=vol;
		this.lum=lum;
	}

	@Override
	public void aumentaLuminosita() {
		lum++;
		
	}

	@Override
	public void riduciLuminosita() {
		lum--;
	}

	@Override
	public void play() {
		for (int i = 0; i < this.vol; i++) {
			this.times += "!";
		}
		for (int i = 0; i < this.durata; i++) {
			System.out.println(this.title + this.times);
		}
		for (int i = 0; i < this.lum; i++) {
			System.out.println("*");
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