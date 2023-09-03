public class patterns {
    //  right triangle pattern
    static void rightTriangle(int n){
        for(int i = 0; i<n; i++){
            for(int j = 1; j<n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("RIght tirangle , question 1");
        rightTriangle(5);
    }
}
