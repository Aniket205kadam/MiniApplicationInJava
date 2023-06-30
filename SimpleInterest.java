import java.util.Scanner;

class Calculates {
    int pa;
    float td;
    static float ri;
     float si;

    static
    {
        ri = 4.5f;
    }

     void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the amount required: ");
        pa = sc.nextInt();
        System.out.println("Please enter time duration: ");
        td = sc.nextFloat();
    }

    void findsimpleInterest() {
        si = (pa * td * ri) / 100f;
    }

    void disp() {
        System.out.println("Simple Interest is: " + si);
    }
}
public class SimpleInterest {
    public static void main(String []args) {
       Calculates obj1 = new Calculates();
       obj1.input();
       obj1.findsimpleInterest();
       obj1.disp();

       Calculates obj2 = new Calculates();
       obj2.input();
       obj2.findsimpleInterest();
       obj2.disp();
    }
}
