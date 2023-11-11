interface Printable {
    abstract void print();
}
interface Showable{
    abstract void show();
}
class Human implements Printable,Showable{
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Welcome");
    }

    public static void main(String[] args) {
        Human human = new Human();
        human.print();
        human.show();
    }
}