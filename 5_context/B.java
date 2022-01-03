class B{
    //class level variable
    static int x = 78;

    //class level method(static method) creates class-context
    public static void main(String[] args){
        System.out.println(x);
        //we can call static members of the class from within the class-context
    }
}