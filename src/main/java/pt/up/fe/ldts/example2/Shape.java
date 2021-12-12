package pt.up.fe.ldts.example2;

public abstract class Shape {
    private double x;
    private double y;

    public Shape(double x, double y) {
        this.setX(x);
        this.setY(y);
    }


    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw(GraphicFramework graphics);

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
