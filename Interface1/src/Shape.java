interface Shape {
    void getArea();
    default void getSides(){
        System.out.println("Slide of this Shape");
    }
}
class  Rectangle implements Shape {
    @Override
    public void getArea() {
        int length = 10;
        int width = 15;
        int area = length * width;
        System.out.println("Area of Rectangle : " + area);

    }

    @Override
    public void getSides() {
        System.out.println("I have 2 sides");
    }
}
class Square implements Shape{
    @Override
    public void getArea() {
        int length = 20;
        int area = length * length;
        System.out.println(" Area of Square :" + area);
    }
}