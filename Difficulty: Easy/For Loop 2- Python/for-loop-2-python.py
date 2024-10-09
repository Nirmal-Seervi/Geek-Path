#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends
#User function Template for python3


def stringJumper(str):
    for i in range(0, len(str), 2):  # start at 0, go up to length of the string, and jump by 2
        print(str[i], end="")  # print character at even index without newline




#{ 
 # Driver Code Starts.



def main():
    testcases = int(input()) #testcases
    while(testcases>0):
        str = (input())
        stringJumper(str)
        print()##separating testcases outputs by newlines
        testcases -= 1
        


if __name__=='__main__':
    main()
# } Driver Code Ends