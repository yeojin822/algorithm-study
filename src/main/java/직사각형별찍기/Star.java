package 직사각형별찍기;
import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String star = "*";
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < b ; i++) {
            System.out.println(star.repeat(a));
        }
    }
}
