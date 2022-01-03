class P{
    public static void main(String[] args){
        P a = new P();

        System.out.println(a.r);  //NOT OK
        a.process();   //NOT OK
    }
}


class Q{
    int r = 89;

    void process(){
        System.out.println("Hello Mahoday");
    }
}