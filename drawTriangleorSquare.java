/classpath lib/aplu5.jar
import ch.aplu.turtle.*;

class DrawTriangleorSquare{
    static enum Shape {TRIANGLE, SQUARE};
    static Turtle t1=new Turtle();
    static void drawSquareOrTriangle(int size, int sides, double angle) {
        t1.home();
        t1.clear();
        for(int i=0;i<sides;i++) {
            t1.forward(size);
            t1.right(angle);
        }
    }
    public static void main(String[] args) {
        Shape sel=Shape.TRIANGLE;
        int size=100;
        int sides=0;
        double angle=0.0;
        switch(sel) {
          case TRIANGLE:
            sides=3;
            angle=120;
            break;
          case SQUARE:
            sides=4;
            angle=90;
            break;
        }
        drawSquareOrTriangle(100,sides,angle);
    }
}
