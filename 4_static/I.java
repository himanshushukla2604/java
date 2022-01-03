class Student{
    String name;
    int age;
    
    static int maxAge = 20;

    //class level method (static method)
    public static void main(String[] args){
        Student s1 = new Student();
        s1.name = "mohan";
        s1.age = 12;

        Student s2 = new Student();
        s2.name = "ganesh";
        s2.age = 15;

        s2.showInfo();

        showMaxAge();
    }

    //instance level method (non static method)
    void showInfo(){
        System.out.println("My Name is: " + name + " and My Age is: " + age);
    }

    static void showMaxAge(){
        System.out.println("Student Max Age: " + maxAge);
    }  
}










