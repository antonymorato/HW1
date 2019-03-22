
import java.util.Scanner;

public class Main {
    public static  Scanner f = new Scanner(System.in);

    public static void task1(){

        System.out.print("Enter your binary number:");
        try {
            String input = f.next();
            int res = Integer.parseInt(input, 2);
            System.out.println(input+" -> "+res);
        }
        catch (NumberFormatException e) {
            System.out.println("Sorry, but it's not a binary :(");
        }
    }

    public static void task2(){
        System.out.println("Enter number to change:");
        int var=f.nextInt();
        var=~var +1;
        System.out.println(var);
    }

    public static int nod(int a, int b) {
        if (a == b)
            return a;
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if ((~a & 1) != 0) {
            if ((b & 1) != 0)
                return nod(a >> 1, b);
            else
                return nod(a >> 1, b >> 1) << 1;
        }
        if ((~b & 1) != 0)
            return nod(a, b >> 1);
        if (a > b)
            return nod((a - b) >> 1, b);
        return nod((b - a) >> 1, a);
    }

    public  static  void changeBit(int x, int n)
    {System.out.println("x="+x);
        x ^= 1 << n;
        System.out.println("x="+x);

    }
    public static void main(String[] args) {

        task1();
      //  task2();
        changeBit(6,2);
        changeBit(16,2);
//int var =-52;
        //var =~var+1;
        //int a=f.nextInt();
        //int b=f.nextInt();
        //int result=nod(Math.abs(a),Math.abs(b));
        //System.out.println("result:"+result);

        //var=var<<1;
        // var+=1;
        //  System.out.println("var:"+var);

    }
}


