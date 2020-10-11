import se.lth.cs.window.SimpleWindow;

import java.awt.*;
import java.util.Random;
public class Participant {
    Turtle t;
    int species;
    SimpleWindow w;

    public Participant (int species, SimpleWindow w){
        this.t = new Turtle(w,0,0);
        this.species = species;
        this.w = w;
    }

    public String getSpecies() {
        if (species == 0) return "turtle";
        else if (species == 1) return "rabbit";
        else if (species == 2) return "wolf";

        return "unknown";
    }

    public void step (){
        Random rand = new Random();

        if (species == 0) {
            //Turtle Step
            w.setLineColor(Color.green);
            t.forward(rand.nextInt(5)+10);

            if (t.beta<((2*Math.PI)/3) && t.beta > Math.PI/6){
                t.right(rand.nextInt(10)-5);
            }else if (t.beta>=((2*Math.PI)/3) ) {
                t.right(50);
            }else if (t.beta <= Math.PI/6) {
                t.left(50);
            }

        } else if (species == 1){
            //Rabbit Step
            w.setLineColor(Color.pink);
            t.forward(rand.nextInt(30));

        } else if (species == 2){
            //Wolf Step
            w.setLineColor(Color.lightGray);
            if (t.getY()%10 == 0)  t.right(2);
            if (t.getY()%5 == 0)  t.left(2);
            t.forward(rand.nextInt(20)+5);

        }else {

            t.forward(1);
        }
    }

}
