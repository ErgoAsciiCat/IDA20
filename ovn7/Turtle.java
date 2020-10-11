import se.lth.cs.window.SimpleWindow;

public class Turtle {

  public int x;
  public int y;
  private final SimpleWindow w;
  public double beta;
  public boolean penStatus;

  /** skapar en sk�ldpadda som ritar i ritf�nstret w.
      Fr�n b�rjan befinner sig sk�ldpaddan i punkten xHome,yHome med pennan 
      lyft och huvudet pekande rakt upp�t i f�nstret, dvs i negativ y-riktning  
  */
  Turtle(SimpleWindow w, int xHome, int yHome) {
    this.w = w;
    this.x = xHome;
    this.y = yHome;
    this.beta = (Math.PI)/2;
    this.penStatus = false;
    w.moveTo(x,y);
  }

  /** s�nker pennan */
  void penDown() { penStatus = true; }

  /** lyfter pennan */
  void penUp(){ penStatus = false; }

  /** g�r rakt fram�t n pixlar i huvudets riktning */
  void forward(int n) {
    w.moveTo(x, y);
    double newX = (x + (n * Math.cos(beta)));
    double newY = (y - (n * Math.sin(beta)));
    if (penStatus) w.lineTo((int) (Math.round(newX)), (int) (Math.round(newY)));
    x = w.getX();
    y = w.getY();

  }

  /** vrider huvudet beta grader �t v�nster */
  void left(int newBeta) {
    beta += Math.toRadians(newBeta);
  }

  /** vrider hvudet beta grader �t h�ger */
  void right(int newBeta) {
    beta -= Math.toRadians(newBeta);
  }

  /** g�r till punkten newX,newY utan att rita. 
      Pennans l�ge och huvudets riktning p�verkas inte */
  void jumpTo(int newX, int newY) {
    w.moveTo(newX,newY);
    x = w.getX();
    y = w.getY();
  }

  /** �terst�ller huvudets riktning till den ursprungliga */
  void turnNorth() { beta = Math.PI/2; }

  /** tar reda p� sk�ldpaddans aktuella x-koordinat */
  int getX() { return x; }

  /** tar reda p� sk�ldpaddans aktuella y-koordinat */
  int getY() { return y; }

  int getAngle() { return (int) Math.toDegrees(beta);}



}
