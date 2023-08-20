// package GFG_4_STRINGS;

// import java.util.Arrays;

// public class str_4_isomorphic {

//     static final int Char = 256;
//     static void iso(String str1, String str2){
//         char[] count1 = new char[Char];

//         char[] count2 = new char[Char];
//         char[] str11 = str1.toCharArray();
//         Arrays.sort(str11);
//         String str111 = new String(str11);

//         char[] str22 = str2.toCharArray();
//         Arrays.sort(str22);
//         String str222 = new String(str22);

//         for(int i = 0; i<str111.length(); i++ ){
//             count1[str111.charAt(i)]++;
//         }

//         for(int j = 0; j<str222.length(); j++ ){
//             count2[str222.charAt(j)]++;
//         }

//         if(count1 !=count2){
//             System.out.println("galat h");
//         }
//         else{
//             System.out.println("Sahi h");
//         }
        
//     }

//     // below is the correct code 
//     // public static boolean areIsomorphic(String str1,String str2)
//     // {
//     //     int n1 = str1.length();
//     //     int n2 = str2.length();
//     //     if(n1!=n2){
//     //         return false;
//     //     }
//     //  char [] c1 = new char[256];
//     //  char [] c2 = new char[256];
     
//     //  for(int i = 0;i<n1;i++){
//     //      char ch1 = str1.charAt(i);
//     //      char ch2 = str2.charAt(i);
         
//     //      if(c1[ch1]==0 && c2[ch2]==0){
//     //          c1[ch1]=ch2;
//     //          c2[ch2]=ch1;
//     //      }else if(c1[ch1]!=ch2){
//     //          return false;
//     //      }
//     //  }
//     // return true;
//     // }
//     public static void main(String[] args) {
//         String str1 = "aabcc";
//         String str2 = "aabcc";
//         // String str2 = "xyzzyz";
//         iso(str1, str2);
//     }
// }
