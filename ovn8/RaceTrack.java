import se.lth.cs.window.SimpleWindow;

public class RaceTrack {
    public int yStart;
    public int yFinish;

    public RaceTrack (int yStart, int yFinish){
        this.yStart = yStart;
        this.yFinish = yFinish;
    }

    public void draw (SimpleWindow w){
        w.moveTo((int)Math.round(w.getWidth() /100.0  * 20),yStart);
        w.lineTo((int)Math.round(w.getWidth() / 100.0 * 80),yStart);
        w.moveTo((int)Math.round(w.getWidth() / 100.0 * 20),yFinish);
        w.lineTo((int)Math.round(w.getWidth() / 100.0 * 80),yFinish);
    }
}
