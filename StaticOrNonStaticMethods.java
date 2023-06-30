class Demo {
    static void disp1() {
        System.out.println("Static method");
    }

    void disp2() {
        System.out.println("Non-static method");
    }
}
public class StaticOrNonStaticMethods {
    public static void main(String []args) {
        Demo.disp1();

        Demo obj = new Demo();
        obj.disp2();
        obj.disp1();
    }
}
