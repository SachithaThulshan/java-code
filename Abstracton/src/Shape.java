abstract class Shape {
    abstract void draw();
}

class  Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    public static void main(String[] args) {
        Shape shape = new Rectangle();
        Shape shape1 = new Triangle();
        shape.draw();
        shape1.draw();
    }
}