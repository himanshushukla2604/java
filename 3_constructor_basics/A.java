class A{
    //compiler provides a constructor inside your class 
    //if there is no constructor defined by the developer
    //that is why you are able to call the constructor at line 6.

    public static void main(String[] args){
        new A();    
        //you must use the new keyword along with a constructor to create an object(instance). 
        
        //new B();  //NOT OK
    }
}