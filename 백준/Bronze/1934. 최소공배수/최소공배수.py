import sys
T = int(input())

for i in range(T):
    a,b = map(int,sys.stdin.readline().split())
    aa,bb = a,b

    while bb!=0:
        aa=aa%bb
        aa,bb=bb,aa
    print(a*b//aa)

"""유클리드 호제법
두 숫자의 최소공배수는 (a*b)/ab의최대공약수"""
