class Student{
    int age;
    String name;
    
    static int maxAge = 20;

    public static void main(String[] args){
        Student a = new Student();
        a.name = "Raghav";
        a.age = 12;

        Student b = new Student();
        b.name = "Ganesh";
        b.age = 17;

        System.out.println(b.age);
        System.out.println(a.name);
    }    
}