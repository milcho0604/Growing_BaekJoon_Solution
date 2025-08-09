import sys
# n = int(input())

input = sys.stdin.readline
n = int(input().strip())
arr = [int(input()) for _ in range(n)]

arr.sort()

for i in range(len(arr)):
    print(arr[i])