import se.lth.cs.window.SimpleWindow;

import java.awt.*;

public class RaceTrack {
    private final SimpleWindow w;
    public int yStart;
    public int yFinish;

    public RaceTrack (int yStart, int yFinish, SimpleWindow w){
        this.yStart = yStart;
        this.yFinish = yFinish;
        this.w = w;
    }

    public void draw (){
        this.finishFlag();
        this.raceBorder();
    }
    
    private void finishFlag (){
        boolean even = true;
        w.setLineWidth(10);
        for (int x = 0; x < (int) Math.round(w.getWidth() / 100.0 * 80) ; x += 10) {
        if (even) {
            w.setLineColor(Color.white);
        }
        else{
            w.setLineColor(Color.black);
        }
        w.moveTo((int) Math.round(w.getWidth() / 100.0 * 20)+x, yFinish - 10);
        w.lineTo((int) Math.round(w.getWidth() / 100.0 * 20)+x+10, yFinish - 10);
        if (even){
            w.setLineColor(Color.black);
        }
        else{
            w.setLineColor(Color.white);
        }
        w.moveTo((int) Math.round(w.getWidth() / 100.0 * 20)+x, yFinish);
        w.lineTo((int) Math.round(w.getWidth() / 100.0 * 20)+x+10, yFinish);
        even = !even;

        }
    }
    private void raceBorder (){
        w.setLineWidth(5);
        w.moveTo((int)Math.round(w.getWidth() / 100.0 * 20),yStart);
        w.lineTo((int)Math.round(w.getWidth() / 100.0 * 80),yStart);
        w.moveTo((int)Math.round(w.getWidth() / 100.0 * 20),yStart);
        w.lineTo((int)Math.round(w.getWidth() / 100.0 * 20),yFinish);
        w.moveTo((int)Math.round(w.getWidth() / 100.0 * 80),yStart);
        w.lineTo((int)Math.round(w.getWidth() / 100.0 * 80),yFinish);
        w.moveTo((int)Math.round(w.getWidth() /100.0  * 20),yStart + 20);
        w.writeText("Track: 1");
        w.moveTo((int)Math.round(w.getWidth() /100.0  * 50),yStart + 20);
        w.writeText("Track: 2");
        w.moveTo((int)Math.round(w.getWidth() /100.0  * 20),yFinish - 20);
        w.writeText("Bicentiannual Helsingborg Turtle Marathon Race");
        w.moveTo((int)Math.round(w.getWidth() /100.0  * 82),yStart);
        w.writeText("START");
        w.moveTo((int)Math.round(w.getWidth() /100.0  * 82),yFinish);
        w.writeText("FINISH");
    }
}
