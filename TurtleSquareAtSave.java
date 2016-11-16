
import ch.aplu.turtle.*;

class TurtleSquareAtSave{
  void drawSquareAtSave(int size, double x, double y){
    Turtle t1=new Turtle();
    java.util.ArrayList<Double[]> posArr=new java.util.ArrayList<java.lang.Double[]>();
    t1.setPos(x,y);
    for (int i=0;i<4;i++){
        Double[] pos= new Double[2];
        pos[0]=t1.getX();
        pos[1]=t1.getY();
        posArr.add(pos);
        t1.fd(size);
        t1.rt(90);
    }

    for(Double[] p: posArr){
        System.out.printf("(%.1f,%.1f)",p[0],p[1]);
    }   
}
   public static void main(String[] args) {
       TurtleSquareAtSave draw=new TurtleSquareAtSave();
       draw.drawSquareAtSave(100,300.0,100.0);
    }
}
