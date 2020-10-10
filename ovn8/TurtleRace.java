import se.lth.cs.window.SimpleWindow;

public class TurtleRace {
    public static void main(String[] args){

        SimpleWindow w = new SimpleWindow(600,600,"RaceTrack");
        Turtle t1 = new Turtle(w,0,0);
        Turtle t2 = new Turtle(w,0,0);
        int yStart =  (int)Math.round(w.getHeight() /100.0  * 80);
        System.out.println (w.getHeight() + " Height and yStart = " + yStart);
        int yFinish =  (int)Math.round(w.getHeight() / 100.0 * 20);
        RaceTrack track = new RaceTrack(yStart,yFinish);
        track.draw(w);
        RaceEvent event = new RaceEvent(track,t1,t2,w);

        w.waitForMouseClick();
        System.out.println ("Start!");
        event.RaceStart();

    }
}
