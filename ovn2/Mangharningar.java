//import se.lth.cs.p.ovn.turtle.Turtle;
import se.lth.cs.window.SimpleWindow;
import java.util.Scanner;
public class Mangharningar {

		public static void Horning(Turtle t, int n, int sida){
			
			t.penDown();//s�kerst�ll att turtles nuvarande tillst�nd �r korrekt
			t.turnNorth();
			
			for (int k = 0; k <= n; k++) {
				t.forward(sida);
				t.left(360/n);
			}

			t.turnNorth();
			t.penUp(); // �terst�ll turtle
		}
		public static void main(String[] args){
			/* Deklaration av variabler, scanner, SW och turtle. 
			 * M�let �r att rita en m�ngh�rning med n antal sidor 
			 * d�r den inre vinkeln �r 360/n mellan varje sida.*/
			SimpleWindow w=new SimpleWindow(800,800,"Ruta");
			Turtle t = new Turtle(w,400,400);
			Scanner scan = new Scanner(System.in);
			int n = 1, sida = 0, posX = 0, posY = 0;
		
				System.out.print("Ange antal sidor på din månghörning: ");
				n = scan.nextInt();
				System.out.print("Ange längden på sidorna av din månghörning: ");
				sida = scan.nextInt();
				
				Horning(t,n,sida);
			
			
			
		}

}
