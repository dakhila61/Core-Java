public class Student {
    private String name = "Akhila";

    private String getName(){
        return name;
    }
    public static void main(String[] args){
        Student student1 = new Student();
        System.out.println("Name is "+student1.getName());
    }
}
