class University {
    String name;
    void batch(){
        System.out.println("Batch 22");
    }
}
class Collage extends University {
    int grade;

    @Override
    void batch() {
        System.out.println("Grade 13 Batch");
    }
}
class Test1 {
    public static void main(String[] args) {
        University university = new Collage();
        university.name = "UoVT";
        Collage collage = (Collage) university;
        collage.grade = 13;
        System.out.println(collage.name);
        System.out.println(collage.grade);
        collage.batch();
    }
}