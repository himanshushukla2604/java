class E extends F{
    public static void main(String[] args){
        E a = new E();

        System.out.println(a.r);  // Access Through Inheritance
        a.process();   // OK

        //To access the members of class F, from within class E,
        //First of all we will declare that class F is the parent 
        //class of class E. Now we can access the members of 
        //parent class through the instance of child class object.
        //Class E inherited the member variable r and member method 
        //pro from it's parent class F.
        //Now you can access the inherited members using the child class object. 
    }
}


class F{
    int r = 89;

    void process(){
        System.out.println("Hello Mahoday");
    }
}