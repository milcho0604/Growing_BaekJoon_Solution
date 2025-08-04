def is_group_word(word):
    visited = set()
    before = ""

    for char in word:
        if char != before:
            if char not in visited:
                visited.add(char)
                before = char
            else:
                return False
    return True

n = int(input())
count = 0

for _ in range(n):
    word = input()
    if is_group_word(word):
        count += 1

print(count)
