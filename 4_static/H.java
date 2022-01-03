class Circle{
    //instance level variable
    int radius;

    //class level variable
    static float pi = 3.14f;

    //class level method
    public static void main(String[] args){
        Circle c1 = new Circle();
        c1.radius = 10;

        Circle c2 = new Circle();
        c2.radius = 39; 
        
        defineCircle();
        c1.defineCircle();
        c2.defineCircle();
    }

    //class level method
    static void defineCircle(){
        System.out.println("A circle is a shape consisting of all points in a plane that are at a given distance from a given point");
    }
}