package HWM4.01;


public class Circle extends Figure{
    private int r;

    Circle(int radius){
        this.r = radius;
    }

    public int calculateArea(){
        return (int) (Math.PI*r*r/2);
    }
}
