class A {
    private int x = 10;

    public int getX() {
        return x;
    }
}

public class Private {
    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.getX());
        System.out.println(obj.getX());
    }
}
