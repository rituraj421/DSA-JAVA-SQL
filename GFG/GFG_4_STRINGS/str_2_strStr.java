package GFG_4_STRINGS;

public class str_2_strStr {
    static int strstr(String s, String x)
    {
       // Your code here
       for(int i = 0; i<s.length(); i++){
           if(s.contains(x)){
               return i;
           }
       }
       return -1;
    }
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        String  x = "For";
        System.out.println(strstr(s, x));
    }
}
