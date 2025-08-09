import sys
from collections import deque

n = int(input())
queue = deque()
result = []

for _ in range(n):
    
    cmd = input().split()

    if cmd[0] == 'push':
        queue.append(int(cmd[1]))
    elif cmd[0] == 'pop':
        if queue:
            result.append(str(queue.popleft()))
        else:
            result.append('-1')
    elif cmd[0] == 'size':
        result.append(str(len(queue)))
    elif cmd[0] == 'empty':
        if queue:
            result.append('0')
        else:
            result.append(1)
    elif cmd[0] == 'front':
        if queue:
            result.append(str(queue[0]))
        else:
            result.append('-1')
    elif cmd[0] == 'back':
        if queue:
            result.append(str(queue[-1]))
        else:
            result.append('-1')

for i in range(len(result)):
    print(result[i])