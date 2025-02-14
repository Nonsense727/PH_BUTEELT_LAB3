package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(2, 3);
        Shape shape2 = new Square(4);
        Shape shape3 = new Circle(5);

        Renderer renderer1 = new Renderer(shape1);
        Renderer renderer2 = new Renderer(shape2);
        Renderer renderer3 = new Renderer(shape3);

        renderer1.draw();
        renderer2.draw();
        renderer3.draw();
    }
}
