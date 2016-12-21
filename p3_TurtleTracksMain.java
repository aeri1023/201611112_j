
import ch.aplu.turtle.*;

public class p3_TurtleTracksMain{
 static void drawSquareFrom(double[][]tracks){
   Turtle t1=new Turtle();
   t1.penUp();
   for(double[] t:tracks){
    t1.moveTo(t[0],t[1]);
    t1.penDown();
    //System.out.printf("(%.1f,%.1f)",t[0],t[1]);
   }
 }
 public static void main(String[] args){
   double[][]
   tracks={{-100,-100},{0,-100},{0,0},{-100,0},{-100,-100}};
   drawSquareFrom(tracks);
   }
}
