// Write a program that:
// 1) Counts from 1 to 50
// 2) Prints “Ping” when the current number is a multiple of 3
// 3) Prints “Pong” when the current number is a multiple of of 5

// Write a program to extract number from the string: “Hello5Bye”

// Write a program to find the biggest and the smallest number from an unsorted array
// [95, 42, 3, 7, 99, 42]

// import java.util.Arrays;

class test1 {
    public static void main(String[] args) {
        // for (int i = 1; i <= 50; i++) {
        // if (i % 3 == 0) {
        // System.out.println("Ping " + i);
        // } else if (i % 5 == 0) {
        // System.out.println("Pong " + i);
        // }
        // }

        // s.toCharArray();
        // // String sb = new String();
        // for(int i = 0; i<s.length(); i++){
            // if(s.charAt(i))
            // }

        int[] arr = { 95, 42, 3, 7, 99, 42 };

        int big = 0;
        int small = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= big) {
                big = arr[i];
            }
            if (arr[i] <= small) {
                small = arr[i];
            }
        }
        System.out.println("biggest number is " + big);
        System.out.println("smallest number is " + small);

        String str = "hello5bye";

        // Iterate through lowercase letters
        for (int j = 0; j < str.length(); j++) {
            char currentChar = str.charAt(j);

            // Check if the character is a digit
            if (Character.isDigit(currentChar)) {
                // Print the digit
                System.out.println(currentChar);
            }
        }

        // method 2
        
    }
}
