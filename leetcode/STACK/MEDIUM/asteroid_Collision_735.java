package leetcode.STACK.MEDIUM;

import java.util.Stack;

public class asteroid_Collision_735 {

    public static int[] asteroidCollision(int[] asteroid) {
        Stack<Integer> s1 = new Stack<>();

        for (int comet : asteroid) {
            if (comet > 0) {
                s1.push(comet);
            } 
            else {
                while (!s1.isEmpty() && s1.peek() > 0 && s1.peek() < -comet) {
                    s1.pop();
                }
            }
            if (!s1.isEmpty() && s1.peek() == -comet) {
                s1.pop();
            } 
            else if (s1.isEmpty() || s1.peek() < 0) {
                s1.push(comet);
            }
        }

        int[] result = new int[s1.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = s1.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        int[] asteroids = { 5, 10, -5 };
        int[] result1 = asteroidCollision(asteroids);
        System.out.println("Result 1: ");
        for (int asteroid : result1) {
            System.out.print(asteroid + " ");
        }
        System.out.println();
    }
}
