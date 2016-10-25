/classpath lib/aplu5.jar
import ch.aplu.turtle.*;

class TurtleStar{
  Turtle t1=new Turtle();
  void drawStar(int size){
    for(int i=0;i<5;i++){
      t1.fd(size);
      t1.rt(144);
    }
  }
}
