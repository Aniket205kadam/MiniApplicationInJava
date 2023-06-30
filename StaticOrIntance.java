public class StaticOrIntance {

    public static void main(String []args) {
    Alpha obj = new Alpha();

    Alpha obj1 = new Alpha();

    }
}

class Alpha {
    static int a;
    static int b;

    int m;
    int n;

    //static block
    static
    {
        System.out.println("Static block");
        a = 20;
        b = 30;
        disp(a, b);
    }

    //Non-static block
    {
        System.out.println("Non-static block");
        m = 40;
        n = 50;
        disp(m, n);
    }

    static public void disp(int a, int b) {
        System.out.println("Value is: " + a);
        System.out.println("Value is: " + b);
    }
}