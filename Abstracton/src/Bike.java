abstract class Bike {
    abstract void run();
    }

class Honda extends Bike{
    @Override
    void run() {
        System.out.println("Running Safely");
    }

    public static void main(String[] args) {
        Bike bike = new Honda();
        bike.run();
    }
}