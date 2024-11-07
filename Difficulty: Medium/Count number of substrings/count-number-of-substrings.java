//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
            int k = sc.nextInt();
    		System.out.println (new Solution().substrCount (s, k));
        
System.out.println("~");
}
        
    }
}
// } Driver Code Ends


class Solution {
    private long countAtMostKDistinct(String S, int K) {
        int n = S.length();
        long count = 0;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        int left = 0;
        
        for (int right = 0; right < n; right++) {
            freqMap.put(S.charAt(right), freqMap.getOrDefault(S.charAt(right), 0) + 1);
            
            while (freqMap.size() > K) {
                freqMap.put(S.charAt(left), freqMap.get(S.charAt(left)) - 1);
                if (freqMap.get(S.charAt(left)) == 0) {
                    freqMap.remove(S.charAt(left));
                }
                left++;
            }
            
            count += (right - left + 1);
        }
        
        return count;
    }

    long substrCount(String S, int K) {
        return countAtMostKDistinct(S, K) - countAtMostKDistinct(S, K - 1);
    }
}
