def ranking(people):
    ranks = [0] * len(people)

    for i in range(n):
        w_i, h_i = people[i]
        rank = 1
        for j in range(n):
            w_j, h_j = people[j]
            
            if i == j:
                continue

            if w_j > w_i and h_j > h_i:
                rank += 1
        ranks[i] = rank
    return ranks

n = int(input())

people = [tuple(map(int, input().split()))for _ in range(n)]

result = ranking(people)
print(*result)