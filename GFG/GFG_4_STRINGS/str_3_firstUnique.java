package GFG_4_STRINGS;

public class str_3_firstUnique {
    static final int CHAR = 256;
    static char nonrepeatingCharacter(String S) {
        char[] non = new char[CHAR];
        char ans = '\0';
        for(int i = 0; i<S.length(); i++){
            non[S.charAt(i)]++;
        }
        for(int j = 0; j<CHAR; j++){
            if(non[S.charAt(j)]==1){
                ans=S.charAt(j);
            }
            else{
                return (char) -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String S = "yy";
        System.out.println(nonrepeatingCharacter(S));
    }
}
