# 첫 줄에서 n, m을 함께 받기
n, m = map(int, input().split())

# arr1 입력
arr1 = []
for i in range(n):
    row = list(map(int, input().split()))
    arr1.append(row)

# arr2 입력
arr2 = []
for i in range(n):
    row = list(map(int, input().split()))
    arr2.append(row)

# 결과 배열 초기화 (n x m)
result = []
for i in range(n):
    result.append([0] * m)

# 원소별 합산
for i in range(n):
    for j in range(m):
        result[i][j] = arr1[i][j] + arr2[i][j]

# 출력 (행렬 형태)
for i in range(n):
    for j in range(m):
        print(result[i][j], end=" ")
    print()
