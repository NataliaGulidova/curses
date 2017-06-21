package Shape;

/**
 * Created by Admin on 21.06.2017.
 */
public class Rectangle extends Shape {
   private Point a;
    private Point b;
   private Point c;
   private Point d;

    public Rectangle(Point a, Point b, Point c, Point d) {
            this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public Point getA() {
        return a;
    }

    public void setA(Point a) {
        this.a = a;
    }

    public Point getB() {
        return b;
    }

    public void setB(Point b) {
        this.b = b;
    }

    public Point getC() {
        return c;
    }

    public void setC(Point c) {
        this.c = c;
    }

    public Point getD() {
        return d;
    }

    public void setD(Point d) {
        this.d = d;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                ", d=" + d +
                '}';
    }

    @Override
    public double getPerimetr() {
        return 2*(Point.getDist(a,b)+ Point.getDist(b,a));
    }

    @Override
    public double getArea() {
        return  Point.getDist(a,b)* Point.getDist(b,a);
    }
}

