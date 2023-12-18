""" 집합 A, B에 대해 A-B과 B-A의 길이를 더 해주면 된다. A|B의 길이에서 A&B의 길이를 빼주는 방식도 된다. """
import sys
input = sys.stdin.readline

a, b = map(int, input().split())
aa = set(map(int,input().split()))
bb = set(map(int,input().split()))

print(len(aa-bb)+len(bb-aa))
