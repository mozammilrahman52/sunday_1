public class B {
    private static B b;
    private B(){

    }
    public static B getB(){
        if(b == null){
            synchronized(B.class){
                if(b == null){
                    b = new B();
                }
            }
        }
        return b;
    }
    public static void main(String[] args){
        B b1 = getB();
        B b2 = getB();
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
