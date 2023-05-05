package playermaker;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		MultimedialElement[] element = new MultimedialElement[5];
		System.out.println("_____________________________MediaPlayer_________________________________");
		element[0] = new Image("bobby",5);
		element[1] = new Video("video1",5,5,1);
		element[2] = new Audio("audio2",2,4);
		element[3] = new Video("Video3",3,6,7);
		element[4] = new Image("Immagine1",4);
		
		Scanner input = new Scanner(System.in);
		boolean con = true;
		// "(elemento immagine o video).aumentaLuminosita() / elemento immagine o video .riduciLuminosita()" funzionanti
		// "(elemento video o audio).aumentaVol() / (elemento video o audio).riduciVol() funzionanti
		while (con) {
			for (int i = 0; i < element.length; i++) {
				System.out.println((i+1) + " " + element[i].title );
			}
			
			System.out.println("scegli numero da 1 a 5: ");
			int ch = input.nextInt();
			
			switch (ch) {
			case 1: 
				Image a = (Image)element[0];
				a.show();
				break;
			
			case 2: 
				Video b = (Video)element[1];
				b.play();
				break;
			
			case 3: 
				Audio c = (Audio)element[2];
				c.play();
				break;
			
			case 4: 
				Video g = (Video)element[3];
				g.play();
				break;
			
			case 5: 
				Image f = (Image)element[4];
				f.show();
				break;
			
			case 0:
				System.out.println("Player Chiuso");
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
		
	}
}

