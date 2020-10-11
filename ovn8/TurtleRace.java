import se.lth.cs.window.SimpleWindow;

import java.util.Scanner;

public class TurtleRace {
    public static void main(String[] args){

        SimpleWindow w = new SimpleWindow(600,600,"RaceTrack");

        int yStart =  (int)Math.round(w.getHeight() /100.0  * 80);
        System.out.println (w.getHeight() + " Height and yStart = " + yStart);
        int yFinish =  (int)Math.round(w.getHeight() / 100.0 * 20);

        RaceTrack track = new RaceTrack(yStart,yFinish,w);
        track.draw();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter amount of participants (2-4):");
        int amount = scan.nextInt();
        Participant[] participants = new Participant[amount];
        for (int i = 0; i < amount ; i++){
            System.out.println("Select species, 0 for turtle, 1 for rabbit and 2 for wolf:");
            participants[i] = new Participant(scan.nextInt(),w);
        }


        RaceEvent event = new RaceEvent(participants,track,w);

        System.out.println ("Click on the window to start the race. Get ready...");
        w.waitForMouseClick();
        System.out.println ("Start!");
        event.RaceStart();

    }
}
