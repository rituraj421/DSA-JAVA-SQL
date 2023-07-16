package GFG;

public class lcm_Of_Two_Numbers1_6 {
    static int lcm(int a, int b){
        int res = Math.max(a, b);
        while(true){
            if(res%a == 0 && res%b == 0){
                // return res;
                break;
            }
            else{
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(lcm(7, 3));
        
    }
}
