package playermaker;

public class Image extends MultimedialElement implements Visible {

	private int lum;

	public Image(String title, int lum) {
		super(title);
		this.lum=lum;
	}
	
	public void show() {
		System.out.println("Image name: "+title);
		System.out.println("Luminosity: " + this.lum);
		for (int i = 0; i < this.lum; i++) {
			System.out.println("*");
		}
	}

	@Override
	public void aumentaLuminosita() {
		lum++;
		
	}

	@Override
	public void riduciLuminosita() {
		lum--;
		
	}

}
