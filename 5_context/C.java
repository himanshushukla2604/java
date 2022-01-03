class C{
    //instance level variable
    int x = 23;

    //static method creates class context
    public static void main(String[] args){
        C a = new C();
        System.out.println(a.x);        
        //the member is called using an obj-ref-var
        //object-ref-var creates instance context
        //you can call instance level and class level
        //members from within an instance context
    }
}