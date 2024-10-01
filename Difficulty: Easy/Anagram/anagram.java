//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.stream.*;

class GFG {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String str = br.readLine();
            String s1 = str.split(" ")[0];
            String s2 = str.split(" ")[1];

            Solution obj = new Solution();

            if (obj.isAnagram(s1, s2)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean isAnagram(String a, String b) {

        // Your code here
        int n = a.length();
        int m = b.length();
        
        if(n != m) return false;
        
        char[] charArray = a.toCharArray();
        Arrays.sort(charArray);
        String sortedStr = new String(charArray);
        
        char[] charArray1 = b.toCharArray();
        Arrays.sort(charArray1);
        String sortedStr1 = new String(charArray1);
        
        if(sortedStr.equals(sortedStr1)){
             return true;
        }
        
        return false;
    }
}