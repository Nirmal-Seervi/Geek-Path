#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends

def gfg(S):
   
    b = S.lower()
    
    
    if b.startswith('gfg') and b.endswith('gfg'):
        print("Yes")
    else:
        print("No")


#{ 
 # Driver Code Starts.
# Driver Code
def main():
    # testcase input
    testcases = int(input())
    
    # looping through testcases
    while(testcases > 0):
        S = input()
        
        testcases -= 1
        
        gfg(S)

        print("~")
if __name__ == '__main__':
    main()
# } Driver Code Ends