import java.util.Arrays;
import java.util.Scanner;

public class objects {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String[] str = new String[4];
            for (int i = 0; i < str.length; i++) {
                str[i] = sc.nextLine();
                str[1] = "ritu"; // string at index 1 will be ritu
            }
            System.out.println(Arrays.toString(str));
        }

    }
}