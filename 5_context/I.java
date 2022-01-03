class I{

    int a = 90;

    void pro(){
        //class-name creates class context
        //a is an instance level variable
        //we can't access an inst. level var. through a class-context
        System.out.println(I.a);  //NOT OK
    }
}