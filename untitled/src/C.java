public final class C {
    private final int id;
    private C(int id){
        this.id = id;
    }
    public int getId(int id){
        return id;
    }

    public static void main(String[] args) {
        C c1 = new C(101);
        int var = c1.getId(101);
        System.out.println(var);
    }
}
