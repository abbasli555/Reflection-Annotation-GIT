package Task2;

public class Student {
    @Required
    private String name;

    @Required
    private String email;

    private int age;

    public Student(String name , int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;

    }

    public String getName() {
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getEmail(){
        return email;
    }
}
