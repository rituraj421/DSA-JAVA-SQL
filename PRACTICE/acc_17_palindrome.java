package PRACTICE;

public class acc_17_palindrome {
    static void pali(int n, int m){
        int res = 0;
        for(int i = n; i<=m;){
            while(i%10!=0){
                i= i/10;
                res += i;
                i++;
            }
        }
        System.out.println(res);
    }
    public static void main(String[] args) {
        pali(10, 20);
    }
}
