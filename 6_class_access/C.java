class M {
    public static void main(String[] args){
        N x = new N();  
        System.out.println(x.z);  //Access Through Instantiation
        x.pro();
        //To access the members of class N, 
        //we created an instance of class N 
        //and using that instance of class N 
        //we can access the members of clas N, in class M. 
    }    
}


class N {
    int z = 23;

    void pro(){
        System.out.println("Hello Ji");
    }
}