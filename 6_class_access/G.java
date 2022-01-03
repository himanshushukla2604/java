class Pen{
    void write(){
        System.out.println("writing...");
    }
}


class Student extends Pen {
    public static void main(String[] args){
        Student student = new Student();

        student.write();   //Access Through Inheritance
    }
}

//Student IS-A Pen