import sys

input = sys.stdin.readline

n = int(input())

arr = [0] * n

for i in range(n):
    arr[i] = int(input())

arr.sort()
for char in arr:
    print(char)