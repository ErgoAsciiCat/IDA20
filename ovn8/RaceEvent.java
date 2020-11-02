import se.lth.cs.window.SimpleWindow;

public class RaceEvent {
    private final Participant[] t;
    private final RaceTrack track;
    private final SimpleWindow w;

    public RaceEvent(Participant[] t, RaceTrack track, SimpleWindow w) {
        this.t = t;
        this.track = track;
        this.w = w;
    }

    public void RaceStart() {

        // Put participants on starting line
        for (int i = 0; i < t.length; i++) {
            t[i].t.jumpTo((int) Math.round(w.getWidth() / 100.0 * (i * 15 + 30)), track.yStart);
            t[i].t.penDown();
        }

        //Race continues until any participant crosses the finish line participantY = yFinish
        while (finishLineCheck()) {
            for (Participant u : t) {
                u.step();
            }
            SimpleWindow.delay(100);
        }


    }

    private boolean finishLineCheck() {
        for (Participant u : t) {
            boolean check = u.t.getY() > track.yFinish;
            if (!check) {
                System.out.println("The " + u.getSpecies() + " won!");
                return false;
            }
        }
        return true;

    }

}
