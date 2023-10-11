public class programmingLangs {

    String languages;

    programmingLangs(){
        this.languages = "Java";
    }
    programmingLangs(String languages){
        this.languages = languages;
    }
    public void getname(){
        System.out.println("Programming Languages : " + this.languages);
    }
    public static void main(String[]args){
        programmingLangs pl =new programmingLangs();
        programmingLangs pl1 = new programmingLangs("python");
        pl.getname();
        pl1.getname();
    }
}
