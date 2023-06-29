package STACK;

public class stack3Dynamic extends stack2 {

    public stack3Dynamic() {
        super(); // it will call stack2
    }

    public stack3Dynamic(int size) {
        super(size); // it will call stack2 size
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            // double the array size
            int[] temp = new int[data.length * 2];

            // copy all the previous item in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        // insert item
        return super.push(item);
    }

    public static void main(String[] args) throws Exception {
        stack3Dynamic stack = new stack3Dynamic(5);

        stack.push(34);
        stack.push(45);
        stack.push(2);
        stack.push(9);
        stack.push(18);
        stack.push(23);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
