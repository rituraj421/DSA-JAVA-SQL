package leetcodeArray;

public class finalArray {
    public static void main(String[] args, String[] operations){
        int x = 0;
        String a = "++X";
        String b = "X++";
        for(String o : operations)
        {
            if(o.equals(a) || o.equals(b))
                x++;
            else
                x--;
        }
        return;
    }
}