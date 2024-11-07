//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine().trim());

        while (testCases-- > 0) {
            String[] str = br.readLine().trim().split(" ");
            int[] arr = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.parseInt(str[i]);
            }

            Solution ob = new Solution();
            List<Integer> result = ob.findSplit(arr);

            if (result.get(0) == -1 && result.get(1) == -1) {
                System.out.println("false");
            } else {
                System.out.println("true");
            }
            System.out.println("~");
        }
    }
}

// } Driver Code Ends


class Solution {
    
    public List<Integer> findSplit(int[] arr) {
        List<Integer> result = new ArrayList<>();
        
        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }
        
       
        if (totalSum % 3 != 0) {
            result.add(-1);
            result.add(-1);
            return result;
        }
        
        int targetSum = totalSum / 3;
        int currentSum = 0;
        int firstSplit = -1;
        int secondSplit = -1;
        int partsFound = 0;
        
        
        for (int i = 0; i < arr.length; i++) {
            currentSum += arr[i];
            
            if (currentSum == targetSum) {
                partsFound++;
                currentSum = 0;
                
                if (partsFound == 1) {
                    firstSplit = i;
                } else if (partsFound == 2) {
                    secondSplit = i;
                    break;
                }
            }
        }
        
        
        if (firstSplit != -1 && secondSplit != -1 && partsFound == 2) {
            result.add(firstSplit);
            result.add(secondSplit);
        } else {
            result.add(-1);
            result.add(-1);
        }
        
        return result;
    }
}