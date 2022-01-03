class A{
	//instane level variable
    int x = 45;

	//static method creates class-context
    public static void main(String[] args){
        System.out.println(x); 
		//we can't access an instance level variable from within a class-context
    }
}

//error: non-static variable x cannot be referenced from a static context