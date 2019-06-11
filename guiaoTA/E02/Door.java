
public class Door {

  // Declare necessary fields here...

   //constructs a new Door between two rooms.
    private int r1; //Identifier of a room.
    private int r2; //Identifiier of another room.  It cannot be the same as r1!
    private double w;  //Door width (in meters).  Must be positive.
    private double h;  //Door height (in meters).  Must be positive.

  public Door(int r1, int r2, double w, double h) {
    this.r1 = r1;
    this.r2 = r2;
    this.w  =  w;
    this.h = h;
  }


  public double area() {

    return w*h;
  }
}
