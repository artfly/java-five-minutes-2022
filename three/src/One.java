public class One {
    public static void test(A a) {
        a.hello();
    }

    public static void main(String[] args) {
        B b = new B();
        test(b);
    }
}

abstract class A {
    void hello() {
        System.out.println("Hello!");
    }
}

class B extends A {

}
