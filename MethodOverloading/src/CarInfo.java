public class CarInfo {
    String color;
    String model;
    byte numberofdoors;
    short power;
    int price;
    int mileage;
    boolean isDamaged;
    CarInfo(){
        System.out.println("Car Descriptions ");
        System.out.println("-----------------------------------------");
    }
    CarInfo (String color,String model, byte numberofdoors, short power, int price, int mileage,boolean isDamaged ) {
        this.color = color;
        this.model = model;
        this.numberofdoors = numberofdoors;
        this.power = power;
        this.price = price;
        this.mileage = mileage;
        this.isDamaged = isDamaged;
    }
    public void getInfo(){
        System.out.println("A " + color + " Car");
        System.out.println("Car Model is " + model);
        System.out.println("Number of Doors " + numberofdoors);
        System.out.println("price $ "+ price);
        System.out.println("mileage "+ mileage);
        System.out.println("car is damaged: "+ isDamaged);
    }

    public static void main(String[] args) {
        CarInfo carInfo = new  CarInfo();
        CarInfo carInfo1 = new CarInfo("Black","Civic", (byte) 4, (short) 1500,19999,12051,true);
        carInfo1.getInfo();
    }

}
