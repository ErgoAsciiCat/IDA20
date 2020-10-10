import se.lth.cs.window.SimpleWindow;

public class TurtleRace {
    public static void main(String[] args){

        SimpleWindow w = new SimpleWindow(800,800,"RaceTrack");
        Turtle t1 = new Turtle(w,0,0);
        Turtle t2 = new Turtle(w,0,0);
        int yStart =  (int)Math.round(100.0 / w.getHeight() * 80);
        int yFinish =  (int)Math.round(100.0 / w.getHeight() * 20);
        RaceTrack track = new RaceTrack(yStart,yFinish);
        RaceEvent event = new RaceEvent(track,t1,t2,w);

        w.waitForMouseClick();
        event.RaceStart();

    }
}
