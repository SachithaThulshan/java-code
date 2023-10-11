public class Cars {
    String cars;

    Cars(String car){
        cars = car;
        System.out.println("brand : "+ cars);
    }

    public static void main(String[] args) {
        Cars bmw = new Cars("BMW");
        Cars benz = new Cars("Benz");
        Cars audi = new Cars("Audi");
        Cars mazda = new Cars("Mazda");
    }
}
