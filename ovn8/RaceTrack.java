import se.lth.cs.window.SimpleWindow;

public class RaceTrack {
    public int yStart;
    public int yFinish;

    public RaceTrack (int yStart, int yFinish){
        this.yStart = yStart;
        this.yFinish = yFinish;
    }

    private void draw (SimpleWindow w){
        w.moveTo((int)Math.round(100.0 / w.getWidth() * 33),yStart);
        w.lineTo((int)Math.round(100.0 / w.getWidth() * 66),yStart);
        w.moveTo((int)Math.round(100.0 / w.getWidth() * 33),yFinish);
        w.lineTo((int)Math.round(100.0 / w.getWidth() * 66),yFinish);
    }
}
