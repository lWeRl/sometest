import java.util.Scanner;

/**
 * Created by lWeRl on 15.10.2016.
 */
public class DecTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Bin: "+toBin(n));
        System.out.println("Oct: "+toOct(n));
        System.out.println("Hex: "+toHex(n));
    }

    static String toBin(int n) {
        if (n < 2) return Integer.toString(n);
        return toBin(n / 2) + n % 2;
    }

    static String toOct(int n) {
        if (n < 8) return Integer.toString(n);
        return toOct(n / 8) + n % 8;
    }

    static String hexChar(int n) {
        if (n < 10) return Integer.toString(n);
        return (n == 10) ? "A" : (n == 11) ? "B" : (n == 12) ? "C" : (n == 13) ? "D" : (n == 14) ? "E" : "F";
    }

    static String toHex(int n) {
        if (n < 16) return hexChar(n);
        return toHex(n / 16) + hexChar(n % 16);
    }
}

