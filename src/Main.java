public class Main {
    public static void main(String[] args) {

    }
}

class Circle{
    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            this.radius = 0;
            return;
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }
}

class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height < 0) {
            this.height = 0;
            return;
        }
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return height * super.getArea();
    }
}