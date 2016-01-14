package HWM4.01;


public class Triangle extends Figure{
    private int a, b, c, p;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        p = (a + b + c)/2;
    }

    public int calculateArea(){
        return (int)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
}
