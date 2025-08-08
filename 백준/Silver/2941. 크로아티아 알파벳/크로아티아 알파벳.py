st = input().strip()
count = 0
i = 0

# len은 길이 측정이 가능
for _ in range(len(st)):
    # i가 문자열 길이가 되면 break
    if i >= len(st):
        break

    if i < len(st)-1 and st[i] == 'c' and st[i+1] in ('=', '-'):
        i += 2
    elif st[i] == 'd' and i < len(st)-1:
        if i < len(st)-2 and st[i+1] == 'z' and st[i+2] == '=':
            i += 3
        elif i < len(st)-1 and st[i+1] == '-':
            i += 2
        else:
            i += 1
    elif i < len(st)-1 and st[i] == 'l' and st[i+1] == 'j':
        i += 2
    elif i < len(st)-1 and st[i] == 'n' and st[i+1] == 'j':
        i += 2
    elif i < len(st)-1 and st[i] == 's' and st[i+1] == '=':
        i += 2
    elif i < len(st)-1 and st[i] == 'z' and st[i+1] == '=':
        i += 2
    else:
        i += 1
    count += 1

print(count)