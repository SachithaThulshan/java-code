class World {
    private String name;
    private long age;
    private String color;

    public  String getName(){
        return name;
    }
    public long getAge(){
        return age;
    }
    public String getColor(){
        return color;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setAge(long age){
        this.age = age;
    }
    public void setColor(String color){
        this.color = color;
    }
}
class Test2  {
    public static void main(String[] args) {
        World world = new World();
        world.setName("Earth");
        world.setAge(4000000000000L);
        world.setColor("Blue");
        System.out.println("World Name is : " + world.getName());
        System.out.println("World Age is : " + world.getAge());
        System.out.println("World Color is : " + world.getColor());
    }
}
