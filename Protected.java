class A {
    protected int x = 20;
}

public class Protected extends A {
    public static void main(String[] args) {
        Protected obj = new Protected();
        System.out.println(obj.x);
    }
}
