package GFG_10_STACK;

import java.util.Stack;

class myStack {
    int[] arr;
    int cap;
    int top;

    myStack(int c) {
        top = -1;
        cap = c;
        arr = new int[cap];
    }

    void push(int x) {
        if (top == cap - 1) {
            System.out.println("stack is full");
            return;
        }
        top++;
        arr[top] = x;
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        int res = arr[top];
        top--;
        return res;
    }

    int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        return arr[top];
    }

    int size() {
        return (top + 1);
    }

    boolean isEmpty() {
        return top == -1;
    }
}

public class sheet_1 {
    // balanced parinthesis
    static boolean isBalanced(String s){
        Stack<Character> st = new Stack<Character>();
        for(char c: s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }
            else{
                if(st.empty()){
                    return false;
                }
                else if(c == ')' && st.peek() != '('){
                    return false;
                }
                else if(c == ']' && st.peek() != '['){
                    return false;
                }
                else if(c == '}' && st.peek()!='{'){
                    return false;
                }
                else {
                    st.pop();
                }
            }
        }
        return st.empty();
    }

    // span
    static void span(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int count = 1;
            for(int j = i-1; j>=0 && arr[j] <=arr[i]; j--){
                count++;
            }
            System.out.print(count+" ");
        }
    }
    // previous greatest
    static void previousGreat(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int j;
            for(j = i-1; j>= 0; j--){
                if(arr[i]>arr[j]){
                    System.out.println(arr[j] +" ");
                    break;
                }
            }
            if(j == -1){
                System.out.println(-1 +" ");
            }
        }
    }
    public static void main(String[] args) {

        // myStack stak = new myStack(5);
        // stak.push(5);
        // stak.push(10);
        // stak.push(20);

        // // System.out.println(stak);
        // System.out.println(stak.pop());
        // System.out.println(stak.size());
        // System.out.println(stak.peek());
        // System.out.println(stak.isEmpty());

        // balanced parenthesis
        String s = "({}])";
        System.out.println(isBalanced(s));

        // span
        int[] arr = {13,15,12,14,16,8,6,4,10,30};
        // o/p 1 ,2,1,2,5,1,1,1,4,10
        // span(arr);

        // previous greatest
        previousGreat(arr);

    }
}
