package GFG_1_Bit;

public class gfg_2_5_ithDiffBit {
    static int diff(int n, int m){
        int ans = 0;
        for(int i = 1; i<n; i++){
            for(int j = 1; j<m; j++){
                if((i^j) == 1){
                    ans = i;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(diff(11, 9));
    }
}
