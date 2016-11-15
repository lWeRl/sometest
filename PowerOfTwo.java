import java.util.Scanner;

/**
 * Created by lWeRl on 15.10.2016.
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            if (n == 0) break;
            System.out.println(((n & (n - 1))==0));
        }
    }
}
