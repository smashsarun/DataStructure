package sit.int320.recursion;

public class RecursionExample {

    public static void main(String[] args) {
        int x = 10;
        System.out.println("S(" + x + ")= " + sum(x));
        System.out.println(x + "!= " + fact(x));
        System.out.println("binary of 15 = "+ getBinary(15));
        System.out.println("binary of 20 = "+ getBinary(20));
    }

    private static int sum(int x) {
        if (x == 1) {
            return 1;
        }
        return sum(x - 1) + x;
    }

    private static int fact(int x) {
        if (x < 0) {
            throw new IllegalArgumentException();
        }
        if (x <= 1) {
            return 1;
        }
        return x * fact(x - 1);
    }

    public static String getBinary(int n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        if (n <= 1) {
            return "" + n;
        }
        return getBinary(n / 2) + (n % 2);
    }
}
