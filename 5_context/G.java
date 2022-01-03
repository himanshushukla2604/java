class G{
    static int y = 4;

    public static void main(String[] args){
        G g = new G();
        g.process();
    }

    void process(){
        System.out.println(G.y);
    }
}