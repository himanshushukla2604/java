class D{
	static int x = 100;

	public static void main(String[] args){
		D a = new D();
		System.out.println(a.x);
		//we can access a class level member from within an instance context
		//at compile time the compiler will place class-name in place 
		//of obj-ref-var, because the member is static.
		//a.x => D.x at line 6		
	}
}