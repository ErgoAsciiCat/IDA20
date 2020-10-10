import se.lth.cs.window.SimpleWindow;
import java.util.*;

public class RaceEvent {
    private Turtle t1;
    private Turtle t2;
    private RaceTrack track;
    private SimpleWindow w;

    public RaceEvent (RaceTrack track, Turtle t1, Turtle t2, SimpleWindow w) {
        this.track = track;
        this.t1 = t1;
        this.t2 = t2;
        this.w = w;
    }

    public void RaceStart (){
            Random rand = new Random();
            int t1Y = track.yStart;
            int t2Y = track.yStart;
            int t1X = (int)Math.round(w.getWidth() /100.0  * 40);
            int t2X = (int)Math.round(w.getWidth() /100.0 * 60);

            t1.jumpTo(t1X,t1Y);
            t2.jumpTo(t2X,t2Y);
            t1.penDown();
            t2.penDown();

            while (t1.getY() > track.yFinish && t2.getY() > track.yFinish){
                t1.forward(rand.nextInt(2)+1);
                System.out.println ("Turtle 1 is at position X: " + t1.getX() + " and Y: " + t1.getY());
                t2.forward(rand.nextInt(2)+1);
                System.out.println ("Turtle 2 is at position X: " + t2.getX() + " and Y: " + t2.getY());
                SimpleWindow.delay(100);
            }

            if (t1.getY() <= track.yFinish){
                System.out.println("Turtle nr.1 won!");
            }else if (t2.getY() <= track.yFinish){
                System.out.println("Turtle nr.2 won!");
            }

    }
}
