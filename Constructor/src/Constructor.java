public class Constructor {

    String name;

    Constructor() {
        System.out.println("Firstly run constructor");
         name = "programmer";
    }
    public static void main(String[] args) {
        Constructor sachitha = new Constructor();
        System.out.println("after this: " + sachitha.name);
    }
}
