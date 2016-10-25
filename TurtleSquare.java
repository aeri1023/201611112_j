/classpath lib/aplu5.jar
import ch.aplu.turtle.*;

class TurtleSquare{
  Turtle t1=new Turtle();
  void drawSquare(int size){
    for(int i=0;i<4;i++){
      t1.fd(size);
      t1.rt(90);
    }
  }
}