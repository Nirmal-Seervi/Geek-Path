#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
def pair_sum(dict, N, arr, sum):
    for i in arr:
        if (sum - i in dict):
            if (sum - i == i):
                if (dict[i] > 1):
                    return True
            else:
                return True

    return False




#{ 
 # Driver Code Starts.
# Driver code
def main():
    
    # testcase input
    testcase = int(input())
    
    # looping through testcases
    while(testcase > 0):
        
        N = int(input())
        sum = int(input())
        dict = {}
        x = N
        arr = [int(i) for i in (input().split())]
        
        for i in arr:
            dict[i] = 0
                
        for i in arr:
            dict[i] +=1
    
        if pair_sum(dict, N, arr, sum) is True:
            print ("Yes")
        else:
            print ("No")
        
        testcase -= 1


if __name__ == '__main__':
    main()
# } Driver Code Ends