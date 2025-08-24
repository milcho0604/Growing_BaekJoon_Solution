import sys

input = sys.stdin.readline

n = int(input().strip())
people = []
count = 0

for _ in range(n):
    a, b = input().split()
    people.append((a, b))

dancers = {'ChongChong'}
for a, b in people:
    if a in dancers or b in dancers:
        dancers.add(a)
        dancers.add(b)

print(len(dancers))


