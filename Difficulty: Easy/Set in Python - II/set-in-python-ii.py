#{ 
 # Driver Code Starts
#Initial Template for Python 3

# } Driver Code Ends

def common_in_set(a, b):
    return a.intersection(b)
    

def diff(a, b):
    return a.difference(b)


def all_in_set(a, b):
    return a.union(b)
    
    
    
    

#{ 
 # Driver Code Starts.

# Driver code
def main():
    testcase = int(input())
    
    # looping through all testcases
    while testcase > 0:
        
        # taking input of set
        a = {int(x) for x in input().split()}
        b = {int(x) for x in input().split()}
        
        for x in all_in_set(a, b):
            print (x, end = ' ')
            
        print ()
        
        for x in common_in_set(a, b):
            print (x, end = ' ')
            
        print ()
        
        for x in diff(a, b):
            print (x, end = ' ')
        
        print ()
        
        testcase -= 1

if __name__ == '__main__':
    main()
# } Driver Code Ends