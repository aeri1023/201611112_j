/classpath lib/aplu5.jar
import ch.aplu.turtle.*;
void drawTriangleorSquare(int size, int sides, double angle){
Turtle t1=new Turtle();
for (int i=0;i<sides;i++){
t1.fd(size);
t1.rt(angle);
}
}

enum Shape{TRIANGLE, SQUARE}
Shape sel=Shape.TRIANGLE;
int size=100;
int sides;
double angle;
switch (sel){
case TRIANGLE:
sides=3;
angle=120;
break;
case SQUARE:
sides=4;
angle=90;
break;
}
drawTriangleorSquare(size,sides,angle);