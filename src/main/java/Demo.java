package main.java;

public class Demo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.print(new Quad());
        shape.print(new Triangle());
        shape.print(new Qube());
        shape.print(new Circle());
        shape.print(new Sphere());
    }
}
