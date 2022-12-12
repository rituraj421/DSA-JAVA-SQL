package leetcodeArray;

public class decompressRLElist1331 {

    public static void main(String[] args) {
    
            //Initialize frequency
            // nums = [1,2,2,4]
            int freq = 0;
            for(int i=0; i<nums.length; i+=2){
                freq += nums[i];
            }
    
            int output[] = new int[freq]; //necessary size
    
            //now add the values into the array
            int currentIndex = 0;
            for(int i=1; i<nums.length; i+=2){ //get the value
                for(int j=0; j<nums[i-1]; j++){ // add it the number of times as the freq
                    output[currentIndex]=nums[i];
                    currentIndex++;
                }
            }
    
            return output;
        }
    
    
}
// these are just test cases
// you may find some difficulty on your compiler
