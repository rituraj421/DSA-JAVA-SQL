package CLG;
// import java.util.Scanner;

public class pr {

    // private static char[] movieMagic;
    public static String movieMagic(int i, String title, int j) {
        // int year,
        // String title,
        // float rating

        String result = i + " " + title + " " + j;
        System.out.println("Movie is " + result);
        return result;

    }

    public static String student(int roll, String name, int marks) {

        String result = roll + " " + name + " " + marks;
        System.out.println("Student details are :" + result);
        return result;
    }

    public static void main(String[] args) {

        movieMagic(2022, "Doctor G", 0);
        student(3, "darshan", 40);
        // student(0, null, 0)
        // System.out.println(movieMagic);
        // define a data named movie Magic with the following
        // System.out.println(result);
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter year of release :");
        // int year = sc.nextInt();
        // System.out.println("Enter title of movie :");
        // String title = sc.nextLine();
        // System.out.println("Enter movie rating ");
        // float rating = sc.nextFloat();
        // System.out.println(year+" " + title +" " + rating);
    }
}
