package PRACTICE.TCS;

public class tcs_9_cipher {
    static String code(String str){
        String ans = "";
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                ans+= str.charAt(i)+2;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "all";
        System.out.println(code(str));
    }
}
