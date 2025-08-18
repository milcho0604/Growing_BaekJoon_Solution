import sys

for line in sys.stdin:
    line = line.rstrip('\n')
    lower = 0
    upper = 0
    num = 0
    space = 0
    for char in line:
        if char.islower():
            lower += 1
        elif char.isupper():
            upper += 1
        elif char.isdigit():
            num += 1
        elif char == ' ':
            space += 1
    print(lower, upper, num, space)