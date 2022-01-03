class B{
    B(int a){
        System.out.println(a);
    }

    //compiler won't provide any constructor if the developer defined one inside the class.

    public static void main(String[] args){
        System.out.println("main method started");

        //new B();  //there is no default constructor there in our class, because we created one. 

        new B(23);
    }
}