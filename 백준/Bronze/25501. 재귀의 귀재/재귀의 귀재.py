import sys
T = int(sys.stdin.readline())
for _ in range(T):
    string = sys.stdin.readline().rstrip()
    count=0
    def recursion(string, l, r):
        global count
        count+=1
        if l >= r: return 1
        elif string[l]!=string[r]: return 0
        else: return recursion(string, l+1, r-1)

    def isPalindrome(string):
        return recursion(string, 0, len(string)-1)
    print(isPalindrome(string), count)