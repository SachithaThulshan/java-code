class Shape {
    void draw(){
        System.out.println("Drawing"); //doesn't Run
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("Circle");
    }
}
class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("Rectangle");
    }
}
class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Triangle");
    }
}
class Test1 {
    public static void main(String[] args) {
        Shape s;
        s = new Circle();
        s.draw();
        s = new Rectangle();
        s.draw();
        s = new Triangle();
        s.draw();
    }
}