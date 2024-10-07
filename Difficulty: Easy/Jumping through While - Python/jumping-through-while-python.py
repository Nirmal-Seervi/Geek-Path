#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
def printIncreasingPower(x):
    i = 1
    while i * i <= x:
        print(i * i, end=" ")
        i += 1


#{ 
 # Driver Code Starts.
# Driver Code
def main():
    
    # Testcase input
    testcases = int(input())
    
    # Looping through testcases
    while(testcases > 0):
        x = int(input())
        
        printIncreasingPower(x);
        print ()
        
        
        testcases -= 1
 
if __name__ == '__main__':
    main()
# } Driver Code Ends