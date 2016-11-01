import ch.aplu.turtle.*;
class SwirlSquare{
Turtle t1=new Turtle();
void makeSwirlSquare(int size, int bigger, int turns, double degree){
int nBigger=2;
for (int i=0;i<turns;i++){
if (i%nBigger!=0){
size+=bigger;
}
t1.fd (size);
t1.rt(degree);
}
}
public static void main(String[] args){
SwirlSquare s= new SwirlSquare();
s.drawSwirlSquare(20,20,40,90);
}
}