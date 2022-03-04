public class Three {

    public static void main(String[] args) {
        C1 c1 = new C1();
        c1.hello();
    }
}

class C1 {
    void hello() {
        System.out.println("Hello");
    }
}

//abstract final class C2 extends C1 {
//    @Override
//    void hello() {
//        System.out.println("Hi");
//    }
//}
