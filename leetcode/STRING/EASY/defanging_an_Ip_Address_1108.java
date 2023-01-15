package leetcode.STRING.EASY;

public class defanging_an_Ip_Address_1108 {
    /*
     * Given a valid (IPv4) IP address, return a defanged version of that IP
     * address.
     * 
     * A defanged IP address replaces every period "." with "[.]".
     * 
     * Example 1:
     * 
     * Input: address = "1.1.1.1"
     * Output: "1[.]1[.]1[.]1"
     */

    class Solution {
        public String defangIPaddr(String address) {
            return address.replace(".", "[.]");
        }
    }
}