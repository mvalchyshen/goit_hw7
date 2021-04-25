package main.java;

public class Shape {
    String name;

    public void print(Shape shape) {
        System.out.println(shape);
    }

    @Override
    public String toString() {
        return name;
    }
}
