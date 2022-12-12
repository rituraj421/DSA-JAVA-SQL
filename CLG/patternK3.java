package CLG;

public class patternK3 {
    public static void main(String[] args) {
        for(int i =0; i<=4; i++){
            System.out.println();
            for(int j=i; j>=0; j--){
                System.out.print(" ");
            }
            // for(int j = i-1; j<=i; j++){
            //     System.out.println("8");
            // }
            for(int j = i; j<=4; j++){
                System.out.print("* ");
            }
        }
    }
}
