// package PRACTICE.TCS;

// public class tcs_6_fitness {
//     static void fitness(int[][] arr){
//         int[] ans = arr[3];
//         for(int i = 0; i<3;i++){
//             for(int j = 0; j<3;j++){
//                 ans[i] += arr[i][j];

//             }
//             ans[i] = ans[i] / 3;
//         }
//         System.out.println(ans);
//     }
//     public static void main(String[] args) {
//         int[][] arr = new int[3][3];
//         arr[0][0] = (95);
//         arr[0][1] = (92);
//         arr[0][2] = (95);
//         arr[1][0] = (91);
//         arr[1][1] = (90);
//         arr[1][2] = (92);
//         arr[2][0] = (90);
//         arr[2][1] = (92);
//         arr[2][2] = (90);
//         // int[][] arr = {
//         //     {95, 92, 95},  // i[0]+j[0]+(i[1] + j[0]) + (i[2] + j[0]) / 3
//         //     {92, 90, 92},  // 
//         //     {90, 92, 92}
//         // };
//         // System.out.println(fitness(arr));
//         fitness(arr);

//     }
// }
