public class Sum {
    int i;
    int j;

    Sum(){
        i = 10;
        j = 20;
        System.out.println("Constructor calling 1st");
    }

    public static void main(String[] args) {
        Sum s = new Sum();
        System.out.println("values of :" + (s.i+s.j));


    }


}
