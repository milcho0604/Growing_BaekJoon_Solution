
n, m = map(int, input().split())

arr1 = []
for i in range(n):
    row = list(map(int, input().split()))
    arr1.append(row)

arr2 = []
for i in range(n):
    row = list(map(int, input().split()))
    arr2.append(row)

result = []
for i in range(n):
    result.append([0] * m)

for i in range(n):
    for j in range(m):
        result[i][j] = arr1[i][j] + arr2[i][j]

for i in range(n):
    for j in range(m):
        print(result[i][j], end=" ")
    print()
