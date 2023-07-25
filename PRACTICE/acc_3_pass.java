package PRACTICE;

public class acc_3_pass {
    static int pass(String str) {
        // – At least 4 characters
        // – At least one numeric digit
        // – At Least one Capital Letter
        // – Must not have space or slash (/)
        // – Starting character must not be a number

        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ' || str.charAt(i) == '/') {
                return 0;
            }
            if ((str.charAt(0) >= '0' || str.charAt(0) <= '9') && (str.charAt(i) >= 'A'
                    || str.charAt(i) <= 'Z')
                    && (str.charAt(i) >= '0' || str.charAt(i) <= '9')) {
                count++;
            }

        }
        if(count>1){
            return 1;
        }
        else{
            return 0;
        }

    }

    public static void main(String[] args) {
        String str = "987abC012";
        System.out.println(pass(str));
    }
}
