import se.lth.cs.window.SimpleWindow;

public class Turtle {

  public int x;
  public int y;
  public SimpleWindow w;
  public double beta;

  /** skapar en sk�ldpadda som ritar i ritf�nstret w.
      Fr�n b�rjan befinner sig sk�ldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt upp�t i f�nstret, dvs i negativ y-riktning  
  */
  Turtle(SimpleWindow w, int xHome, int yHome) {
    this.w = w;
    this.x = xHome;
    this.y = yHome;
    this.beta = (Math.PI);
  }

  /** s�nker pennan */
  void penDown() {
    w.setLineWidth(5);
  }

  /** lyfter pennan */
  void penUp() {
    w.setLineWidth(0);
  }

  /** g�r rakt fram�t n pixlar i huvudets riktning */
  void forward(int n) {
    //X + beta + n Y + beta + n
  }

  /** vrider huvudet beta grader �t v�nster */
  void left(int beta) {
    //Vinkel -beta
  }

  /** vrider hvudet beta grader �t h�ger */
  void right(int beta) {
    //Vinkel +beta
  }

  /** g�r till punkten newX,newY utan att rita. 
      Pennans l�ge och huvudets riktning p�verkas inte */
  void jumpTo(int newX, int newY) {
    x = newX;
    y = newY;
  }

  /** �terst�ller huvudets riktning till den ursprungliga */
  void turnNorth() {
    //Vinkel = 0?
  }

  /** tar reda p� sk�ldpaddans aktuella x-koordinat */
  int getX() {
    return x;
  }

  /** tar reda p� sk�ldpaddans aktuella y-koordinat */
  int getY() {
    return y;
  }
}
