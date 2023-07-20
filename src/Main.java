import java.util.Scanner;
public class Main {
    static int add(int a, int b) {
        return a + b;
    }
    static int sub(int a, int b) {
        return a - b;
    }
    static int mul(int a, int b) {
        return a * b;
    }
    static float div(float a, float b) {
        if (b==0)
            System.out.println("На нуль ділити не можна!");
        return a/b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введіть перше число:");
        int a = in.nextInt();
        System.out.println("Введіть арифметичний знак:");
        String sing = in.next();
        System.out.println("Введіть друге число");
        int b = in.nextInt();
        float sum;
    }
}