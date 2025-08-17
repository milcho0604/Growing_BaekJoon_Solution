# 산술평균 : N개의 수들의 합을 N으로 나눈 값
# 중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
# 최빈값 : N개의 수들 중 가장 많이 나타나는 값
# 범위 : N개의 수들 중 최댓값과 최솟값의 차이
import sys
input = sys.stdin.readline

def avg(n, arr):
    sum = 0
    
    for i in arr:
        sum += i
    mean = sum / n

    if mean >= 0:
        result = int(mean + 0.5)
    else:
        result = -int((-mean) + 0.5)
    return result

def mid(n, arr):
    temp = n//2

    return arr[temp]

def many(n, arr):
    manyNum = arr[0]
    maxCount = 0
    count = {}

    for i in arr:
        count[i] = count.get(i, 0) + 1

    maxCount = max(count.values())
    
    candidates = sorted([k for k, v in count.items() if v == maxCount])

    manyNum = candidates[1] if len(candidates) >= 2 else candidates[0]
    return manyNum


def rng(n, arr):
    min = arr[0]
    max = arr[n-1]
    result = max - min

    return result


n = int(input())
arr = [0]*n
for i in range(n):
    arr[i] = int(input())

sortedArr = sorted(arr)

print(avg(n, arr))
print(mid(n, sortedArr))
print(many(n, arr))
print(rng(n, sortedArr))